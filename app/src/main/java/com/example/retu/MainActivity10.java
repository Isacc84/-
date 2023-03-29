package com.example.retu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity10 extends AppCompatActivity {
    ImageView imageView,imageView9,imageView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        imageView = (ImageView) findViewById(R.id.imageView17);
        imageView8 = (ImageView) findViewById(R.id.imageView18);
        imageView9 = (ImageView) findViewById(R.id.imageView20);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity10.this,MainActivity3.class);
                startActivity(intent);
            }
        });imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity10.this,MainActivity9.class);
                startActivity(intent1);
            }
        });imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity10.this,MainActivity12.class);
                startActivity(intent2);
            }
        });
    }
}