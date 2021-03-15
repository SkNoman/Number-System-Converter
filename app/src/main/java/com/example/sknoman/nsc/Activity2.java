package com.example.sknoman.nsc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    Button b1,b2,b3,b4;
    EditText e1,e2,e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        b1 = findViewById(R.id.B1);
        b2 = findViewById(R.id.B2);
        b3 = findViewById(R.id.B3);
        b4 = findViewById(R.id.B4);
        final MediaPlayer md = MediaPlayer.create(this,R.raw.md);
        final MediaPlayer mb = MediaPlayer.create(this,R.raw.mb);
        final MediaPlayer mc = MediaPlayer.create(this,R.raw.mc);
        final MediaPlayer mh = MediaPlayer.create(this,R.raw.mh);


       b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                md.start();
                openActivity3();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mb.start();
                openActivity4();


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mc.start();
                openActivity5();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mh.start();
                openActivity6();

            }
        });

        }

        public  void openActivity3()
    {
        Intent intent = new Intent(this,Activity3.class);
        startActivity(intent);
    }

    public  void openActivity4()
    {
        Intent intent = new Intent(this,Activity4.class);
        startActivity(intent);
    }

    public  void openActivity5()
    {
        Intent intent = new Intent(this,Activity5.class);
        startActivity(intent);
    }

    public  void openActivity6()
    {
        Intent intent = new Intent(this,Activity6.class);
        startActivity(intent);
    }
}
