package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

     Button button2;
    TextView textView;
    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ini();

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viszzaac= new Intent(MainActivity2.this,MainActivity.class);
                startActivity(viszzaac);
                finish();
            }
        });
        String nev=sharedPref.getString("neved","");
        textView.setText("Üdvözöllek"+nev);

    }

    private void ini() {
        button2 = findViewById(R.id.butn_2);
        textView = findViewById(R.id.textview);
        sharedPref  = getSharedPreferences("adatok", Context.MODE_PRIVATE);

    }
}