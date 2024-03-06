package com.example.comeng2024hafta301;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    MyServices my;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Intent myInt;
    public void ServiceStart(View v){
      myInt= new Intent(MainActivity.this,
                MyServices.class) ;

        startService(myInt);

    }

    public void StopServices(View v){

        stopService(myInt);
    }
}