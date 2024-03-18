package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

public class FiturDeteksi extends AppCompatActivity {
    ConstraintLayout layoutCamera;
    ConstraintLayout tombolUnggah;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unggah);

        layoutCamera = findViewById(R.id.layoutKamera);
        tombolUnggah = findViewById(R.id.tombolUnggah);

        layoutCamera.setOnClickListener(v -> startActivity(new Intent(FiturDeteksi.this, DetectorActivity.class)));
        tombolUnggah.setOnClickListener(v -> startActivity(new Intent(FiturDeteksi.this, UploadImage.class)));


        Toolbar toolbar = findViewById(R.id.back_fitur);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });
    }
}
