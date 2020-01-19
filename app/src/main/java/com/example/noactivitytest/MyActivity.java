package com.example.noactivitytest;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import org.jdom2.Document;

public class MyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myactivity);
        Document doc = new Document();
    }
}
