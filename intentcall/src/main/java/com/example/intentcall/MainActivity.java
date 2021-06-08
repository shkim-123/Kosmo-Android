package com.example.intentcall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

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
}