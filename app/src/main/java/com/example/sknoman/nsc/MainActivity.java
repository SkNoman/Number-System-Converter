package com.example.sknoman.nsc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   Button b1;
   EditText user,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.c1);
        user = (EditText) findViewById(R.id.E1);
        password = (EditText) findViewById(R.id.E2);


      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              openActivity2();

          }
      });
    }
  public  void openActivity2() {
      if (user.getText().toString().equals("noman") && password.getText().toString().equals("654321")) {
          Intent intent = new Intent(this, Activity2.class);
          startActivity(intent);
          Toast.makeText(this, "Welcome Login Succesfull", Toast.LENGTH_SHORT).show();
      } else {
          Toast.makeText(this, "Login Faild", Toast.LENGTH_SHORT).show();
      }
  }
}

