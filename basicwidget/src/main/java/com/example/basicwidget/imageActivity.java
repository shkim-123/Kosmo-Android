package com.example.basicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class imageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_layout);

        setTitle("이미지 보기");

        CheckBox cb = findViewById(R.id.checkBox6);
        TextView tv = findViewById(R.id.textView7);
        TextView tv2 = findViewById(R.id.textView8);
        RadioGroup rg = findViewById(R.id.rGroup2);
        RadioGroup rg2 = findViewById(R.id.rGroup3);
        Button bt = findViewById(R.id.button5);
        Button bt2 = findViewById(R.id.button6);
        ImageView iv = findViewById(R.id.imageView5);

        iv.setScaleType(ImageView.ScaleType.FIT_CENTER);

        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tv.setVisibility(View.VISIBLE);
                    rg.setVisibility(View.VISIBLE);
                 //   bt.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                    rg2.setVisibility(View.VISIBLE);
                    bt2.setVisibility(View.VISIBLE);
                } else {
                    tv.setVisibility(View.INVISIBLE);
                    rg.setVisibility(View.INVISIBLE);
                    bt.setVisibility(View.GONE);
                    iv.setVisibility(View.INVISIBLE);
                    tv2.setVisibility(View.INVISIBLE);
                    rg2.setVisibility(View.INVISIBLE);
                    bt2.setVisibility(View.INVISIBLE);
                }
            }
        });
/*
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setVisibility(View.VISIBLE);
                rg2.setVisibility(View.VISIBLE);
                bt2.setVisibility(View.VISIBLE);
            }
        });
*/
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setVisibility(View.VISIBLE);

                switch (rg.getCheckedRadioButtonId()) {
                    case R.id.radioButton3:
                        iv.setImageResource(R.drawable.puppy1);
                        break;
                    case R.id.radioButton4:
                        iv.setImageResource(R.drawable.puppy2);
                        break;
                    case R.id.radioButton5:
                        iv.setImageResource(R.drawable.puppy3);
                        break;
                    case R.id.radioButton6:
                        iv.setImageResource(R.drawable.dog1);
                }

                switch (rg2.getCheckedRadioButtonId()) {
                    case R.id.radioButton7:
                        iv.setScaleType(ImageView.ScaleType.FIT_XY);
                        break;
                    case R.id.radioButton8:
                        iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        break;
                    case R.id.radioButton9:
                        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        break;
                    case R.id.radioButton10:
                        iv.setScaleType(ImageView.ScaleType.CENTER);
                }
            }
        });
    }
}