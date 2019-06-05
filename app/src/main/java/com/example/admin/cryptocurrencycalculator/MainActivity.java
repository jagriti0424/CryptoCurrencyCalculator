package com.example.admin.cryptocurrencycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText text;
    Button bitcoin,ethereum,eos,litecoin;

    double show;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result =(TextView)findViewById(R.id.result);
        text =(EditText)findViewById(R.id.text);

        bitcoin =(Button)findViewById(R.id.bitcoin);
        ethereum=(Button)findViewById(R.id.ethereum);
        eos=(Button)findViewById(R.id.eos);
        litecoin=(Button)findViewById(R.id.litecoin);

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num=Integer.parseInt(text.getText().toString());

                show = num*539715.03;
                result.setText(String.valueOf(show));
            }
        });

        ethereum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num=Integer.parseInt(text.getText().toString());

                show = num*16860.33;
                result.setText(String.valueOf(show));
            }
        });

        eos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num=Integer.parseInt(text.getText().toString());

                show = num*434.75;
                result.setText(String.valueOf(show));
            }
        });

        litecoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num=Integer.parseInt(text.getText().toString());

                show = num*7079.67;
                result.setText(String.valueOf(show));
            }
        });
    }
}
