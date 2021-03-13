package com.example.mobilecoursework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    Intent intent;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

    public void carMakeIdentifier(View view) {
            intent = new Intent(MainActivity.this,Identifythecarmake.class);
            startActivity(intent);
    }

    public void hintCar(View view) {
            intent = new Intent(MainActivity.this, Hintcar.class);
            startActivity(intent);
    }

    public void imageIdentifier(View view) {
        intent = new Intent(MainActivity.this, Identifythecarimg.class);
        startActivity(intent);
    }

    public void advancedLevelbtn(View view) {
        intent = new Intent(MainActivity.this, Advancedlevel.class);
        startActivity(intent);
    }
}
