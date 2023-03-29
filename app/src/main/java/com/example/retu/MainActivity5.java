package com.example.retu;

import android.os.Bundle;

import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.blankj.utilcode.util.UriUtils;
import com.bumptech.glide.Glide;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity5 extends AppCompatActivity {
    private MyDatabaseHelper dbHelper;
    int a = 2;
    public static final int CHOSE_PHOTO = 22;
    private ImageView picture,picture2;
    private Uri imageUri;
    Calendar cal;
    String year;
    String month;
    String day;
    String hour;
    String minute;
    String second;
    String my_time_1;
    String tmp_path;
    String disp_path,disp_path1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            StrictMode.setVmPolicy(builder.build());
        }
        picture = (ImageView) findViewById(R.id.hua1);
        picture2 = (ImageView) findViewById(R.id.hua2);
        dbHelper = new MyDatabaseHelper(this,"Book.db",null,a);
        timeget();
        btnOnClick();
        saveget();
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
        my_time_1 = year + month + day + hour + minute + second;;

    }


    private void saveget(){
        Button addData = (Button) findViewById(R.id.baocun);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + 1;
                final EditText edit_1 = findViewById(R.id.edit_1);
                final EditText edit_2 = findViewById(R.id.edit_2);
                final EditText edit_3 = findViewById(R.id.edit_3);
                final EditText edit_4 = findViewById(R.id.edit_4);
                final EditText edit_5 = findViewById(R.id.edit_5);
                final EditText edit_6 = findViewById(R.id.edit_6);
                final EditText edit_7 = findViewById(R.id.edit_7);
                final EditText edit_8 = findViewById(R.id.edit_8);
                final EditText edit_9 = findViewById(R.id.edit_9);
                final EditText edit_10 = findViewById(R.id.edit_10);
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("name",edit_1.getText().toString());
                values.put("fuji",disp_path);
                values.put("cnss",disp_path1);
                values.put("banj",edit_2.getText().toString());
                values.put("time",edit_3.getText().toString());
                values.put("leix",edit_4.getText().toString());
                values.put("cash",edit_5.getText().toString());
                values.put("kais",edit_6.getText().toString());
                values.put("jies",edit_7.getText().toString());
                values.put("liyo",edit_8.getText().toString());
                values.put("tony",edit_9.getText().toString());
                values.put("qinx",edit_10.getText().toString());
                db.insert("Book",null,values);
//                Toast.makeText(MainActivity5.this, "村成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity5.this,MainActivity4.class);
                startActivity(intent);
            }
        });
        Button xiuzhenyaoye = (Button) findViewById(R.id.button5);
        xiuzhenyaoye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + 1;
                final EditText edit_1 = findViewById(R.id.edit_1);
                final EditText edit_2 = findViewById(R.id.edit_2);
                final EditText edit_3 = findViewById(R.id.edit_3);
                final EditText edit_4 = findViewById(R.id.edit_4);
                final EditText edit_5 = findViewById(R.id.edit_5);
                final EditText edit_6 = findViewById(R.id.edit_6);
                final EditText edit_7 = findViewById(R.id.edit_7);
                final EditText edit_8 = findViewById(R.id.edit_8);
                final EditText edit_9 = findViewById(R.id.edit_9);
                final EditText edit_10 = findViewById(R.id.edit_10);
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("name",edit_1.getText().toString());
                values.put("fuji",disp_path);
                values.put("cnss",disp_path1);
                values.put("banj",edit_2.getText().toString());
                values.put("time",edit_3.getText().toString());
                values.put("leix",edit_4.getText().toString());
                values.put("cash",edit_5.getText().toString());
                values.put("kais",edit_6.getText().toString());
                values.put("jies",edit_7.getText().toString());
                values.put("liyo",edit_8.getText().toString());
                values.put("tony",edit_9.getText().toString());
                values.put("qinx",edit_10.getText().toString());
                String ts = edit_6.getText().toString();
                db.update("Book",values,"kais = ?",new String[] {ts});
//                Toast.makeText(MainActivity5.this, "村成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity5.this,MainActivity4.class);
                startActivity(intent);
            }
        });
    }
    private void btnOnClick() {
        Button zhao = (Button) findViewById(R.id.button2);
        zhao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeget();
                tmp_path = Environment.getExternalStorageDirectory()+"/image"+
                        my_time_1
                        +".jpg";
                File imgfile = new File(tmp_path);
                try {
                    imgfile.createNewFile();
                }catch ( IOException e){
                    e.printStackTrace();
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(imgfile));
                startActivityForResult(intent,11);
            }
        });
        Button tu = (Button) findViewById(R.id.button3);
        tu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(MainActivity5.this, Manifest
                        .permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(MainActivity5.this
                            ,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
                }else {
                    openAlbum();
                }
            }
        });
    }
    private void openAlbum(){
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        startActivityForResult(intent,CHOSE_PHOTO);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 11:
                if (resultCode == RESULT_OK) {
                    disp_path = tmp_path;
                    Glide.with(MainActivity5.this).load(disp_path).into(picture);
                }
                break;
            case 22:
                Uri imageuri = data.getData();
                if (imageuri == null) {
                    return;
                }
                disp_path1 = UriUtils.uri2File(imageuri).getPath();
                Glide.with(MainActivity5.this).load(disp_path1).into(picture2);
                break;
            default:
                break;
        }
    }

}
