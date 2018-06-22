package com.skills.interapt.fortuneteller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView titleFortuneTeller= findViewById(R.id.title_fortuneteller_textview);
    public ImageView titleImage = findViewById(R.id.main_star_imageview);
    public TextView pickAColor = findViewById(R.id.pick_color_textview);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListener();
    }


    private void setListener() {

        Button redButton = findViewById(R.id.pick_red_button);
        Button yellowButton = findViewById(R.id.pick_yellow_button);
        Button orangeButton = findViewById(R.id.pick_orange_button);
        Button blueButton = findViewById(R.id.pick_blue_button);

       redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGame();

            }
        });

    }
    //Method to handle the intent to go from this activity to the GameActivity
    private void startGame() {
        Intent playGame = new Intent(this, ColorFragment.class);
        startActivity(playGame);
    }
}

    @Override
    public void onBackPressed() {

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
