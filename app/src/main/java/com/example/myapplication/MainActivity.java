package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 레이아웃 -> java code
        // R class > 리소스 종류 클래스 > 리소스 값
        setContentView(R.layout.activity_main);

        // 버튼 : findViewById()
        // 최상위 조상 클래스 : View class
        Button btn = findViewById(R.id.button);

        String str = (String) btn.getText();

        // logcat 출력
        // System.out.println() -> logcat
        Log.i("버튼", str);

        btn.setText("선택해줘");

        str = (String) btn.getText();
        Log.i("버튼", str);


        Button btn2 = findViewById(R.id.button2);

        TextView result = findViewById(R.id.textView2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setText("선택했구나!" + (++cnt));
                Log.d("버튼2", ""+cnt);

                result.setText(cnt+ "만큼 눌렀어");

                Toast.makeText(MainActivity.this, cnt+"만큼 눌렀어", Toast.LENGTH_SHORT).show();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setText("환영해" + (++cnt));
                Log.d("버튼", ""+cnt);

                result.setText(cnt+"만큼 선택했어");

                Toast.makeText(MainActivity.this, cnt+"만큼 선택했어", Toast.LENGTH_SHORT).show();
            }
        });


        // 체크박스 이벤트
        CheckBox cb = findViewById(R.id.checkBox);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });

        // 레이팅바 이벤트
        RatingBar rb = findViewById(R.id.ratingBar);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            }
        });

        // 스위치 이벤트
        Switch sw = findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });



    }
}