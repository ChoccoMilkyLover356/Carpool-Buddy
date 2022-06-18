package com.example.carpoolbuddy;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.carpoolbuddy.R;

public class VehicleInfoHolder extends RecyclerView.ViewHolder{


        protected TextView owner;
        protected TextView model;
        protected TextView vehicleType;
        protected TextView basePrice;

    public VehicleInfoHolder(@NonNull View itemview )
        {
            super(itemview);
            owner = itemview.findViewById(R.id.owner);
            model = itemview.findViewById(R.id.model);
            vehicleType = itemview.findViewById(R.id.vehicleType);
            basePrice = itemview.findViewById(R.id.basePrice);

        }
    }