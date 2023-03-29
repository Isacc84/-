package com.example.retu;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;

import static com.example.retu.R.drawable.s15;
import static com.example.retu.R.drawable.s16;

public class MainActivity3 extends AppCompatActivity {
    int caomei = 0;
    ImageView imw,ime,im2;View view,view1,view2;
    ObjectAnimator moveIn,fadeInOut,fadeInOut1,fadeInOut2,fadeInOut3;
    AnimatorSet animSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ime = (ImageView) findViewById(R.id.imageView3);
        ime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent12);

            }
        });
        im2 = (ImageView) findViewById(R.id.imageView2);
//        im2 .setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent14 = new Intent(MainActivity3.this,MainActivity8.class);
//                startActivity(intent14);
//            }
//        });
        imw = (ImageView) findViewById(R.id.imageView9);
        moveIn = ObjectAnimator.ofFloat(imw, "translationX", 0,-800,0);
        fadeInOut = ObjectAnimator.ofFloat(imw, "alpha",  0f ,0f,1f).setDuration(2000);
        fadeInOut1 = ObjectAnimator.ofFloat(imw, "scaleX",  0 ,0,1);
        fadeInOut2 = ObjectAnimator.ofFloat(imw, "scaleY",  0 ,0,1);
        fadeInOut3 = ObjectAnimator.ofFloat(imw, "alpha",  1f ,0f ,0f);
//        moveIn.setRepeatCount(Animation.INFINITE);
//        moveIn.setRepeatMode(ValueAnimator.REVERSE);
//        fadeInOut.setRepeatCount(Animation.INFINITE);
//        fadeInOut.setRepeatMode(ValueAnimator.REVERSE);
//        fadeInOut1.setRepeatCount(Animation.INFINITE);
//        fadeInOut1.setRepeatMode(ValueAnimator.REVERSE);
        Han();
view = (View)findViewById(R.id.view19);
view1 = (View)findViewById(R.id.view20);
view2 = (View)findViewById(R.id.view21);
view.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    Intent intent = new Intent(MainActivity3.this,MainActivity9.class);
    startActivity(intent);
    }
});
view1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent10 = new Intent(MainActivity3.this,MainActivity10.class);
        startActivity(intent10);
    }
});view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten12 = new Intent(MainActivity3.this,MainActivity12.class);
                startActivity(inten12);
            }
        });//        animator.setDuration(3000);
//        animator1.setDuration(4000);
//        animator.setRepeatCount(Animation.INFINITE);
//        animator.setRepeatMode(ValueAnimator.REVERSE);
//        animator.start();

    }
    protected void Han(){
        boolean han = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (caomei == 0){
                    imw.setImageResource(R.drawable.s17);
                    animSet = new AnimatorSet();
                    animSet.play(fadeInOut).with(fadeInOut2).with(fadeInOut1);
                    animSet.setDuration(2100);
                    animSet.start();

                    caomei = caomei + 1;
                }else if (caomei == 1){
                    imw.setImageResource(R.drawable.s18);
                    animSet = new AnimatorSet();
                    animSet.play(fadeInOut).with(fadeInOut2).with(fadeInOut1);
                    animSet.setDuration(2100);
                    animSet.start();
                    caomei = caomei + 1;
                }else if (caomei == 2 ){
                    animSet = new AnimatorSet();
                    animSet.play(fadeInOut).with(fadeInOut2).with(fadeInOut1);
                    animSet.setDuration(2100);
                    animSet.start();
                    imw.setImageResource(R.drawable.s18);
                    caomei = caomei + 1;
                }else if(caomei == 3){
                    animSet = new AnimatorSet();
                    animSet.play(fadeInOut).with(fadeInOut2).with(fadeInOut1);
                    animSet.setDuration(2100);
                    animSet.start();
                    imw.setImageResource(R.drawable.s17);
                    caomei = 0;
                }
                Han();
            }
        },4200);
    }

}