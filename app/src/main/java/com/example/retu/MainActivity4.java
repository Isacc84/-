package com.example.retu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
TextView view1,view2,view3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        view1 = (TextView) findViewById(R.id.textView1);
        view2 = (TextView) findViewById(R.id.textView2);
        view3 = (TextView) findViewById(R.id.textView3);
//        view1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent2 = new Intent(MainActivity4.this,MainActivity5.class);
//                startActivity(intent2);
//            }
//        });
//        view2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent1 = new Intent(MainActivity4.this,MainActivity5.class);
//                startActivity(intent1);
//            }
//        });
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity4.this,MainActivity6.class);
                startActivity(intent3);
            }
        });

    }
}