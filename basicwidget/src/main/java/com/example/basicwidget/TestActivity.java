package com.example.basicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void onTextSize(View v) {
        EditText ed = findViewById(R.id.editTextTextPersonName);
        TextView tv = findViewById(R.id.textView);
        TextView tv2 = findViewById(R.id.textView2);
        TextView tv3 = findViewById(R.id.textView3);
        TextView tv4 = findViewById(R.id.textView4);

        if (!"".equals(ed.getText())) {
            int size = Integer.parseInt(ed.getText().toString());
            // setTextSize()
            tv.setTextSize((float) size);
            tv2.setTextSize((float) size);
            tv3.setTextSize((float) size);
            tv4.setTextSize((float) size);
        }
    }

    public void onColorRed(View v) {
        TextView tv = findViewById(R.id.textView);
        TextView tv2 = findViewById(R.id.textView2);
        TextView tv3 = findViewById(R.id.textView3);
        TextView tv4 = findViewById(R.id.textView4);

        tv.setTextColor(Color.parseColor("#b71c1c"));
        tv2.setTextColor(Color.parseColor("#b71c1c"));
        tv3.setTextColor(Color.parseColor("#b71c1c"));
        tv4.setTextColor(Color.parseColor("#b71c1c"));
    }

    public void onColorBlue(View v) {
        TextView tv = findViewById(R.id.textView);
        TextView tv2 = findViewById(R.id.textView2);
        TextView tv3 = findViewById(R.id.textView3);
        TextView tv4 = findViewById(R.id.textView4);

        tv.setTextColor(Color.parseColor("#01579b"));
        tv2.setTextColor(Color.parseColor("#01579b"));
        tv3.setTextColor(Color.parseColor("#01579b"));
        tv4.setTextColor(Color.parseColor("#01579b"));
    }

    public void onTextStyle(View v) {
        TextView tv = findViewById(R.id.textView);
        TextView tv2 = findViewById(R.id.textView2);
        TextView tv3 = findViewById(R.id.textView3);
        TextView tv4 = findViewById(R.id.textView4);

        tv.setTypeface(Typeface.SERIF, Typeface.BOLD);
        tv2.setTypeface(Typeface.SERIF, Typeface.BOLD);
        tv3.setTypeface(Typeface.SERIF, Typeface.BOLD);
        tv4.setTypeface(Typeface.SERIF, Typeface.BOLD);
    }
}