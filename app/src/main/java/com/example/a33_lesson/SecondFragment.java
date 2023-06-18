package com.example.a33_lesson;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private Button goTo3;
    private Button goTo1;
    private RecyclerView recyclerView;
    private ArrayList<String> carList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_2);
        loadData();
        SecondAdapter secondAdapter = new SecondAdapter(carList);
        recyclerView.setAdapter(secondAdapter);
        goTo3 = requireActivity().findViewById(R.id.goto3);
        goTo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new ThirdFragment()).commit();
            }
        });
        goTo1 = requireActivity().findViewById(R.id.goto1);
        goTo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new FirstFragment()).commit();
            }
        });

    }
    private void loadData() {
        carList.add("ЗАПАДНАЯ КОНФЕРЕНЦИЯ");
        carList.add("Наггетс (чемпионы)");
        carList.add("Гриззлис");
        carList.add("Сакраменто");
        carList.add("Финикс");
        carList.add("Уорриорз");
        carList.add("Лейкерс");
        carList.add("Маверикс");
    }
}