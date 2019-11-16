package com.fluxit.desafiotecnicoandroid.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.fluxit.desafiotecnicoandroid.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contenedorRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contenedorRecyclerview = findViewById(R.id.activity_main_recyclerview);

    }
}
