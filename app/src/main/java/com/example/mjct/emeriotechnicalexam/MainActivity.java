package com.example.mjct.emeriotechnicalexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivityFragment mainFrag = new MainActivityFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, mainFrag).commit();
    }
}
