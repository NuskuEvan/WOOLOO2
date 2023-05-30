package com.example.wooloo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WOOLOOGENERATION extends AppCompatActivity {

    private Button Fantasy;
    private Button Apocolypse;
    private Button Medieval;
    private Button Hell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wooloogeneration);

        Fantasy = findViewById(R.id.es_fantasy);
        Apocolypse = findViewById(R.id.es_chaos);
        Medieval = findViewById(R.id.es_medieval);
        Hell = findViewById(R.id.es_hell);

        Intent WOOLOOFANTASY = new Intent(WOOLOOGENERATION.this, com.example.wooloo2.WOOLOOFANTASY.class);

        Fantasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String story = "";
                story += "" ;

                startActivity(WOOLOOFANTASY);
            }
        });




    }
}