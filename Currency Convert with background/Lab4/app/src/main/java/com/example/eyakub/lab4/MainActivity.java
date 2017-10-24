package com.example.eyakub.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button btnChangeBack, btnNextActivity;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNextActivity = (Button) findViewById(R.id.btn2Activity);

        btnChangeBack = (Button) findViewById(R.id.btnBackGround);

        ll = (LinearLayout) findViewById(R.id.ll);

        btnChangeBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll.setBackgroundResource(R.drawable.hi);
            }
        });
        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CurrencyConvert.class);
                startActivity(i);
            }
        });
    }
}
