package com.example.basicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RotationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotation);

        RadioGroup rg = findViewById(R.id.rGroup3);
        RadioGroup rg2 = findViewById(R.id.rGroup4);
        Button bt = findViewById(R.id.button7);

        initUi();

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton11:
                        bt.setEnabled(true);
                        bt.setBackgroundColor(Color.parseColor("#d32f2f"));
                        break;
                    case R.id.radioButton12:
                        bt.setBackgroundColor(Color.GRAY);
                        bt.setEnabled(false);
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = findViewById(R.id.radioButton12);

                if (rb.isChecked()) {
                    Toast.makeText(RotationActivity.this, "disable!!", Toast.LENGTH_SHORT).show();
                } else {
                    switch (checkedId) {
                        case R.id.radioButton13:
                            bt.setRotation(0);
                            break;
                        case R.id.radioButton14:
                            bt.setRotation(45);
                            break;
                        case R.id.radioButton15:
                            bt.setRotation(90);
                            break;
                        case R.id.radioButton16:
                            bt.setRotation(135);
                            break;
                        case R.id.radioButton17:
                            bt.setRotation(180);
                    }
                }

            }
        });
    }


    // 초기 상태 세팅 메서드
    private void initUi() {
        RadioButton rb = findViewById(R.id.radioButton11);
        RadioButton rb2 = findViewById(R.id.radioButton13);

        rb.setChecked(true);
        rb2.setChecked(true);
    }
}