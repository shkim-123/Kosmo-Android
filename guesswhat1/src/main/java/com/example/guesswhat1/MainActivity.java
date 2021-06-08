package com.example.guesswhat1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guesswhat_layout1);

        Button ok = findViewById(R.id.button);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double rnd = Math.random();

                int int_rnd = (int)(rnd*22 + 1);

                Toast.makeText(MainActivity.this, ""+int_rnd, Toast.LENGTH_SHORT).show();
            }
        });

    }
}