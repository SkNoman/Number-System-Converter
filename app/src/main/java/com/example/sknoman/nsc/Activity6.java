package com.example.sknoman.nsc;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {
    Button B1;
    EditText et1;
    TextView T1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        et1 = (EditText)findViewById(R.id.eeee4);
        B1 = (Button)findViewById(R.id.bbbb4);
        T1 = (TextView)findViewById(R.id.tttt4);
        final MediaPlayer mn = MediaPlayer.create(this,R.raw.mn);
        B1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String hex = String.valueOf(et1.getText());
                int dec = Integer.parseInt(String.valueOf(hex),16);
                String bin =Integer.toBinaryString(dec);
                String oct = Integer.toOctalString(dec);

                T1.setText("DEC:"+dec+"\n\n"+" BIN:"+bin+"\n\n"+"OCT:"+oct+"\n\n"+"HEX:"+hex);
                mn.start();


            }
        });

    }
}
