package com.example.app_linear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int o1 = 0;
    int o2 = 0;
    int op = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.calc_layout);

        // Button btn = findViewById(R.id.button1);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(R.layout.calc_layout);
//            }
//        });


        Button btn2 = findViewById(R.id.button20);

        Button plus = findViewById(R.id.button15);
        Button minus = findViewById(R.id.button11);
        Button multi = findViewById(R.id.button71);
        Button enter = findViewById(R.id.button19);

        Button n1 = findViewById(R.id.button12);
        Button n2 = findViewById(R.id.button13);
        Button n3 = findViewById(R.id.button14);
        Button n4 = findViewById(R.id.button8);
        Button n5 = findViewById(R.id.button9);
        Button n6 = findViewById(R.id.button10);
        Button n7 = findViewById(R.id.button5);
        Button n8 = findViewById(R.id.button6);
        Button n9 = findViewById(R.id.button7);
        Button n0 = findViewById(R.id.button17);
        TextView tv = findViewById(R.id.textView2);
        TextView tv2 = findViewById(R.id.textView3);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o1 = Integer.valueOf(n1.getText().toString());
                tv.setText("" + o1);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 0;
                tv2.setText("" + o1 + "+");
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o2 = 3;
                tv.setText("" + o2);
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (op == 0) { // plus
                    tv.setText("" + (o1 + o2));
                    tv2.setText("" + o1 + "+" + o2 + "=" );
                }
            }
        });

    }
}