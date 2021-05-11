package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn_ask;
    ImageView img_image;

    //Array for images
    int img[] = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_ask = findViewById(R.id.btn_ask);
        img_image = findViewById(R.id.img_image);
        
        btn_ask.setOnClickListener((View v) ->{
            Random random = new Random();
            int rand = random.nextInt(img.length);
            img_image.setImageResource(img[rand]);
            Toast.makeText(this, "^^^^^^^^^^^^^^^", Toast.LENGTH_SHORT).show();
        });
    }
}
