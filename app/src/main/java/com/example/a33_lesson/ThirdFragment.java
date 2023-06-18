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


public class ThirdFragment extends Fragment {
    private Button goTo2;
    private Button goTo1;
    private RecyclerView recyclerView;
    private ArrayList<String> carList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_3);
        loadData();
        ThirdAdapter thirdAdapter = new ThirdAdapter(carList);
        recyclerView.setAdapter(thirdAdapter);
        goTo1 = requireActivity().findViewById(R.id.goto1);
        goTo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new FirstFragment()).commit();
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
        carList.add("ВОСТОЧНАЯ КОНФЕРЕНЦИЯ");
        carList.add("Бакс");
        carList.add("Селтикс");
        carList.add("Севенти Сиксерс");
        carList.add("Кавальерс");
        carList.add("Никс");
        carList.add("Нетс");
        carList.add("Булз");
    }

}