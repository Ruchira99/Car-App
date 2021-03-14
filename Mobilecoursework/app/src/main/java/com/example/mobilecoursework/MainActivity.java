package com.example.mobilecoursework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    //start another activity
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btnIdentify);
        btn2 = (Button)findViewById(R.id.btnHint);
        btn3 = (Button)findViewById(R.id.btnIdentifyImg);
        btn4 = (Button)findViewById(R.id.btnAdvanced);

        //Restore the saved state
        if (savedInstanceState!=null){
            //Buttons
            btn1.setText(savedInstanceState.getString("button1"));
            btn2.setText(savedInstanceState.getString("button2"));
            btn3.setText(savedInstanceState.getString("button3"));
            btn4.setText(savedInstanceState.getString("button4"));
        }
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        //for buttons
        outState.putString("button1", btn1.getText().toString());
        outState.putString("button2", btn2.getText().toString());
        outState.putString("button3", btn3.getText().toString());
        outState.putString("button4", btn4.getText().toString());
    }

    //start carMakeIdentifier page
    public void carMakeIdentifier(View view) {
            intent = new Intent(MainActivity.this,Identifythecarmake.class);
            startActivity(intent);
    }

    //start hintCar page
    public void hintCar(View view) {
            intent = new Intent(MainActivity.this, Hintcar.class);
            startActivity(intent);
    }

    //start imageIdentifier page
    public void imageIdentifier(View view) {
        intent = new Intent(MainActivity.this, Identifythecarimg.class);
        startActivity(intent);
    }

    //start advancedLevel page
    public void advancedLevelbtn(View view) {
        intent = new Intent(MainActivity.this, Advancedlevel.class);
        startActivity(intent);
    }
    
}
