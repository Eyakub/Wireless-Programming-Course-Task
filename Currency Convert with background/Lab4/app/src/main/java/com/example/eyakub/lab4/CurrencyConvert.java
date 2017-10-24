package com.example.eyakub.lab4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Eyakub on 10/17/2017.
 */

public class CurrencyConvert extends AppCompatActivity{

    TextView showResult;
    Button btnBack, btnConvert;
    EditText bdtInput;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency_converter);

        showResult = (TextView) findViewById(R.id.resultTV);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnConvert = (Button) findViewById(R.id.btnConvert);
        bdtInput = (EditText) findViewById(R.id.dbtET);
        final RadioButton radioUSD = (RadioButton) findViewById(R.id.radioUSD);
        final RadioButton radioCAD = (RadioButton) findViewById(R.id.radioCAD);


        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currency = bdtInput.getText().toString();
                double convert = Double.parseDouble(currency);

                if(radioUSD.isChecked()){

                    double usd = convert/81;
                    showResult.setText((String.valueOf(usd)));
                }
                if(radioCAD.isChecked()){

                    double cad = convert/60;
                    showResult.setText((String.valueOf(cad)));
                }

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CurrencyConvert.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
