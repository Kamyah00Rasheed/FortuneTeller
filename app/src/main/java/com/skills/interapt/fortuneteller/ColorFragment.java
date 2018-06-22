package com.skills.interapt.fortuneteller;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;

public class ColorFragment extends Fragment {

    public class ScreenChanger extends MainActivity{

        private View layout;
        int redColorValue = Color.RED;
        int blueColorValue = Color.BLUE;
        int yellowColorValue = Color.YELLOW;
        int greenColorValue = Color.GREEN;


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_color);

            Button redButton = findViewById(R.id.pick_red_button);
             Button yellowButton = findViewById(R.id.pick_yellow_button);
            Button orangeButton = findViewById(R.id.pick_orange_button);
           Button blueButton = findViewById(R.id.pick_blue_button);


            redButton.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    setContentView(layout);
                    layout.setBackgroundColor(redColorValue);
                }
            });
            blueButton.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    setContentView(layout);
                    layout.setBackgroundColor(blueColorValue);
                }
            });
            yellowButton.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    setContentView(layout);
                    layout.setBackgroundColor(yellowColorValue);
                }
            });
            orangeButton.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    setContentView(layout);
                    layout.setBackgroundColor(greenColorValue);
                }
            });

        }
    }
}
