package com.example.guesswhat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener btnListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Button btn = (Button) v;
            int k = Integer.parseInt(btn.getText().toString()); //
            TextView tv = findViewById(R.id.textView);

            if (k == nRand) {
                Toast.makeText(MainActivity.this, "Ok answer is " + k + "입니다.", Toast.LENGTH_SHORT).show();
                tv.setText(cnt + "점!!");
            } else {
                v.setVisibility(View.INVISIBLE);
                cnt -= 5;
            }
        }
    };  // btnListener end

    Button[] buttons = new Button[20];
    int randNum[] = new int[20];    // 20개 임의의 숫자
    private int nRand;
    int cnt = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guesswhat_layout2);


        // 게임 버튼 리스너 초기화
        Resources res = getResources();  // res
        for (int i = 1; i <= 20; i++) {
            // Refelection api
            int id = res.getIdentifier("button" + i, "id", getClass().getPackage().getName());

            buttons[i - 1] = findViewById(id); // R.id.button1
            buttons[i - 1].setOnClickListener(btnListener);
        }

        // 시작 버튼 초기화
        Button btn_start = findViewById(R.id.button_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 난수 초기화 (게임 숫자)
                nRand = getRandomRange(1, 20);

                // 2. 20개 임의의 숫자 발급
                for (int i = 0; i < 20; i++) {
                    randNum[i] = getRandomRange(1, 20);
                    for (int j = 0; j < i; j++) {
                        if (randNum[i] == randNum[j]) {
                            randNum[i] = getRandomRange(1, 20);
                            break;
                        }
                    }
                    buttons[i].setVisibility(View.VISIBLE);
                    buttons[i].setText("" + randNum[i]);
                }

                // 3. 20개 숫자를 버튼 텍스트 전환

            }
        });

        // 리셋 버튼
        Button btn_reset = findViewById(R.id.button_end);
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt = 100;
                btn_start.callOnClick();
            }
        });
    }


    private int getRandomRange(int start, int end) {
        return (int) (Math.random() * 20 + 10);
    }

}