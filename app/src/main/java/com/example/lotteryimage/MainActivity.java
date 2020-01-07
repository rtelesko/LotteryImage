package com.example.lotteryimage;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // GUI control
    private ImageView ivSimpleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get reference to the ImageView
        ivSimpleImageView = (ImageView) findViewById(R.id.ivSimpleImageView);
    }
}
