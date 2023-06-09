package com.example.wooloo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class WoolooStoryPickerActivity extends AppCompatActivity {

    private Button[] buttons = new Button[4];
    private int storyImageId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wooloogeneration);

        buttons[0] = findViewById(R.id.es_fantasy);
        buttons[1] = findViewById(R.id.es_chaos);
        buttons[2] = findViewById(R.id.es_medieval);
        buttons[3] = findViewById(R.id.es_hell);

       for (Button btn:buttons) {
           btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   Intent intent = getIntent();
                   Intent intentDisplay = new Intent(WoolooStoryPickerActivity.this, WoolooFantasyDisplayActivity.class);

                   String story = "geagaga";

                   Log.i("btn id",""+btn.getId());
                   Log.i("fantasy id",""+btn.getId());

                   if (btn.getId() == R.id.es_fantasy){
                       story = intent.getStringExtra("fantasy");
                       Log.i("story",story);
                       storyImageId = R.drawable.fantasy_story;
                   }
                   else if(btn.getId() == R.id.es_chaos){
                       story = intent.getStringExtra("apocalypse");
                       Log.i("story",story);
                       storyImageId = R.drawable.fantasy_story;
                   }
                   else if(btn.getId() == R.id.es_medieval){
                       story = intent.getStringExtra("medieval");
                       Log.i("story",story);
                       storyImageId = R.drawable.fantasy_story;
                   }
                   else if(btn.getId() == R.id.es_hell){
                       story = intent.getStringExtra("hell");
                       Log.i("story",story);
                       storyImageId = R.drawable.fantasy_story;
                   }

                   Log.i("story",story);
                   intentDisplay.putExtra("story",story);
                   intentDisplay.putExtra("image", storyImageId);

                   startActivity(intentDisplay);

               }
           });
       }




    }
}