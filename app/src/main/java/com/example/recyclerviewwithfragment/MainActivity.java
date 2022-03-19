package com.example.recyclerviewwithfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         //Allow to replace mainActivity xml view by the new fragment

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.mainActivityXML,new recFragment()).commit();
    }
}