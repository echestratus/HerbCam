package org.tensorflow.lite.examples.detection;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.tensorflow.lite.examples.detection.databinding.ActivityUserBinding;

public class UserActivity extends AppCompatActivity {

    ActivityUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();

        if (intent != null){

            String lastMessage = intent.getStringExtra("lastMessage");
            String phone = intent.getStringExtra("phone");
            String country = intent.getStringExtra("country");
            int imageid = intent.getIntExtra("imageid",R.drawable.list_lengkuas);

            binding.nameProfil.setText(lastMessage);
            binding.phoneProfile.setText(phone);
            binding.countryProfile.setText(country);
            binding.profileImage.setImageResource(imageid);


        }

    }
}