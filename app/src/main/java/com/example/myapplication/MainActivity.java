package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


     Button button1;
     EditText editTextid;
     //átadja a masik acti nek
     SharedPreferences sharedPref;
     SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ini();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //átadja a masik aci nek
                String nev= editTextid.getText().toString();
                editor.putString("neved",nev);
                editor.commit();
                 // idá igg átadja a masik aci nek
                Intent masikac= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(masikac);
                finish();
            }
        });
    }

    private void ini() {
        button1 =findViewById(R.id.but_1);
        editTextid = findViewById(R.id.edittextid);
        sharedPref = getSharedPreferences("adatok", Context.MODE_PRIVATE);
        editor = sharedPref.edit();
    }
}