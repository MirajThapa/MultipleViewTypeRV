package com.example.multipleviewtype.adapter.viewholder;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtype.ItemClickListener;
import com.example.multipleviewtype.R;

public class SenderImageVH extends RecyclerView.ViewHolder  {
        private final ImageView imageView;
        public SenderImageVH(View itemView, ItemClickListener itemClickListener) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_sender);
        }

        public void setTextView(int image){
            imageView.setImageResource(image);
        }
    }