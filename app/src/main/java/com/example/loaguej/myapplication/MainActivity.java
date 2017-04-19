package com.example.loaguej.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

     public void click (View view){

         EditText text = (EditText) findViewById(R.id.editText);
         Log.i ("info", text.getText().toString());
         Toast.makeText(this, text.getText().toString(), Toast.LENGTH_SHORT).show();
     }




}
