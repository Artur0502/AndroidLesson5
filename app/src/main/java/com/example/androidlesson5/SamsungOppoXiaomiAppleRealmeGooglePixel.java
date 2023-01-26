package com.example.androidlesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidlesson5.databinding.ActivityMainBinding;
import com.example.androidlesson5.databinding.ActivitySamsungOppoXiaomiAppleRealmeGooglePixelBinding;

public class SamsungOppoXiaomiAppleRealmeGooglePixel extends AppCompatActivity {

    ActivitySamsungOppoXiaomiAppleRealmeGooglePixelBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySamsungOppoXiaomiAppleRealmeGooglePixelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}