package com.example.homegym;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//하체
public class LowerActivity extends Activity {
    public RecyclerView recyclerView;
    ArrayList<LrecItem> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lower);

        recyclerView = findViewById(R.id.recycler_view_1);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this); //상하
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(),1));
//      RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
//                LinearLayoutManager.HORIZONTAL,false); //좌우
//       RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3); //3개 상하 나오게
//      RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2,
//                LinearLayoutManager.HORIZONTAL,false); //2개 좌우 나오게

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MylAdapter(insertItem()));

    }

    ArrayList insertItem()
    {
        itemList = new ArrayList<>();
        LrecItem item1 = new LrecItem(R.drawable.squat, "스쿼트");
        LrecItem item2 = new LrecItem(R.drawable.dumbbellsquat, "덤벨 스쿼트");


        itemList.add(item1);
        itemList.add(item2);
        return itemList;
    }
}
