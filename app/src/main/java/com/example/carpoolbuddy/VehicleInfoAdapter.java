package com.example.carpoolbuddy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VehicleInfoAdapter extends RecyclerView.Adapter<VehicleInfoHolder> {

    ArrayList<Vehicle> nameData;


    public VehicleInfoAdapter(ArrayList<Vehicle> data){
      nameData = data;
    }

    @NonNull
    @Override
    public VehicleInfoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vehicle_item, parent, false);

        VehicleInfoHolder holder = new VehicleInfoHolder(myView);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleInfoHolder holder, int position) {
        holder.owner.setText(nameData.get(position).getOwner());
        holder.model.setText(nameData.get(position).getModel());
        //holder.basePrice.setText(nameData.get(position).getBasePrice());
        holder.vehicleType.setText(nameData.get(position).getVehicleType());

    }

    @Override
    public int getItemCount() {
        return nameData.size();
    }

    public interface OnNoteLitener{
        void onNoteClick(int potition);
    }
}
