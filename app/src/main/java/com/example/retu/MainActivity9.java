package com.example.retu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.TimeZone;

public class MainActivity9 extends AppCompatActivity {
    Calendar cal;
    String year;
    String month;
    String day;
    String hour;
    String minute;
    String second;
    String my_time_1;
    String tmp_path;
    View view,view1,view2,view3,view4,view5,view6,view7;
    String disp_path,disp_path1;int a,beizi,xiaobeizi;
    TextView textView,textView1,textView2,textView3,textView4,textView5,textView6,textView9;
    int rii,ribi,bicaolan,bicaoshui;
    ImageView Iview,Iview1,Iview2,Iview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        timeget();
        int yue = Integer.valueOf(month).intValue();
        int ri = Integer.valueOf(day).intValue();
        textView = (TextView) findViewById(R.id.textView34);
        textView1 = (TextView) findViewById(R.id.textView38);
        textView2 = (TextView) findViewById(R.id.textView35);
        textView3 = (TextView) findViewById(R.id.textView36);
        textView4 = (TextView) findViewById(R.id.textView40);
        textView5 = (TextView) findViewById(R.id.textView39);
        textView6 = (TextView) findViewById(R.id.textView37);
        textView9 = (TextView) findViewById(R.id.textView32);
        view = (View) findViewById(R.id.view23);
        view2= (View) findViewById(R.id.view24);
        view3= (View) findViewById(R.id.view25);
        view4 = (View) findViewById(R.id.view26);
        view5 = (View) findViewById(R.id.view27);
        view6 = (View) findViewById(R.id.view28);
        view7 = (View) findViewById(R.id.view30);
        Iview = (ImageView)findViewById(R.id.view31);
        Iview1 = (ImageView)findViewById(R.id.view32);
        Iview2 = (ImageView)findViewById(R.id.view33);
        Iview3 = (ImageView)findViewById(R.id.view34);
        Iview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        Iview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity9.this,MainActivity10.class);
                startActivity(intent1);
            }
        });
        Iview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity9.this,MainActivity12.class);
                startActivity(intent2);
            }
        });
        if(yue == 3){
            rii = Integer.valueOf(String.valueOf(ri / 7)).intValue() + 1;
            String riiii = String.valueOf(rii);
            String riii = "第" + riiii + "周";
            textView9.setText(riii);
            she(ri);
        }
        else if ( yue == 4){
            ri = ri + 3;
            rii = Integer.valueOf(String.valueOf(28 + ri / 7)).intValue() + 1;
            String riiii = String.valueOf(rii);
            String riii = "第" + riiii + "周";
            textView9.setText(riii);
            she(ri);
        }else if(yue == 5){
            ri = ri + 5;
            rii = Integer.valueOf(String.valueOf(56 + ri / 7)).intValue() + 1;
            String riiii = String.valueOf(rii);
            String riii = "第" + riiii + "周";
            textView9.setText(riii);
            she(ri);
        }else if(yue == 6 ){
            ri = ri + 1;
            rii = Integer.valueOf(String.valueOf(91 + ri / 7)).intValue() + 1;
            String riiii = String.valueOf(rii);
            String riii = "第" + riiii + "周";
            textView9.setText(riii);
            she(ri);
        }else if(yue == 7){
            ri = ri + 3;
            rii = Integer.valueOf(String.valueOf(119 + ri / 7)).intValue() + 1;
            String riiii = String.valueOf(rii);
            String riii = "第" + riiii + "周";
            textView9.setText(riii);
            she(ri);
        }else if(yue == 8){
            ri = ri + 6 ;
            rii = Integer.valueOf(String.valueOf(147 + ri / 7)).intValue() + 1;
            String riiii = String.valueOf(rii);
            String riii = "第" + riiii + "周";
            textView9.setText(riii);
            she(ri);
        }
        bi();
    }
    private void timeget(){
        cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));

        year = String.valueOf(cal.get(Calendar.YEAR));
        month = String.valueOf(cal.get(Calendar.MONTH)+1);
        day = String.valueOf(cal.get(Calendar.DATE));
        if (cal.get(Calendar.AM_PM) == 0)
            hour = String.valueOf(cal.get(Calendar.HOUR));
        else
            hour = String.valueOf(cal.get(Calendar.HOUR)+12);
        minute = String.valueOf(cal.get(Calendar.MINUTE));
        second = String.valueOf(cal.get(Calendar.SECOND));
        if(cal.get((Calendar.SECOND))+0 >60)
            second = String.valueOf(cal.get(Calendar.SECOND)+0);
        else
            second = String.valueOf(cal.get(Calendar.SECOND)+0);
        my_time_1 = year + month + day;

    }
    private void she(int ri){
            beizi = ri % 7;
            xiaobeizi =ri;
            if (beizi == 0){
                Resources resources=getBaseContext().getResources();
                Drawable drawable=resources.getDrawable(R.drawable.sbeiji);
                textView6.setText(day);textView6.setBackground(drawable);textView6.setTextColor(0xffffffff);
                textView.setText(String.valueOf(ri-6));
                textView1.setText(String.valueOf(ri-5));
                textView2.setText(String.valueOf(ri-4));
                textView3.setText(String.valueOf(ri-3));
                textView4.setText(String.valueOf(ri-2));
                textView5.setText(String.valueOf(ri-1));
                ribi = 0;
            }else if(beizi == 1){ Resources resources=getBaseContext().getResources();
                Drawable drawable=resources.getDrawable(R.drawable.sbeiji);
                textView6.setText(String.valueOf(ri+6));textView.setBackground(drawable);
                textView.setText(day);textView.setTextColor(0xffffffff);
                textView1.setText(String.valueOf(ri+1));
                textView2.setText(String.valueOf(ri+2));
                textView3.setText(String.valueOf(ri+3));
                textView4.setText(String.valueOf(ri+4));
                textView5.setText(String.valueOf(ri+5));
                ribi = 1;
            }
            else if (beizi == 2){
                Resources resources=getBaseContext().getResources();
                Drawable drawable=resources.getDrawable(R.drawable.sbeiji);
                textView6.setText(String.valueOf(ri+5));textView1.setBackground(drawable);
                textView.setText(String.valueOf(ri-1));
                textView1.setText(day);textView1.setTextColor(0xffffffff);
                textView2.setText(String.valueOf(ri+1));
                textView3.setText(String.valueOf(ri+2));
                textView4.setText(String.valueOf(ri+3));
                textView5.setText(String.valueOf(ri+4));
                ribi = 2;
            }else if(beizi == 3){
                Resources resources=getBaseContext().getResources();
                Drawable drawable=resources.getDrawable(R.drawable.sbeiji);
                textView6.setText(String.valueOf(ri+3));textView2.setBackground(drawable);
                textView.setText(String.valueOf(ri-2));
                textView1.setText(String.valueOf(ri-1));
                textView2.setText(day);textView2.setTextColor(0xffffffff);
                textView3.setText(String.valueOf(ri+1));
                textView4.setText(String.valueOf(ri+2));
                textView5.setText(String.valueOf(ri+3));
                ribi = 3;
            }else if(beizi == 4){
                Resources resources=getBaseContext().getResources();
                Drawable drawable=resources.getDrawable(R.drawable.sbeiji);
                textView6.setText(String.valueOf(ri+3));textView3.setBackground(drawable);
                textView.setText(String.valueOf(ri-3));
                textView1.setText(String.valueOf(ri-2));
                textView2.setText(String.valueOf(ri-1));
                textView3.setText(day);textView3.setTextColor(0xffffffff);
                textView4.setText(String.valueOf(ri+1));
                textView5.setText(String.valueOf(ri+2));
                ribi = 4;
            }else if(beizi == 5){
                Resources resources=getBaseContext().getResources();
                Drawable drawable=resources.getDrawable(R.drawable.sbeiji);
                textView6.setText(String.valueOf(ri+2));textView4.setBackground(drawable);
                textView.setText(String.valueOf(ri-4));
                textView1.setText(String.valueOf(ri-3));
                textView2.setText(String.valueOf(ri-2));
                textView3.setText(String.valueOf(ri-1));
                textView4.setText(day);textView4.setTextColor(0xffffffff);
                textView5.setText(String.valueOf(ri+1));
                ribi = 5;
            }else if(beizi == 6){
                Resources resources=getBaseContext().getResources();
                Drawable drawable=resources.getDrawable(R.drawable.sbeiji);
                textView6.setText(String.valueOf(ri+1));textView3.setBackground(drawable);
                textView.setText(String.valueOf(ri-5));
                textView1.setText(String.valueOf(ri-4));
                textView2.setText(String.valueOf(ri-3));
                textView3.setText(String.valueOf(ri-2));
                textView4.setText(String.valueOf(ri-1));
                textView5.setText(String.valueOf(ri));textView5.setTextColor(0xffffffff);
                ribi = 6;
            }

    }
    protected void bi(){
        Resources resources=getBaseContext().getResources();
        final Drawable drawable=resources.getDrawable(R.drawable.sbeiji);
        Resources resources1 = getBaseContext().getResources();
        final Drawable drawable1=resources1.getDrawable(R.drawable.sbeiji1);
view.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        textView.setBackground(drawable);textView.setTextColor(0xffffffff);
        textView1.setBackground(drawable1);
        textView2.setBackground(drawable1);
        textView3.setBackground(drawable1);
        textView4.setBackground(drawable1);
        textView5.setBackground(drawable1);
        textView6.setBackground(drawable1);
        bicaolan = 0;
        bicaoshui = 0;

            if (bicaolan == 0){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 1){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 2){textView.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 3){textView3.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 4){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if(bicaolan == 5){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 6){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);}

        if(ribi != bicaolan+1){caobi(ribi);}
    }
});
view2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        textView.setBackground(drawable1);
        textView1.setBackground(drawable);textView1.setTextColor(0xffffffff);
        textView2.setBackground(drawable1);
        textView3.setBackground(drawable1);
        textView4.setBackground(drawable1);
        textView5.setBackground(drawable1);
        textView6.setBackground(drawable1);
        bicaolan = 1;
            if (bicaolan == 0){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 1){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 2){textView.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 3){textView3.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 4){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if(bicaolan == 5){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 6){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);}

        if(ribi != bicaolan+1){caobi(ribi);}
    }
});
view3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        textView.setBackground(drawable1);
        textView1.setBackground(drawable1);
        textView2.setBackground(drawable);textView2.setTextColor(0xffffffff);
        textView3.setBackground(drawable1);
        textView4.setBackground(drawable1);
        textView5.setBackground(drawable1);
        textView6.setBackground(drawable1);
        bicaolan = 2;

            if (bicaolan == 0){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 1){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 2){textView.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 3){textView3.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 4){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if(bicaolan == 5){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 6){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);}

        if(ribi != bicaolan+1){caobi(ribi);}
    }
});
view4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        textView.setBackground(drawable1);
        textView1.setBackground(drawable1);
        textView2.setBackground(drawable1);
        textView3.setBackground(drawable);textView3.setTextColor(0xffffffff);
        textView4.setBackground(drawable1);
        textView5.setBackground(drawable1);
        textView6.setBackground(drawable1);
        bicaolan = 3;

            if (bicaolan == 0){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 1){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 2){textView.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 3){textView1.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 4){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if(bicaolan == 5){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 6){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);}

        if(ribi != bicaolan+1){caobi(ribi);}
    }
});
view5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        textView.setBackground(drawable1);
        textView1.setBackground(drawable1);
        textView2.setBackground(drawable1);
        textView3.setBackground(drawable1);
        textView4.setBackground(drawable);textView4.setTextColor(0xffffffff);
        textView5.setBackground(drawable1);
        textView6.setBackground(drawable1);
        bicaolan = 4;

            if (bicaolan == 0){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 1){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 2){textView.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 3){textView3.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 4){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if(bicaolan == 5){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 6){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);}

        if(ribi != bicaolan+1){caobi(ribi);}
    }
});
view6.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        textView.setBackground(drawable1);
        textView1.setBackground(drawable1);
        textView2.setBackground(drawable1);
        textView3.setBackground(drawable1);
        textView4.setBackground(drawable1);
        textView5.setBackground(drawable);textView5.setTextColor(0xffffffff);
        textView6.setBackground(drawable1);
        bicaolan = 5;

            if (bicaolan == 0){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 1){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 2){textView.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 3){textView3.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 4){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if(bicaolan == 5){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 6){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);}

        if(ribi != bicaolan+1){caobi(ribi);}
    }
});
view7.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {bicaolan = 6;
        textView.setBackground(drawable1);
        textView1.setBackground(drawable1);
        textView2.setBackground(drawable1);
        textView3.setBackground(drawable1);
        textView4.setBackground(drawable1);
        textView5.setBackground(drawable1);
        textView6.setBackground(drawable);textView6.setTextColor(0xffffffff);

            if (bicaolan == 0){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 1){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 2){textView.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 3){textView3.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 4){textView.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView1.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if(bicaolan == 5){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);
                textView6.setTextColor(0xff000000);}
            else if (bicaolan == 6){textView1.setTextColor(0xff000000);
                textView2.setTextColor(0xff000000);
                textView3.setTextColor(0xff000000);
                textView4.setTextColor(0xff000000);
                textView5.setTextColor(0xff000000);
                textView.setTextColor(0xff000000);}

        if(ribi != bicaolan+1){caobi(ribi);}
    }
});
    }
    protected void caobi(int ribi){
        Resources resources=getBaseContext().getResources();
        final Drawable drawable=resources.getDrawable(R.drawable.sbeiji2);
        if (ribi == 0){textView6.setBackground(drawable);textView6.setTextColor(0xff000000);}
        else if (ribi == 1){textView.setBackground(drawable);textView.setTextColor(0xff000000);}
        else if(ribi == 2){textView1.setBackground(drawable);textView1.setTextColor(0xff000000);}
        else if(ribi == 3){textView2.setBackground(drawable);textView2.setTextColor(0xff000000);}
        else if(ribi == 4){textView3.setBackground(drawable);textView3.setTextColor(0xff000000);}
        else if(ribi == 5){textView4.setBackground(drawable);textView4.setTextColor(0xff000000);}
        else if(ribi == 6){textView5.setBackground(drawable);textView5.setTextColor(0xff000000);}
    }
}