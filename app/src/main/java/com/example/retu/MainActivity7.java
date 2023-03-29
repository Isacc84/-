package com.example.retu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity7 extends AppCompatActivity {
    private MyDatabaseHelper dbHelper;
    int a = 2;
    String name;
    String banj;
    String time,ts;
    String leix;
   String cash;
   String kais;
    String jies;
     String liyo;
    String fuji;
    String tony;
    String qinx;
    String cnss;
    Button button,button1;
    TextView item_name,item_banj,item_time,item_leix,item_cash,item_kais,item_jies,item_liyo,item_tony,item_qinx;
    ImageView item_fuji,item_cnss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        dbHelper = new MyDatabaseHelper(this,"Book.db",null,a);
        item_qinx = (TextView) findViewById(R.id.textView30);
        item_tony = (TextView) findViewById(R.id.textView31);
        item_fuji = (ImageView) findViewById(R.id.ImaeView24);
        item_cnss = (ImageView) findViewById(R.id.imageView11);
        item_fuji = (ImageView) findViewById(R.id.ImaeView24);
        item_liyo = (TextView) findViewById(R.id.textView24);
        item_jies = (TextView) findViewById(R.id.textView22);
        item_kais = (TextView) findViewById(R.id.textView21);
        item_cash = (TextView) findViewById(R.id.textView20);
        item_leix = (TextView) findViewById(R.id.textView19);
        item_time = (TextView) findViewById(R.id.textView17);
        item_banj = (TextView) findViewById(R.id.textView16);
        item_name = (TextView) findViewById(R.id.textView9);
        recy();
    }
    private void recy(){
        final SQLiteDatabase db = dbHelper.getWritableDatabase();
        List<MemoBean1> arr = new ArrayList();
        Cursor cursor = db.rawQuery("select * from Book",null);
        if (cursor.moveToLast()){
                name = cursor.getString(cursor.getColumnIndex("name"));
                banj = cursor.getString(cursor.getColumnIndex("banj"));
                time = cursor.getString(cursor.getColumnIndex("time"));
                leix = cursor.getString(cursor.getColumnIndex("leix"));
                cash = cursor.getString(cursor.getColumnIndex("cash"));
                kais = cursor.getString(cursor.getColumnIndex("kais"));
                jies = cursor.getString(cursor.getColumnIndex("jies"));
                liyo = cursor.getString(cursor.getColumnIndex("liyo"));
                tony = cursor.getString(cursor.getColumnIndex("tony"));
                qinx = cursor.getString(cursor.getColumnIndex("qinx"));
                cnss = cursor.getString(cursor.getColumnIndex("cnss"));
                ts = cursor.getString(cursor.getColumnIndex("kais"));
        }cursor.close();
        item_name.setText("申请人：" + name);
        item_banj.setText("银川能源学院-信息传媒学院-数据科学与大数据技术-" + banj);
        item_time.setText(time);
        item_leix.setText(leix);
                        item_cash.setText(cash);
                                item_kais.setText(kais);
                                        item_jies.setText(jies);
                                                item_liyo.setText(liyo);
                                                        item_tony.setText(tony);
                                                                item_qinx.setText(time);
//        Toast.makeText(this, ts, Toast.LENGTH_SHORT).show();
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues values = new ContentValues();
                values.put("qinx","销假");
                db.update("Book",values,"kais = ?",new String[] {ts});
            }
        });
        button1 = (Button)findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues values = new ContentValues();
                values.put("qinx","请假");
                db.update("Book",values,"kais = ?",new String[] {ts});
            }
        });
        int color = Color.argb(255,23,118,208);
        int color1 = Color.argb(255,7,172,192);
        GradientDrawable gradientDrawable = new  GradientDrawable();
        gradientDrawable.setShape(GradientDrawable.RECTANGLE);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(20);
        GradientDrawable gradientDrawable1 = new  GradientDrawable();
        gradientDrawable1.setShape(GradientDrawable.RECTANGLE);
        gradientDrawable1.setColor(color1);
        gradientDrawable1.setCornerRadius(20);
        button.setBackground(gradientDrawable);
        button1.setBackground(gradientDrawable1);

    }
}