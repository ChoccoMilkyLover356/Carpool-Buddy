package com.example.carpoolbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class AddVehicleActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private FirebaseFirestore firestore;
    private LinearLayout layout;
    private EditText ownerField;
    private EditText modelField;
    private EditText capacityField;
    private EditText basePriceField;
    private EditText rangeField;
    private EditText speedField;
    private EditText weightField;
    private EditText altitudeField;
    private EditText airspeedField;
    private EditText sizeField;
    private Spinner vehicleTypeSpinner;
    private String selectedType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicle);
        mAuth = FirebaseAuth.getInstance();
        firestore = FirebaseFirestore.getInstance();
        layout = findViewById(R.id.linearLayoutAddVehicle);
        vehicleTypeSpinner = findViewById(R.id.spinner);
        setupSpinner();
    }

    private void setupSpinner() {
        String[] vehicleTypes = {"Car", "Boat", "Bus", "Helicopter"};
        // add user types to spinner
        ArrayAdapter<String> langArrAdapter = new ArrayAdapter<String>(AddVehicleActivity.this,
                android.R.layout.simple_spinner_item, vehicleTypes);
        langArrAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vehicleTypeSpinner.setAdapter(langArrAdapter);

        //triggered whenever user selects something different
        vehicleTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedType = parent.getItemAtPosition(position).toString();
                addFields();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    public void addFields() {
        commonFields();
        if(selectedType.equals("Car")) {
            rangeField = new EditText(this);
            rangeField.setHint("Range");
            layout.addView(rangeField);
        }
        else if(selectedType.equals("Boat")) {
            speedField = new EditText(this);
            speedField.setHint("Speed");
            layout.addView(speedField);
            weightField = new EditText(this);
            weightField.setHint("Weight");
            layout.addView(weightField);
        }
        else if(selectedType.equals("Helicopter")){
            altitudeField = new EditText(this);
            altitudeField.setHint("Altitude");
            layout.addView(altitudeField);
            airspeedField = new EditText(this);
            airspeedField.setHint("Air Speed");
            layout.addView(airspeedField);
        }
        else if (selectedType.equals("Bus")){
            sizeField = new EditText(this);
            sizeField.setHint("Size");
            layout.addView(sizeField);
        }
    }

    public void commonFields() {
        layout.removeAllViewsInLayout();
        ownerField = new EditText(this);
        ownerField.setHint("Owner");
        layout.addView(ownerField);
        modelField = new EditText(this);
        modelField.setHint("Model");
        layout.addView(modelField);
        basePriceField = new EditText(this);
        basePriceField.setHint("Base Price");
        layout.addView(basePriceField);
        capacityField = new EditText(this);
        capacityField.setHint("Capacity");
        layout.addView(capacityField);
    }

    public void createVehicle(View v) {
        //generate + get new key
        DocumentReference newRideRef = firestore.collection("Vehicles").document();
        String vehicleId = newRideRef.getId();

        //make new vehicle according to selected vehicle type
        Vehicle newVehicle = null;

        //get data from form
        String ownerString = ownerField.getText().toString();
        String modelString = modelField.getText().toString();
        double basePriceDouble = Double.parseDouble(basePriceField.getText().toString());
        ArrayList<String> ridersUIDs = new ArrayList<>();

        //check which type of vehicle was created
        if(selectedType.equals("Car")) {
            int capacityInt = Integer.parseInt(capacityField.getText().toString());
            int rangeInt = Integer.parseInt(rangeField.getText().toString());
            newVehicle = new Car(rangeInt, ownerString, modelString, capacityInt, vehicleId, basePriceDouble, ridersUIDs, true, "Car");
        }
        else if(selectedType.equals("Boat")) {
            int capacityInt = Integer.parseInt(capacityField.getText().toString());
            int speedInt = Integer.parseInt(speedField.getText().toString());
            int weightInt = Integer.parseInt(weightField.getText().toString());
            newVehicle = new Boat(speedInt, weightInt, ownerString, modelString, capacityInt, vehicleId, basePriceDouble, ridersUIDs, true, "Car");
        }
        else if(selectedType.equals("Helicopter")) {
            int altitudeInt = Integer.parseInt(altitudeField.getText().toString());
            int airSpeedInt = Integer.parseInt(airspeedField.getText().toString());
            newVehicle = new Helicopter(altitudeInt, airSpeedInt, ownerString, modelString, 2, vehicleId, basePriceDouble, ridersUIDs, true, "Helicopter");
        }
        else if(selectedType.equals("Bus")) {
            int capacityInt = Integer.parseInt(capacityField.getText().toString());
            int sizeInt = Integer.parseInt(sizeField.getText().toString());
            newVehicle = new Bus(sizeInt,ownerString, modelString, capacityInt, vehicleId, basePriceDouble, ridersUIDs, true, "Bus");
        }

        //add the new vehicle to the database
        newRideRef.set(newVehicle);
    }
}