package com.example.retu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity8 extends AppCompatActivity {
Socket socket = null;
BufferedReader in = null;
BufferedWriter out = null;
BufferedReader wt = null;
String a = "0";
    EditText editText;
    InetAddress add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        editText = (EditText) findViewById(R.id.denlu);
        Button button = (Button)findViewById(R.id.den1uton);
        try {
            add = InetAddress.getByName("47.110.89.55");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        try {
            socket = new Socket(add.getHostAddress(),8848);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            wt = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String sm = editText.getText().toString();
                        try {
                            out.write(sm);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}