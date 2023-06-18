package com.example.a33_lesson;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createFragment(R.id.container,new FirstFragment());


    }

    private void createFragment(@IdRes int container, Fragment fragment){
        getSupportFragmentManager().beginTransaction().add(container,fragment).commit();
    }
}