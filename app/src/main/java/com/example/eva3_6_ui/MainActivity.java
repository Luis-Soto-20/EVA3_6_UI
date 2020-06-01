package com.example.eva3_6_ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtVwDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwDatos = findViewById(R.id.txtVwDatos);

        Thread tHilo = new Thread(){
            @Override
            public void run() {
                super.run();
                int i = 0;
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.wtf("MiHilo", i + "");
                    i++;
                }
            }
        };

        tHilo.start();

    }
}
