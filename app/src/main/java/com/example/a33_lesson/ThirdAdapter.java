package com.example.a33_lesson;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ThirdAdapter extends RecyclerView.Adapter<ThirdViewHolder> {

    private ArrayList<String> carList;

    public ThirdAdapter(ArrayList<String> carList) {
        this.carList = carList;
    }

    @NonNull
    @Override
    public ThirdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ThirdViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ThirdViewHolder holder, int position) {
        holder.bind(carList.get(position));
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}
