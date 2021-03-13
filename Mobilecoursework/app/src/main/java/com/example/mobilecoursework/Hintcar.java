package com.example.mobilecoursework;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Hintcar extends AppCompatActivity {
    private TextView textViewCheck;
    private TextView textViewAttempts;
    private TextView textViewName;
    private TextView textViewCorrectAnsw;
    private ImageView imageView;
    private Button btnNext;
    private Random random;
    int randomCar;
    private String carType;
    private EditText editText;
    int userClicks = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hint_car);

        textViewAttempts = (TextView)findViewById(R.id.textViewattempts);
        textViewCheck = (TextView)findViewById(R.id.textViewcheck);
        textViewName = (TextView)findViewById(R.id.textViewCarname);
        textViewCorrectAnsw = (TextView)findViewById(R.id.textViewCorrectansw);
        imageView =(ImageView)findViewById(R.id.imageViewHint);
        btnNext = (Button)findViewById(R.id.btnnext);
        editText = (EditText)findViewById(R.id.editTextText);
        generateCar();
        spacings();
    }

    public void generateCar(){
        Integer[] images = {
                R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5,
                R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10,
                R.drawable.img11, R.drawable.img12, R.drawable.img13, R.drawable.img14, R.drawable.img15,
                R.drawable.img16, R.drawable.img17, R.drawable.img18, R.drawable.img19, R.drawable.img20,
                R.drawable.img21, R.drawable.img22, R.drawable.img23, R.drawable.img24, R.drawable.img25,
                R.drawable.img26, R.drawable.img27, R.drawable.img28, R.drawable.img29, R.drawable.img30
        };

        random = new Random();
        randomCar = random.nextInt(30);
        imageView.setImageResource(images[randomCar]);
    }

    private void spacings(){
        if (randomCar == 0 || randomCar == 1 || randomCar == 2){
                textViewName.setText("-----------");
                carType = "ASTONMARTIN";
        }
        else if (randomCar == 3 || randomCar == 4 || randomCar == 5){
            textViewName.setText("----");
            carType = "AUDI";
        }
        else if (randomCar == 6 || randomCar == 7 || randomCar == 8){
            textViewName.setText("-------");
            carType = "BENTLEY";
        }
        else if (randomCar == 9 || randomCar == 10 || randomCar == 11){
            textViewName.setText("---");
            carType = "BMW";
        }
        else if (randomCar == 12 || randomCar == 13 || randomCar == 14){
            textViewName.setText("--------");
            carType = "CADILLAC";
        }
        else if (randomCar == 15 || randomCar == 16 || randomCar == 17){
            textViewName.setText("---------");
            carType = "CHEVROLET";
        }
        else if (randomCar == 18 || randomCar == 19 || randomCar == 20){
            textViewName.setText("--------");
            carType = "CHRYSLER";
        }
        else if (randomCar == 21 || randomCar == 22 || randomCar == 23){
            textViewName.setText("---------------");
            carType = "DOGECHALLENGER";
        }
        else if (randomCar == 24 || randomCar == 25 || randomCar == 26){
            textViewName.setText("------");
            carType = "JAGUAR";
        }
        else if (randomCar == 27 || randomCar == 28 || randomCar == 29){
            textViewName.setText("-----");
            carType = "LEXUS";
        }

    }

    public void matchingCharacters(){
        Character character;
        String userInput = editText.getText().toString().toUpperCase();
        String carCharacters = textViewName.getText().toString();

        if (!(carType.contains(userInput))){
            Toast toast = Toast.makeText(this, "WRONG ! ", Toast.LENGTH_SHORT);
            toast.show();
        }


        for (int i = 0 ; i < carType.length(); i++){
            character = carType.charAt(i);
            if (character.toString().equalsIgnoreCase(userInput)){
                StringBuilder stringBuilder = new StringBuilder(carCharacters);
                stringBuilder.replace(i,i+1,userInput);
                textViewName.setText(stringBuilder);
                carCharacters = stringBuilder.toString();
            }
        }if (carType.equalsIgnoreCase(carCharacters) && (btnNext.getText().toString().equalsIgnoreCase("Submit"))){
            textViewCheck.setText("CORRECT");
            textViewCheck.setTextColor(Color.parseColor("#32CD32"));
            btnNext.setText("Next");
        }else if (btnNext.getText().toString().equalsIgnoreCase("Next")) {
            btnNext.setText("Submit");
            textViewCheck.setText("");
            generateCar();
            spacings();
        }

    }

    public void submit(View view) {
        matchingCharacters();
    }
}