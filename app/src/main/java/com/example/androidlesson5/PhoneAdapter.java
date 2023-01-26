package com.example.androidlesson5;

import android.app.SearchManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidlesson5.databinding.ItemPhoneBinding;

import java.util.ArrayList;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneViewHolder>{

    ArrayList<Phone> arrayList;
    OnItemClick onItemClick;

    public PhoneAdapter(ArrayList<Phone> arrayList, OnItemClick onItemClick) {
        this.arrayList = arrayList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhoneViewHolder(ItemPhoneBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.OnClick(arrayList.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

class PhoneViewHolder extends RecyclerView.ViewHolder {

    ItemPhoneBinding binding;


    public PhoneViewHolder(ItemPhoneBinding binding)
    {
        super(binding.getRoot());
        this.binding = binding;
    }

    void onBind(Phone phone) {
        binding.TextViewName.setText(phone.getName());
        binding.ImageViewPhone.setImageResource(phone.getImage());

    }

}
