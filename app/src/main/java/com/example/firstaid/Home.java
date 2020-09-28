package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    ImageView covid,headinjury,heartattack, allergy,hypothermia,diabetic,heartstroke;
    TextView t1,t7,t8,t9,t10,t11,t12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        covid = (ImageView) findViewById(R.id.covidpic);
        covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Covid19.class);
                startActivity(intent);
            }
        });
        t1 = (TextView) findViewById(R.id.covidtxt);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Covid19.class);
                startActivity(intent);
            }
        });
        t7 = (TextView) findViewById(R.id.headtxt);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Head_Injury.class);
                startActivity(intent);
            }
        });
        t8 = (TextView) findViewById(R.id.hearttxt);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Covid19.class);
                startActivity(intent);
            }
        });
        t9 = (TextView) findViewById(R.id.allergytxt);
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Covid19.class);
                startActivity(intent);
            }
        });
        t10 = (TextView) findViewById(R.id.hypotxt);
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Covid19.class);
                startActivity(intent);
            }
        });
        t11 = (TextView) findViewById(R.id.diabetictxt);
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Covid19.class);
                startActivity(intent);
            }
        });
        t12 = (TextView) findViewById(R.id.hearttxt);
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Covid19.class);
                startActivity(intent);
            }
        });

    }
}