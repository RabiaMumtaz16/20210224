package com.example.alphabetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__launcher);
    }

    public void Start(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}