package com.example.androidlesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidlesson5.databinding.ActivityDetailContainerBinding;

public class DetailContainerActivity extends AppCompatActivity {

    ActivityDetailContainerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailContainerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Phone phone = (Phone) getIntent().getSerializableExtra("black");
        DetailFragment detailFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", "Tom and Jerry");
        bundle.putSerializable("phone", phone);
        detailFragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().add(R.id.container_view, detailFragment).commit();
    }
}