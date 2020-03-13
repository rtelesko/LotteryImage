package com.example.lotteryimage;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /* What is a high resolution image?
    A high-resolution image is anything that has at least 300 dpi high resolution with a larger pixel dimension,
    for example, 5000 x 4000 pixels.
     */

    // GUI control
    private ImageView ivSimpleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get reference to the ImageView
        ivSimpleImageView = findViewById(R.id.ivSimpleImageView);
    }
}
