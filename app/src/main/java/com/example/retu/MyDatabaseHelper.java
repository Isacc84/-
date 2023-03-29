package com.example.retu;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper{
    public static final String CREATE_B = "create table Book ("
            + "id integer primary key autoincrement, "
            + "name text, "
            + "banj text, "
            + "time text, "
            + "leix text, "
            + "cash text, "
            + "kais text, "
            + "jies text, "
            + "liyo text, "
            + "fuji text, "
            + "tony text, "
            + "qinx text, "
            + "cnss text)";
    private Context mContext;
    public MyDatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name,factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_B);
        Toast.makeText(mContext, "", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
