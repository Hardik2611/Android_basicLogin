package com.example.hardikgoyal_loginspin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {
    Spinner sp;
    Button b;
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sp = findViewById(R.id.spinner);
        b = findViewById(R.id.button3);
        cl = findViewById(R.id.cl);
        ArrayAdapter ar = ArrayAdapter.createFromResource(this,R.array.color, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        sp.setAdapter(ar);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String s1 = adapterView.getItemAtPosition(i).toString();
                if(s1.equals("Red"))
                    cl.setBackgroundResource(R.color.red);
                if(s1.equals("Blue"))
                    cl.setBackgroundResource(R.color.blue);
                if(s1.equals("Green"))
                    cl.setBackgroundResource(R.color.green);
                if(s1.equals("Yellow"))
                    cl.setBackgroundResource(R.color.yellow);
                if(s1.equals("Brown"))
                    cl.setBackgroundResource(R.color.brown);
                if(s1.equals("Select any color..."))
                    cl.setBackgroundResource(R.color.white);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}