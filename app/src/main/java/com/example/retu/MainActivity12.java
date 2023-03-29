package com.example.retu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {
    ImageView imageView,imageView9,imageView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        TextView textView = (TextView) findViewById(R.id.textView41);
        textView.setText("");
        imageView = (ImageView) findViewById(R.id.imageView13);
        imageView8 = (ImageView) findViewById(R.id.imageView14);
        imageView9 = (ImageView) findViewById(R.id.imageView16);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity12.this,MainActivity3.class);
                startActivity(intent);
            }
        });imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity12.this,MainActivity9.class);
                startActivity(intent1);
            }
        });imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity12.this,MainActivity10.class);
                startActivity(intent2);
            }
        });
    }
}