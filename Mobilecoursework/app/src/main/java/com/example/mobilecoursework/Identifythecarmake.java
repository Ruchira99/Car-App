package com.example.mobilecoursework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class Identifythecarmake extends AppCompatActivity {

    private TextView textViewCorrect;
    private Button btnNext;
    private TextView textViewMessage;
    private Spinner dropDownMenu;
    private ImageView imageView;
    Random random;
    int randomCar;
    String spinner;

    // integer Array of images
    Integer[] images = {
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5,
            R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10,
            R.drawable.img11, R.drawable.img12, R.drawable.img13, R.drawable.img14, R.drawable.img15,
            R.drawable.img16, R.drawable.img17, R.drawable.img18, R.drawable.img19, R.drawable.img20,
            R.drawable.img21, R.drawable.img22, R.drawable.img23, R.drawable.img24, R.drawable.img25,
            R.drawable.img26, R.drawable.img27, R.drawable.img28, R.drawable.img29, R.drawable.img30
    };

    //names for spinner (string Array)
    String[] cars = {"Select", "Aston Martin", "Audi", "Bentley", "BMW", "Cadillac", "Chevrolet", "Chrysler", "Dodge Challenger", "Jaguar", "Lexus"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifythecarmake);

        textViewCorrect = (TextView) findViewById(R.id.correcttextview);
        textViewMessage = (TextView) findViewById(R.id.messagetextview);
        imageView = (ImageView) findViewById(R.id.imageView);
        dropDownMenu = (Spinner) findViewById(R.id.dropdownmenu);
        btnNext = (Button) findViewById(R.id.Identify);
        generatecar();

        if (savedInstanceState != null){
            textViewMessage.setText(savedInstanceState.getString("textCorrect"));
            textViewCorrect.setText(savedInstanceState.getString("textMessage"));
            randomCar = savedInstanceState.getInt("images");
            imageView.setImageResource(images[randomCar]);
            btnNext.setText(savedInstanceState.getString("button"));
            textViewCorrect.setTextColor(savedInstanceState.getInt("color"));
            textViewMessage.setTextColor(savedInstanceState.getInt("color2"));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("textCorrect", textViewCorrect.getText().toString());
        outState.putString("textMessage", textViewMessage.getText().toString());
        outState.putInt("images", randomCar);
        outState.putString("spinner", dropDownMenu.getSelectedItem().toString());
        outState.putString("button", btnNext.getText().toString());
        outState.putInt("color",textViewCorrect.getCurrentTextColor());
        outState.putInt("color2",textViewMessage.getCurrentTextColor());

    }

    public void generatecar() {

        random = new Random();
        randomCar = random.nextInt(30);
        imageView.setImageResource(images[randomCar]);

        //random images set tp arrayadapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cars);
        dropDownMenu.setAdapter(arrayAdapter);
    }

    public void check() {
        spinner = dropDownMenu.getSelectedItem().toString();
        if (btnNext.getText().toString().equalsIgnoreCase("Submit")) {
            //check images 0 to 2 in randomcar
            if (randomCar >= 0 && randomCar <= 2) {
                if (spinner.equalsIgnoreCase("Aston Martin")) {
                    textViewMessage.setText("Correct");
                    textViewMessage.setTextColor(Color.parseColor("#00ff00"));
                } else {
                    textViewMessage.setText("Wrong");
                    textViewMessage.setTextColor(Color.parseColor("#ff0000"));
                    textViewCorrect.setText("Aston Martin");
                    textViewCorrect.setTextColor(Color.parseColor("#FFFF00"));
                }
            } else if (randomCar >= 3 && randomCar <= 5) {
                if (spinner.equalsIgnoreCase("Audi")) {
                    textViewMessage.setText("Correct");
                    textViewMessage.setTextColor(Color.parseColor("#00ff00"));
                } else {
                    textViewMessage.setText("Wrong");
                    textViewMessage.setTextColor(Color.parseColor("#ff0000"));
                    textViewCorrect.setText("Audi");
                    textViewCorrect.setTextColor(Color.parseColor("#FFFF00"));
                }
            } else if (randomCar >= 6 && randomCar <= 8) {
                if (spinner.equalsIgnoreCase("Bentley")) {
                    textViewMessage.setText("Correct");
                    textViewMessage.setTextColor(Color.parseColor("#00ff00"));
                } else {
                    textViewMessage.setText("Wrong");
                    textViewMessage.setTextColor(Color.parseColor("#ff0000"));
                    textViewCorrect.setText("Bentley");
                    textViewCorrect.setTextColor(Color.parseColor("#FFFF00"));
                }
            } else if (randomCar >= 9 && randomCar <= 11) {
                if (spinner.equalsIgnoreCase("BMW")) {
                    textViewMessage.setText("Correct");
                    textViewMessage.setTextColor(Color.parseColor("#00ff00"));
                } else {
                    textViewMessage.setText("Wrong");
                    textViewMessage.setTextColor(Color.parseColor("#ff0000"));
                    textViewCorrect.setText("BMW");
                    textViewCorrect.setTextColor(Color.parseColor("#FFFF00"));
                }
            } else if (randomCar >= 12 && randomCar <= 14) {
                if (spinner.equalsIgnoreCase("Cadillac")) {
                    textViewMessage.setText("Correct");
                    textViewMessage.setTextColor(Color.parseColor("#00ff00"));
                } else {
                    textViewMessage.setText("Wrong");
                    textViewMessage.setTextColor(Color.parseColor("#ff0000"));
                    textViewCorrect.setText("Cadillac");
                    textViewCorrect.setTextColor(Color.parseColor("#FFFF00"));
                }
            } else if (randomCar >= 15 && randomCar <= 17) {
                if (spinner.equalsIgnoreCase("Chevrolet")) {
                    textViewMessage.setText("Correct");
                    textViewMessage.setTextColor(Color.parseColor("#00ff00"));
                } else {
                    textViewMessage.setText("Wrong");
                    textViewMessage.setTextColor(Color.parseColor("#ff0000"));
                    textViewCorrect.setText("Chevrolet");
                    textViewCorrect.setTextColor(Color.parseColor("#FFFF00"));
                }
            } else if (randomCar >= 18 && randomCar <= 20) {
                if (spinner.equalsIgnoreCase("Chrysler")) {
                    textViewMessage.setText("Correct");
                    textViewMessage.setTextColor(Color.parseColor("#00ff00"));
                } else {
                    textViewMessage.setText("Wrong");
                    textViewMessage.setTextColor(Color.parseColor("#ff0000"));
                    textViewCorrect.setText("Chrysler");
                    textViewCorrect.setTextColor(Color.parseColor("#FFFF00"));
                }
            } else if (randomCar >= 21 && randomCar <= 23) {
                if (spinner.equalsIgnoreCase("Dodge Challenger")) {
                    textViewMessage.setText("Correct");
                    textViewMessage.setTextColor(Color.parseColor("#00ff00"));
                } else {
                    textViewMessage.setText("Wrong");
                    textViewMessage.setTextColor(Color.parseColor("#ff0000"));
                    textViewCorrect.setText("Dodge Challenger");
                    textViewCorrect.setTextColor(Color.parseColor("#FFFF00"));
                }
            } else if (randomCar >= 24 && randomCar <= 26) {
                if (spinner.equalsIgnoreCase("Jaguar")) {
                    textViewMessage.setText("Correct");
                    textViewMessage.setTextColor(Color.parseColor("#00ff00"));
                } else {
                    textViewMessage.setText("Wrong");
                    textViewMessage.setTextColor(Color.parseColor("#ff0000"));
                    textViewCorrect.setText("Jaguar");
                    textViewCorrect.setTextColor(Color.parseColor("#FFFF00"));
                }
            } else if (randomCar >= 27 && randomCar <= 29) {
                if (spinner.equalsIgnoreCase("Lexus")) {
                    textViewMessage.setText("Correct");
                    textViewMessage.setTextColor(Color.parseColor("#00ff00"));
                } else {
                    textViewMessage.setText("Wrong");
                    textViewMessage.setTextColor(Color.parseColor("#ff0000"));
                    textViewCorrect.setText("Lexus");
                    textViewCorrect.setTextColor(Color.parseColor("#FFFF00"));
                }
            }
        }
    }

    public void submit (View view){
        check();
        if (btnNext.getText().equals("Submit")){
            btnNext.setText("Next");
        }else if (btnNext.getText().equals("Next")){
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }


    }
}