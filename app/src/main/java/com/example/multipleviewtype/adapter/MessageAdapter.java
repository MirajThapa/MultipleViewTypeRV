package com.example.multipleviewtype.adapter;

import static com.example.multipleviewtype.model.ModelClass.LAYOUT_FOUR;
import static com.example.multipleviewtype.model.ModelClass.LAYOUT_ONE;
import static com.example.multipleviewtype.model.ModelClass.LAYOUT_THREE;
import static com.example.multipleviewtype.model.ModelClass.LAYOUT_TWO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multipleviewtype.ItemClickListener;
import com.example.multipleviewtype.R;
import com.example.multipleviewtype.adapter.viewholder.ReceiverImageVH;
import com.example.multipleviewtype.adapter.viewholder.ReceiverMessageVH;
import com.example.multipleviewtype.adapter.viewholder.SenderImageVH;
import com.example.multipleviewtype.adapter.viewholder.SenderMessageVH;
import com.example.multipleviewtype.model.ModelClass;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter {

    List<ModelClass> modelClasses;

    ItemClickListener itemClickListener;

    public MessageAdapter(List<ModelClass> modelClasses) {
        this.modelClasses = modelClasses;
    }

    public void setIClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

    @Override
    public int getItemViewType(int position) {
        switch (modelClasses.get(position).getViewType())
        {
            case 1:
                return LAYOUT_ONE;

            case 2:
                return LAYOUT_TWO;

            case 3:
                return LAYOUT_THREE;

            case 4:
                return LAYOUT_FOUR;

            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType){
            case LAYOUT_ONE:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.receiver_message_layout,parent,false);
                return new ReceiverMessageVH(view, itemClickListener);

            case LAYOUT_TWO:
                View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.sender_message_layout,parent,false);
                return new SenderMessageVH(view1, itemClickListener);

            case LAYOUT_THREE:
                View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.receiver_image_layout,parent,false);
                return new ReceiverImageVH(view2, itemClickListener);

            case LAYOUT_FOUR:
                View view3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.sender_image_layout,parent,false);
                return new SenderImageVH(view3, itemClickListener);

            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ModelClass modelClass = modelClasses.get(position);

        switch (modelClasses.get(position).getViewType())
        {
            case LAYOUT_ONE:
                ReceiverMessageVH receiverMessageVH = (ReceiverMessageVH) holder;
                receiverMessageVH.onBind(modelClass);
                break;

            case LAYOUT_TWO:
                String senderText = modelClasses.get(position).getMessage();
                ((SenderMessageVH) holder).setTextView(senderText);
                break;

            case LAYOUT_THREE:
                int receiverImage = modelClasses.get(position).getImage();
                ((ReceiverImageVH) holder).setTextView(receiverImage);
                break;

            case LAYOUT_FOUR:
                int senderImage = modelClasses.get(position).getImage();
                ((SenderImageVH) holder).setTextView(senderImage);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return modelClasses.size();
    }

}
