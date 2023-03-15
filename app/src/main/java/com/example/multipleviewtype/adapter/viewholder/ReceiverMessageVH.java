package com.example.multipleviewtype.adapter.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtype.ItemClickListener;
import com.example.multipleviewtype.R;
import com.example.multipleviewtype.model.ModelClass;

public class ReceiverMessageVH extends RecyclerView.ViewHolder {
    private final TextView textView;

    private ItemClickListener itemClickListener;

    public ReceiverMessageVH(View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        textView = itemView.findViewById(R.id.receiver_text_msg);
    }

    public void onBind(ModelClass modelClass) {
        textView.setText(modelClass.getMessage());

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (itemClickListener != null){
                    itemClickListener.onItemClick();
                }
            }
        });

    }



}