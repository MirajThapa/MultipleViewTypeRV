package com.example.multipleviewtype.adapter.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtype.ItemClickListener;
import com.example.multipleviewtype.R;

public class SenderMessageVH extends RecyclerView.ViewHolder {
    private final TextView textView;
    private ItemClickListener itemClickListener;

    public SenderMessageVH(View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        textView = itemView.findViewById(R.id.sender_text_msg);
        this.itemClickListener = itemClickListener;

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClickListener.onSenderMessageClick();
            }
        });
    }

    public void setTextView(String text) {
        textView.setText(text);
    }

}