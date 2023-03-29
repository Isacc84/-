package com.example.retu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity6 extends AppCompatActivity {
    private MyDatabaseHelper dbHelper;
    int a = 2;
    String name;
    String biao;
    String time;
    private String[] data = {};
    RecyclerView recy_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        final View view = (View) findViewById(R.id.view);
        final TextView view0 = (TextView) findViewById(R.id.textView3);
        final TextView view1 = (TextView) findViewById(R.id.textView18);
        final TextView view2 = (TextView) findViewById(R.id.textView4);
        final TextView view3 = (TextView) findViewById(R.id.textView5);
        final View tv = (View) findViewById(R.id.cvi0);
        final View tv1 = (View) findViewById(R.id.cvi1);
        final View tv2 = (View) findViewById(R.id.cvi2);
        view0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources resources=getBaseContext().getResources();
                Drawable drawable3=resources.getDrawable(R.drawable.s93);
                Resources resources4=getBaseContext().getResources();
                Drawable drawable4=resources4.getDrawable(R.drawable.s2);
                view1.setBackground(drawable3);
                view0.setTextColor(0xff16A685);
                view2.setTextColor(0xff717274);
                view3.setTextColor(0xff717274);
                tv.setBackground(drawable4);
                tv1.setBackground(drawable3);
                tv2.setBackground(drawable3);
            }
        });
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources resources3=getBaseContext().getResources();
                Drawable drawable=resources3.getDrawable(R.drawable.s95);
                Resources resources5=getBaseContext().getResources();
                Drawable drawable4=resources5.getDrawable(R.drawable.s2);
                view1.setBackground(drawable);
                view2.setTextColor(0xff16A685);
                view0.setTextColor(0xff717274);
                view3.setTextColor(0xff717274);
                tv1.setBackground(drawable4);
                tv.setBackground(drawable);
                tv2.setBackground(drawable);
            }
        });
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources resources2=getBaseContext().getResources();
                Drawable drawables=resources2.getDrawable(R.drawable.s95);
                Resources resources6=getBaseContext().getResources();
                Drawable drawable6=resources6.getDrawable(R.drawable.s2);
                view1.setBackground(drawables);
                view3.setTextColor(0xff16A685);
                view0.setTextColor(0xff717274);
                view2.setTextColor(0xff717274);
                tv2.setBackground(drawable6);
                tv.setBackground(drawables);
                tv1.setBackground(drawables);
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this,MainActivity4.class);
                startActivity(intent);
            }
        });
        dbHelper = new MyDatabaseHelper(this,"Book.db",null,a);
        recy_view=findViewById(R.id.list_view);
        recy();
//        view0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent0 = new Intent(MainActivity6.this,MainActivity7.class);
//                startActivity(intent0);
//            }
//        });
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity6.this,MainActivity7.class);
                startActivity(intent1);
            }
        });

    }
    private void recy(){
        final SQLiteDatabase db = dbHelper.getWritableDatabase();
        List<MemoBean> arr = new ArrayList();
        Cursor cursor = db.rawQuery("select * from Book",null);
        if (cursor.moveToLast()){
            do {
                name = cursor.getString(cursor.getColumnIndex("qinx"));
                time = cursor.getString(cursor.getColumnIndex("time"));
                biao = cursor.getString(cursor.getColumnIndex("banj"));
                MemoBean memoBean = new MemoBean(name, biao, time);
                arr.add(memoBean);
            }while (cursor.moveToPrevious());
        }cursor.close();
        String ts = name + time + biao;
//        Toast.makeText(this, ts, Toast.LENGTH_SHORT).show();
        MemoAdapter adapter = new MemoAdapter(MainActivity6.this, arr);
        StaggeredGridLayoutManager st = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        recy_view.setLayoutManager(st);
        recy_view.setAdapter(adapter);


    }
    }

