package com.example.wooloo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText Noun;
    private EditText Adjective;
    private EditText Adverb;
    private EditText Name;
    private EditText Alignment;
    private EditText Verb;
    private EditText Weapon;
    private EditText Animal;
    private EditText Number;
    private EditText Choice;
    private EditText Adjective2;
    private Button Generate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Noun = findViewById(R.id.es_first);
        Adjective = findViewById(R.id.es_second);
        Adverb = findViewById(R.id.es_third);
        Name = findViewById(R.id.es_fourth);
        Alignment = findViewById(R.id.es_fifth);
        Verb = findViewById(R.id.es_sixth);
        Weapon = findViewById(R.id.es_seventh);
        Animal = findViewById(R.id.es_eighth);
        Number = findViewById(R.id.es_ninth);
        Choice = findViewById(R.id.es_tenth);
        Adjective2 = findViewById(R.id.es_eleventh);
        Generate = findViewById(R.id.button);

        Intent WOOLOOGENERATION = new Intent(MainActivity.this, WOOLOOGENERATION.class);

        Generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(WOOLOOGENERATION);
            }
        });
    }
}