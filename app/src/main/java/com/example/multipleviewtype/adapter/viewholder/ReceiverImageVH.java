package com.example.multipleviewtype.adapter.viewholder;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtype.ItemClickListener;
import com.example.multipleviewtype.R;

public class ReceiverImageVH extends RecyclerView.ViewHolder {
        private final ImageView imageView;
        private ItemClickListener itemClickListener;
        public ReceiverImageVH(View itemView, ItemClickListener itemClickListener) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_receiver);
            this.itemClickListener = itemClickListener;

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemClickListener.onReceiverClick();
                }
            });


        }

        public void setTextView(int image){
            imageView.setImageResource(image);
        }

}