package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  Button incBtn,decBtn,resBtn;
  TextView textview;
    int val=0;

    @Override
   public void onClick(View view){
       switch (view.getId()){

           case R.id.inc:
               incOne(view);
               break;

           case R.id.dec:
               decOne(view);
               break;


           case R.id.reset:
               textview.setText("0");
               break;
           default:
               break;
       }
   }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          textview=findViewById(R.id.textview);
          incBtn=findViewById(R.id.inc);
          decBtn=findViewById(R.id.dec);
          resBtn=findViewById(R.id.reset);
          incBtn.setOnClickListener(this);
          decBtn.setOnClickListener(this);
          resBtn.setOnClickListener(this);




    }
    public void decOne(View view){
        String var=textview.getText().toString();
        val=Integer.parseInt(var);
        if(val>0){
            val=val-1;
        }

        textview.setText(""+val);
    }
    public void incOne(View view){
        String var=textview.getText().toString();
        val=Integer.parseInt(var);
        val=val+1;
        textview.setText(""+val);
    }
    public void reset(View view){
        textview.setText("0");
    }

}