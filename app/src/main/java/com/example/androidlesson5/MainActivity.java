package com.example.androidlesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;

import com.example.androidlesson5.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick{
    ActivityMainBinding binding;
    PhoneAdapter adapter;
    ArrayList<Phone> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        arrayList = new ArrayList();
        arrayList.add(new Phone("", R.drawable.img));
        arrayList.add(new Phone("", R.drawable.img_1));
        arrayList.add(new Phone("", R.drawable.img_2));
        arrayList.add(new Phone("", R.drawable.img_3));
        arrayList.add(new Phone("", R.drawable.img_4));
        arrayList.add(new Phone("", R.drawable.img_5));
        arrayList.add(new Phone("", R.drawable.img_6));
        arrayList.add(new Phone("", R.drawable.img_7));
        arrayList.add(new Phone("", R.drawable.img_8));
        arrayList.add(new Phone("", R.drawable.img_9));
        arrayList.add(new Phone("", R.drawable.img_10));

        adapter = new PhoneAdapter(arrayList, this);
        binding.recyclerViewPhone.setAdapter(adapter);
    }

    @Override
    public void OnClick(Phone phone) {
        Intent intent = new Intent(MainActivity.this,DetailContainerActivity.class);
        intent.putExtra("Phone", phone);
        startActivity(intent);
    }
}