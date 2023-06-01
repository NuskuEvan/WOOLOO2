package com.example.wooloo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNoun;
    private EditText etAdjective;
    private EditText etAdverb;
    private EditText etName;
    private EditText etAlignment;
    private EditText etVerb;
    private EditText etWeapon;
    private EditText etAnimal;
    private EditText etNumber;
    private EditText etChoice;
    private EditText etAdjective2;
    private Button Generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            etNoun = findViewById(R.id.es_first);
            etAdjective = findViewById(R.id.es_second);
            etAdverb = findViewById(R.id.es_third);
            etName = findViewById(R.id.es_fourth);
            etAlignment = findViewById(R.id.es_fifth);
            etVerb = findViewById(R.id.es_sixth);
            etWeapon = findViewById(R.id.es_seventh);
            etAnimal = findViewById(R.id.es_eighth);
            etNumber = findViewById(R.id.es_ninth);
            etChoice = findViewById(R.id.es_tenth);
            etAdjective2 = findViewById(R.id.es_eleventh);
            Generate = findViewById(R.id.button);

        Intent WOOLOOGENERATION = new Intent(MainActivity.this, WoolooStoryPickerActivity.class);

        Generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String storyFantasy = "";
                storyFantasy +="Welcome to Drenkon " + etName + " , be careful not to upset the natives of this place as you will face consequences";
                storyFantasy += "You walk through the " + etNoun + " carefully not wanting to draw any attention to you";
                storyFantasy += "";

                String storyApocalypse = "";

                String storyMedieval = "";

                String storyHell = "";

                WOOLOOGENERATION.putExtra("fantasy",storyFantasy);
                WOOLOOGENERATION.putExtra("apocalypse",storyApocalypse);
                WOOLOOGENERATION.putExtra("medieval",storyMedieval);
                WOOLOOGENERATION.putExtra("hell",storyHell);

                startActivity(WOOLOOGENERATION);
            }
        });


    }

}