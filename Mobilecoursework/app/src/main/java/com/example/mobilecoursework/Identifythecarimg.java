package com.example.mobilecoursework;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Identifythecarimg extends AppCompatActivity {
    private TextView textViewName;
    private TextView textViewAnswer;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private Button btnNext;
    int carSetOne;
    int carSetTwo;
    int carSetThree;
    int userClicks = 0;
    Random randomCar = new Random();

    Integer[]imagesetOne = {
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9
    };

    Integer[]imagesetTwo ={
            R.drawable.img10, R.drawable.img11, R.drawable.img12, R.drawable.img13, R.drawable.img14, R.drawable.img15,
            R.drawable.img16, R.drawable.img17, R.drawable.img18
    };

    Integer[] imagesetThree ={
            R.drawable.img19, R.drawable.img20, R.drawable.img21, R.drawable.img22, R.drawable.img23, R.drawable.img24, R.drawable.img25,
            R.drawable.img26, R.drawable.img27, R.drawable.img28, R.drawable.img29, R.drawable.img30
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifythecarimg);

        textViewName = (TextView)findViewById(R.id.textViewRandomname);
        textViewAnswer = (TextView)findViewById(R.id.textViewCorrect);
        imageView1 = (ImageView)findViewById(R.id.ividentify1);
        imageView2 = (ImageView)findViewById(R.id.ividentify2);
        imageView3 = (ImageView)findViewById(R.id.ividentify3);
        btnNext = (Button)findViewById(R.id.btnsubmit);
        genareteCar();

    }


    public void genareteCar(){
        carSetOne = randomCar.nextInt(9);
        carSetTwo = randomCar.nextInt(9);
        carSetThree = randomCar.nextInt(12);

        int selectRandomArr = randomCar.nextInt(3);

        imageView1.setImageResource(imagesetOne[carSetOne]);
        imageView2.setImageResource(imagesetTwo[carSetTwo]);
        imageView3.setImageResource(imagesetThree[carSetThree]);

        if (selectRandomArr == 0){
            if (carSetOne >= 0 && carSetOne <= 2 ){
                textViewName.setText("Aston Martin");
            }else if (carSetOne>=3 && carSetOne <= 5){
                textViewName.setText("Audi");
            }else if (carSetOne>= 6 && carSetOne <= 8){
                textViewName.setText("Bentley");
            }
        }else if (selectRandomArr ==1){
            if (carSetTwo >= 0 && carSetTwo <= 2 ){
                textViewName.setText("BMW");
            }else if (carSetTwo>=3 && carSetTwo <= 5){
                textViewName.setText("Cadillac");
            }else if (carSetTwo>= 6 && carSetTwo <= 8){
                textViewName.setText("Chevrolet");
            }
        }else if (selectRandomArr == 2){
            if (carSetThree >= 0 && carSetThree <= 2 ){
                textViewName.setText("Chrysler");
            }else if (carSetThree>=3 && carSetThree <= 5){
                textViewName.setText("Dodge Challenger");
            }else if (carSetThree>= 6 && carSetThree <= 8){
                textViewName.setText("Jaguar");
            }else if (carSetThree >=9 && carSetThree<=11){
                textViewName.setText("Lexus");
            }
        }
    }


    public void submit(View view) {

        userClicks = 0;
        textViewAnswer.setText("");
        genareteCar();

    }

    public void firstImage(View view) {
        if (userClicks == 0){
            userClicks++;
            if (textViewName.getText() == "Aston Martin" || textViewName.getText() == "Audi" || textViewName.getText() == "Bentley"){
                textViewAnswer.setText("CORRECT!");
                textViewAnswer.setTextColor(Color.parseColor("#00ff00"));
            }
            else{
                textViewAnswer.setText("WRONG!");
                textViewAnswer.setTextColor(Color.parseColor("#f01c05"));
            }
        }else if (userClicks != 0){
            Toast.makeText(getApplicationContext(),"You Already Clicked an Image",Toast.LENGTH_SHORT).show();
        }
    }

    public void secondImage(View view) {
        if (userClicks == 0){
            userClicks++;
            if (textViewName.getText() == "BMW" || textViewName.getText() == "Cadillac" || textViewName.getText() == "Chevrolet"){
                textViewAnswer.setText("CORRECT!");
                textViewAnswer.setTextColor(Color.parseColor("#00ff00"));
            }
            else{
                textViewAnswer.setText("WRONG!");
                textViewAnswer.setTextColor(Color.parseColor("#f01c05"));
            }
        }else if (userClicks != 0){
            Toast.makeText(getApplicationContext(),"You Already Clicked an Image",Toast.LENGTH_SHORT).show();
        }
    }

    public void thirdImage(View view) {
        if (userClicks == 0){
            userClicks++;
            if (textViewName.getText() == "Chrysler" || textViewName.getText() == "Dodge Challenger" || textViewName.getText() == "Jaguar" || textViewName.getText() == "Lexus"){
                textViewAnswer.setText("CORRECT!");
                textViewAnswer.setTextColor(Color.parseColor("#00FF00"));
            }
            else{
                textViewAnswer.setText("WRONG!");
                textViewAnswer.setTextColor(Color.parseColor("#f01c05"));
            }
        }else if (userClicks != 0){
            Toast.makeText(getApplicationContext(),"You Already Clicked an Image",Toast.LENGTH_SHORT).show();
        }
    }
}