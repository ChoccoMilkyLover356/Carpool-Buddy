package com.example.carpoolbuddy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VehicleInfoAdapter extends RecyclerView.Adapter<VehicleInfoHolder> {

    //ArrayList<MenuItem> nameData;

    //public VehicleInfoAdapter(ArrayList<MenuItem> data){
    //   nameData = data;
    //}

    @NonNull
    @Override
    public VehicleInfoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_vehicles_info, parent, false);

        VehicleInfoHolder holder = new VehicleInfoHolder(myView);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleInfoHolder holder, int position) {
        //holder.nameText.setText(nameData.get(position).getName());
    }

    @Override
    public int getItemCount() {
        //return nameData.size();
        return 0;
    }
}
