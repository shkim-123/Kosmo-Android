package com.example.guesswhat1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int rnd, num, cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guesswhat_layout1);

        Button ok = findViewById(R.id.button);

        rnd = getRandomRange(10, 30);
        TextView tv = findViewById(R.id.result_txt);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.editTextNumber);
                String str = ed.getText().toString();

                // 1. 입력 됐는지?
                //  - no : 숫자 입력 요구
                if ("".equals(str)) {
                    Toast.makeText(MainActivity.this, "입력해 주세요", Toast.LENGTH_SHORT).show();
                } else {
                    // 2. 입력
                    //  - rnd 비교
                    String msg;

                    num = Integer.parseInt(str);

                    if (num < 10 || num > 30) {
                        msg = "입력한 값이 10 ~ 30을 벗어났습니다.";
                    } else if (num == rnd) {
                        msg = cnt + "번째 맞추셨습니다.";
                    } else if (num > rnd) {
                        msg = num + "보다 작은 값입니다.";
                    } else {
                        msg = num + "보다 큰 값입니다.";
                    }

                    tv.setText(msg);
                }

                // 3. 횟수 카운팅!
                cnt++;

            }
        });

        Button reset = findViewById(R.id.button_reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 임의의 수 발생
                rnd = getRandomRange(10, 30);

                // 2. 판정결과 텍스트 클리어
                tv.setText("");

                cnt = 0;
            }
        });

    }


    private int getRandomRange(int start, int end) {


        return (int) (Math.random() * 20 + 10);
    }

}