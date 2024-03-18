package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layoutDeteksi;
    ConstraintLayout layoutDaftar;
    ImageView icon_toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        layoutDeteksi = findViewById(R.id.layoutDeteksi);
        layoutDaftar = findViewById(R.id.layoutDaftar);
        icon_toolbar = findViewById(R.id.icon_toolbar);

//        icon_toolbar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "ini adalah info", Toast.LENGTH_SHORT).show();
//            }
//        });

        layoutDeteksi.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, FiturDeteksi.class)));
        layoutDaftar.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ListDaun.class)));
        icon_toolbar.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, InfoAplikasi.class)));


    }





}
