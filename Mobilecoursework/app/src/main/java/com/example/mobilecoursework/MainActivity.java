package com.example.mobilecoursework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
//        private Button btn1;
//        private Button btn2;
//        private Button btn3;
//        private Button btn4;

    Intent intent;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

//            btn1 = (Button)findViewById(R.id.btnIdentify);
//            btn2 = (Button)findViewById(R.id.btnHint);
//            btn3 = (Button)findViewById(R.id.btnIdentifyImg);
//            btn4 = (Button)findViewById(R.id.btnAdvanced);


        }

        public void carMakeIdentifier(View view) {
            intent = new Intent(MainActivity.this,Identifythecarmake.class);
            startActivity(intent);
        }



    public void hintCar(View view) {
            intent = new Intent(MainActivity.this, Hintcar.class);
            startActivity(intent);
    }
}