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


public class FirstFragment extends Fragment {
    private Button goTo3;
    private Button goTo2;
    private RecyclerView recyclerView;
    private ArrayList<String> carList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_1);
        loadData();
        FirstAdapter firstAdapter = new FirstAdapter(carList);
        recyclerView.setAdapter(firstAdapter);
        goTo3 = requireActivity().findViewById(R.id.goto3);
        goTo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new ThirdFragment()).commit();
            }
        });
        goTo2 = requireActivity().findViewById(R.id.goto2);
        goTo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new SecondFragment()).commit();
            }
        });

    }
    private void loadData() {
        carList.add("ЧЕМПИОНЫ ПОСЛЕДНИЕ 10 ЛЕТ");
        carList.add("Наггетс (2023)");
        carList.add("Уорриорз (2022)");
        carList.add("Бакс (2021)");
        carList.add("Лейкерс (2020)");
        carList.add("Рэпторс (2019)");
        carList.add("Уорриорз (2018)");
        carList.add("Уорриорз (2017)");
        carList.add("Кавальерс (2016)");
        carList.add("Уорриорз (2015)");
        carList.add("Сперс (2014)");
        carList.add("Майами Хит (2013)");
    }
}