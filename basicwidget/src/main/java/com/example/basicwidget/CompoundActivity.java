package com.example.basicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CompoundActivity extends AppCompatActivity {

    CompoundButton.OnCheckedChangeListener myCheckedListner = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            int id = buttonView.getId();
            CheckBox cb = (CheckBox) buttonView;
            TextView tv = findViewById(R.id.textView5);

            if (isChecked) {
                Toast.makeText(CompoundActivity.this, cb.getText() + " is Checked!", Toast.LENGTH_SHORT).show();

                switch (id) {
                    case R.id.checkBox4:
                        tv.setTextColor(Color.parseColor("#b71c1c"));
                        break;
                    case R.id.checkBox5:
                        tv.setTextColor(Color.parseColor("#01579b"));
                }
            } else {
                Toast.makeText(CompoundActivity.this, cb.getText() + " is Unchecked!!", Toast.LENGTH_SHORT).show();
                tv.setTextColor(Color.GRAY);
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound);

        CheckBox cbAndroid = findViewById(R.id.checkBox);
        CheckBox cbIos = findViewById(R.id.checkBox2);
        CheckBox cbEtc = findViewById(R.id.checkBox3);

        cbAndroid.setOnCheckedChangeListener(myCheckedListner);
        cbIos.setOnCheckedChangeListener(myCheckedListner);
        cbEtc.setOnCheckedChangeListener(myCheckedListner);


        CheckBox cb4 = findViewById(R.id.checkBox4);
        CheckBox cb5 = findViewById(R.id.checkBox5);

        cb4.setOnCheckedChangeListener(myCheckedListner);
        cb5.setOnCheckedChangeListener(myCheckedListner);

/*
        cbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(CompoundActivity.this, cbAndroid.getText() + " is Checked!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CompoundActivity.this, cbAndroid.getText() + " is Unchecked!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbIos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(CompoundActivity.this, cbIos.getText() + " is Checked!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CompoundActivity.this, cbIos.getText() + " is Unchecked!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbEtc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(CompoundActivity.this, cbEtc.getText() + " is Checked!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CompoundActivity.this, cbEtc.getText() + " is Unchecked!", Toast.LENGTH_SHORT).show();
                }
            }
        });
*/

        RadioGroup rg = findViewById(R.id.rGroup1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.radioButton:
                        Toast.makeText(CompoundActivity.this, "남성", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(CompoundActivity.this, "여성", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    public void onAndroid(View v) {
        CheckBox cb = (CheckBox) v;
        // Toast.makeText(CompoundActivity.this, "" + cb.getText(), Toast.LENGTH_SHORT).show();
    }

    public void onIos(View v) {

    }

    public void onEtc(View v) {

    }


}