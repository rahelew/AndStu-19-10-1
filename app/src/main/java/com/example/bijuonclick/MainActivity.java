package com.example.bijuonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean cek = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        Log.i("Info", "ImageView ditekan !!");
        ImageView kyubi = findViewById(R.id.imageView1);
        ImageView shukaku = findViewById(R.id.imageView2);
        if (cek) {
            kyubi.animate().alpha(0).setDuration(1000);
            shukaku.animate().alpha(1).setDuration(1000);
            cek = false;
        } else {
            kyubi.animate().alpha(1).setDuration(1000);
            shukaku.animate().alpha(0).setDuration(1000);
            cek = true;

        }
    }
}