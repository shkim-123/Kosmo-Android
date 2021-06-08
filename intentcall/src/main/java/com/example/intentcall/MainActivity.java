package com.example.intentcall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHomepage(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://shkim-123.github.io"));
        startActivity(intent);
    }

    public void onPhone(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/1111-1111"));
        startActivity(intent);
    }

    public void onGallery(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
        startActivity(intent);
    }

    public void onFinish(View v) {
        finish();
    }

    public void onRed(View v) {
        Button btn_reset = findViewById(R.id.button7);
        LinearLayout layout = findViewById(R.id.my_linearLayout);
        layout.setBackgroundColor(Color.parseColor("#b71c1c"));
        btn_reset.setVisibility(View.VISIBLE);
    }

    public void onBlue(View v) {
        Button btn_reset = findViewById(R.id.button7);
        LinearLayout layout = findViewById(R.id.my_linearLayout);
        layout.setBackgroundColor(Color.parseColor("#0d47a1"));
        btn_reset.setVisibility(View.VISIBLE);
    }

    public void onReset(View v) {
        Button btn_reset = findViewById(R.id.button7);
        LinearLayout layout = findViewById(R.id.my_linearLayout);
        layout.setBackgroundColor(Color.parseColor("#FFFFEE"));
        btn_reset.setVisibility(View.GONE);
    }

}