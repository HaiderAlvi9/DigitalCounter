package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      Button inc;
  TextView textview;
 int val=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          textview=findViewById(R.id.textview);
          inc=findViewById(R.id.inc);

          inc.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  String s;
                  s = textview.getText().toString();
                  val=Integer.parseInt(s);
                  val++;
                  // set text take string
                  //or we can do it like textview.setText(Integer.toString(val));
                  textview.setText(""+val);
              }
          });

    }





    public void decOne(View view){
        String var=textview.getText().toString();
         val=Integer.parseInt(var);
        if(val>0){
            val=val-1;
        }

        textview.setText(""+val);
    }
    public void reset(View view){
        textview.setText("0");
    }
}