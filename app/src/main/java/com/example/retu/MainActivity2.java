package com.example.retu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button button1;
    int s = 5;
    String Yingdao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1 = (Button)findViewById(R.id.button1);
        button1.setTextSize(18);
        button1.setTextColor(Color.rgb(230,230,250));
       Han();

    }
    protected void Han(){
        boolean han = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Yingdao = String.valueOf(s) + "s";
                button1.setText(Yingdao);
                s = s - 1;
                if (s>=0){
                    Han();
                }else {
                    button1.setText("跳过");
                    button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                            startActivity(intent);
                            MainActivity2.this.finish();
                        }
                    });
                }
            }
        },1000);
    }
}