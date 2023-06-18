package com.example.a33_lesson;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SecondViewHolder extends RecyclerView.ViewHolder {

    private TextView tvTest;
    public SecondViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTest = itemView.findViewById(R.id.tv_test);
    }
    public void bind(String firstName){
        tvTest.setText(firstName);
    }
}
