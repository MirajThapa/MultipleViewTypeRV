package com.example.multipleviewtype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.multipleviewtype.adapter.MessageAdapter;
import com.example.multipleviewtype.model.ModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    RecyclerView recyclerView;
    ModelClass modelClass;
    MessageAdapter messageAdapter;
    ArrayList<ModelClass> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        addData();

        messageAdapter = new MessageAdapter(list);
        messageAdapter.setIClickListener(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(messageAdapter);
        messageAdapter.notifyDataSetChanged();

    }

    private void initViews() {
        recyclerView = findViewById(R.id.main_rv_section);
    }

    private void addData(){
        list = new ArrayList<>();
        list.add(new ModelClass(ModelClass.LAYOUT_ONE,"This is receiver"));
        list.add(new ModelClass(ModelClass.LAYOUT_TWO,"This is sender"));
        list.add(new ModelClass(ModelClass.LAYOUT_THREE,R.drawable.panda));
        list.add(new ModelClass(ModelClass.LAYOUT_FOUR,R.drawable.panda));
        list.add(new ModelClass(ModelClass.LAYOUT_TWO,"This is sender"));
        list.add(new ModelClass(ModelClass.LAYOUT_THREE,R.drawable.panda));
        list.add(new ModelClass(ModelClass.LAYOUT_ONE,"This is receiver"));
        list.add(new ModelClass(ModelClass.LAYOUT_TWO,"This is hello dost"));
        list.add(new ModelClass(ModelClass.LAYOUT_THREE,R.drawable.panda));


    }

    @Override
    public void onItemClick() {
        Toast.makeText(MainActivity.this, "Happy me", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onReceiverClick() {
        Toast.makeText(MainActivity.this, "Receiver click", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSenderMessageClick() {
        Toast.makeText(MainActivity.this, "Sender click", Toast.LENGTH_SHORT).show();
    }
}