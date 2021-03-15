package com.example.sknoman.nsc;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {
    Button B1;
    EditText et1;
    TextView T1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        et1 = (EditText)findViewById(R.id.eee3);
        B1 = (Button)findViewById(R.id.bbb3);
        T1 = (TextView)findViewById(R.id.ttt3);
        final MediaPlayer mn = MediaPlayer.create(this,R.raw.mn);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int oct =Integer.parseInt(et1.getText().toString());
                int dec = Integer.parseInt(String.valueOf(oct),8);
                String bin =Integer.toBinaryString(dec);
                String hex = Integer.toHexString(dec);
                T1.setText("BIN:"+bin+"\n\n"+"DEC:"+dec+"\n\n"+"OCT:"+oct+"\n\n"+"HEX:"+hex);
                mn.start();

            }
        });
    }
}
