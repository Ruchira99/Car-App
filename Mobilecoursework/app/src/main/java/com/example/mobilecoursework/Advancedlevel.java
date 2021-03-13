package com.example.mobilecoursework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Advancedlevel extends AppCompatActivity {

    private TextView tvOne;
    private TextView tvTwo;
    private TextView tvThree;
    private ImageView imageViewOne;
    private ImageView imageViewTwo;
    private ImageView imageViewThree;
    private EditText editTextOne;
    private EditText editTextTwo;
    private EditText editTextThree;
    private Button btnSubmit;
    int carSetOne;
    int carSetTwo;
    int carSetThree;
    Random randomCar = new Random();
    private String carType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advancedlevel);

        tvOne = (TextView) findViewById(R.id.textViewOne);
        tvTwo = (TextView) findViewById(R.id.textViewTwo);
        tvThree = (TextView) findViewById(R.id.textViewThree);

        imageViewOne = (ImageView) findViewById(R.id.ivOne);
        imageViewTwo = (ImageView) findViewById(R.id.ivTwo);
        imageViewThree = (ImageView) findViewById(R.id.ivThree);

        editTextOne = (EditText) findViewById(R.id.etOne);
        editTextTwo = (EditText) findViewById(R.id.etTwo);
        editTextThree = (EditText) findViewById(R.id.etThree);

        btnSubmit = (Button) findViewById(R.id.buttonSubmit);
        genareteCar();

    }

    Integer[] imagesetOne = {
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9
    };

    Integer[] imagesetTwo = {
            R.drawable.img10, R.drawable.img11, R.drawable.img12, R.drawable.img13, R.drawable.img14, R.drawable.img15,
            R.drawable.img16, R.drawable.img17, R.drawable.img18
    };

    Integer[] imagesetThree = {
            R.drawable.img19, R.drawable.img20, R.drawable.img21, R.drawable.img22, R.drawable.img23, R.drawable.img24, R.drawable.img25,
            R.drawable.img26, R.drawable.img27, R.drawable.img28, R.drawable.img29, R.drawable.img30
    };

    public void genareteCar() {
        carSetOne = randomCar.nextInt(9);
        carSetTwo = randomCar.nextInt(9);
        carSetThree = randomCar.nextInt(12);

        imageViewOne.setImageResource(imagesetOne[carSetOne]);
        imageViewTwo.setImageResource(imagesetTwo[carSetTwo]);
        imageViewThree.setImageResource(imagesetThree[carSetThree]);
    }

    public void textCheck() {

        if (carSetOne >= 0 && carSetOne <= 2) {
            if (editTextOne.getText().toString().equalsIgnoreCase("Aston Martin")) {
                editTextOne.setText("Aston Martin");
                editTextOne.setTextColor(Color.parseColor("#00ff00"));
                tvOne.setText("CORRECT");
                editTextOne.setEnabled(false);
                tvOne.setTextColor(Color.parseColor("#FFFF00"));
            } else if (!(editTextOne.getText().toString().equalsIgnoreCase("Aston Martin"))) {
                editTextOne.setHint("Wrong");
                editTextOne.setText("");
                editTextOne.setHintTextColor(Color.parseColor("#ff0000"));
            }
        }
        if (carSetOne >= 3 && carSetOne <= 5) {
            if (editTextOne.getText().toString().equalsIgnoreCase("Audi")) {
                editTextOne.setText("Audi");
                editTextOne.setTextColor(Color.parseColor("#00ff00"));
                tvOne.setText("CORRECT");
                editTextOne.setEnabled(false);
                tvOne.setTextColor(Color.parseColor("#FFFF00"));
            } else if (!(editTextOne.getText().toString().equalsIgnoreCase("Audi"))) {
                editTextOne.setHint("Wrong");
                editTextOne.setText("");
                editTextOne.setHintTextColor(Color.parseColor("#ff0000"));
            }
        }
        if (carSetOne >= 6 && carSetOne <= 8) {
            if (editTextOne.getText().toString().equalsIgnoreCase("Bentley")) {
                editTextOne.setText("Bentley");
                editTextOne.setTextColor(Color.parseColor("#00ff00"));
                tvOne.setText("CORRECT");
                editTextOne.setEnabled(false);
                tvOne.setTextColor(Color.parseColor("#FFFF00"));
            } else if (!(editTextOne.getText().toString().equalsIgnoreCase("Bentley"))) {
                editTextOne.setHint("Wrong");
                editTextOne.setText("");
                editTextOne.setHintTextColor(Color.parseColor("#ff0000"));
            }
        }

        //set two
        if (carSetTwo >= 0 && carSetTwo <= 2) {
            if (editTextTwo.getText().toString().equalsIgnoreCase("BMW")) {
                editTextTwo.setText("BMW");
                editTextTwo.setTextColor(Color.parseColor("#00ff00"));
                tvTwo.setText("CORRECT");
                tvTwo.setTextColor(Color.parseColor("#FFFF00"));
            } else if (!(editTextTwo.getText().toString().equalsIgnoreCase("BMW"))) {
                editTextTwo.setHint("Wrong");
                editTextTwo.setText("");
                editTextTwo.setHintTextColor(Color.parseColor("#ff0000"));
            }
        }
        if (carSetTwo >= 3 && carSetTwo <= 5) {
            if (editTextTwo.getText().toString().equalsIgnoreCase("Cadillac")) {
                editTextTwo.setText("Cadillac");
                editTextTwo.setTextColor(Color.parseColor("#00ff00"));
                tvTwo.setText("CORRECT");
                tvTwo.setTextColor(Color.parseColor("#FFFF00"));
            } else if (!(editTextTwo.getText().toString().equalsIgnoreCase("Cadillac"))) {
                editTextTwo.setHint("Wrong");
                editTextTwo.setText("");
                editTextTwo.setHintTextColor(Color.parseColor("#ff0000"));
            }
        }
        if (carSetTwo >= 6 && carSetTwo <= 8) {
            if (editTextTwo.getText().toString().equalsIgnoreCase("Chevrolet")) {
                editTextTwo.setText("Chevrolet");
                editTextTwo.setTextColor(Color.parseColor("#00ff00"));
                tvTwo.setText("CORRECT");
                tvTwo.setTextColor(Color.parseColor("#FFFF00"));
            } else if (!(editTextTwo.getText().toString().equalsIgnoreCase("Chevrolet"))) {
                editTextTwo.setHint("Wrong");
                editTextTwo.setText("");
                editTextTwo.setHintTextColor(Color.parseColor("#ff0000"));
            }
        }
        if (carSetTwo >= 9 && carSetTwo <= 11) {
            if (editTextTwo.getText().toString().equalsIgnoreCase("Chevrolet")) {
                editTextTwo.setText("Chevrolet");
                editTextTwo.setTextColor(Color.parseColor("#00ff00"));
                tvTwo.setText("CORRECT");
                tvTwo.setTextColor(Color.parseColor("#FFFF00"));
            } else if (!(editTextTwo.getText().toString().equalsIgnoreCase("Chevrolet"))) {
                editTextTwo.setHint("Wrong");
                editTextTwo.setText("");
                editTextTwo.setHintTextColor(Color.parseColor("#ff0000"));
            }
        }

        //set three
        if (carSetThree >= 0 && carSetThree <= 2) {
            if (editTextThree.getText().toString().equalsIgnoreCase("Chrysler")) {
                editTextThree.setText("Chrysler");
                editTextThree.setTextColor(Color.parseColor("#00ff00"));
                tvThree.setText("CORRECT");
                tvThree.setTextColor(Color.parseColor("#FFFF00"));
            } else if (!(editTextThree.getText().toString().equalsIgnoreCase("Chrysler"))) {
                editTextThree.setHint("Wrong");
                editTextThree.setText("");
                editTextThree.setHintTextColor(Color.parseColor("#ff0000"));
            }
        }
        if (carSetThree >= 3 && carSetThree <= 5) {
            if (editTextThree.getText().toString().equalsIgnoreCase("Dodge Challenger")) {
                editTextThree.setText("Dodge Challenger");
                editTextThree.setTextColor(Color.parseColor("#00ff00"));
                tvThree.setText("CORRECT");
                tvThree.setTextColor(Color.parseColor("#FFFF00"));
            } else if (!(editTextThree.getText().toString().equalsIgnoreCase("Dodge Challenger"))) {
                editTextThree.setHint("Wrong");
                editTextThree.setText("");
                editTextThree.setHintTextColor(Color.parseColor("#ff0000"));
            }
        }
        if (carSetThree >= 6 && carSetThree <= 8) {
            if (editTextThree.getText().toString().equalsIgnoreCase("Jaguar")) {
                editTextThree.setText("Jaguar");
                editTextThree.setTextColor(Color.parseColor("#00ff00"));
                tvThree.setText("CORRECT");
                tvThree.setTextColor(Color.parseColor("#FFFF00"));
            } else if (!(editTextThree.getText().toString().equalsIgnoreCase("Jaguar"))) {
                editTextThree.setHint("Wrong");
                editTextThree.setText("");
                editTextThree.setHintTextColor(Color.parseColor("#ff0000"));
            }
        }
        if (carSetThree >= 9 && carSetThree <= 11) {
            if (editTextThree.getText().toString().equalsIgnoreCase("Lexus")) {
                editTextThree.setText("Lexus");
                editTextThree.setTextColor(Color.parseColor("#00ff00"));
                tvThree.setText("CORRECT");
                tvThree.setTextColor(Color.parseColor("#FFFF00"));
            } else if (!(editTextThree.getText().toString().equalsIgnoreCase("Lexus"))) {
                editTextThree.setHint("Wrong");
                editTextThree.setText("");
                editTextThree.setHintTextColor(Color.parseColor("#ff0000"));
            }
        }
    }


    public void submitBtn(View view) {
        textCheck();
    }
}