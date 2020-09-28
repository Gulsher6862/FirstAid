package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    ImageView covid;
    TextView t1;

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
    }
}