package com.example.carpoolbuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import com.example.carpoolbuddy.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Arrays;

public class VehicleInfoActivity extends AppCompatActivity implements VehicleInfoAdapter.OnNoteLitener {
    private FirebaseAuth mAuth;
    private FirebaseFirestore firestore;

    //added for testing
    private ArrayList<Vehicle> vehiclesList;
    protected RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles_info);
        mAuth = FirebaseAuth.getInstance();
        firestore = FirebaseFirestore.getInstance();
        recView = findViewById(R.id.Rec);
        vehiclesList = new ArrayList<Vehicle>();
        testDB();



    }


    public void testDB() {

        TaskCompletionSource<String> getAllRidesTask = new TaskCompletionSource<>();
        firestore.collection("Vehicles").whereEqualTo("open", true)
                .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful() && task.getResult() != null) {
                    for (QueryDocumentSnapshot document : task.getResult()) {
                        vehiclesList.add(document.toObject(Vehicle.class));
                    }
                    getAllRidesTask.setResult(null);
                }
                else {
                    Log.d("VehiclesInfoActivity", "Error getting documents from db: ", task.getException());
                }
            }
        });
        // when all rides have been retrieved, update RecyclerView
        getAllRidesTask.getTask().addOnCompleteListener(new OnCompleteListener<String>() {
            @Override
            public void onComplete(@NonNull Task<String> task) {
                System.out.println("VEHICLE INFO: " + vehiclesList.toString());
                VehicleInfoAdapter myAdapter = new VehicleInfoAdapter(vehiclesList);
                recView.setAdapter(myAdapter);
                recView.setLayoutManager(new LinearLayoutManager(VehicleInfoActivity.this));

            }
        });
    }

    public void gotoUserProfile(View v) {
        Intent intent = new Intent(this, UserProfileActivity.class);
        startActivity(intent);
    }

    @Override
    public void onNoteClick(int potition) {
        vehiclesList.get(potition);
    Intent intent = new Intent(this, NewActivity.Java);
        startActivity(intent);
    }
}
