package com.example.homegym;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
// 전신 운동법 리스트
public class WholeBodyActivity extends Activity {
    public RecyclerView recyclerView;
    ArrayList<WrecItem> itemList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wholebody);

        recyclerView = findViewById(R.id.recycler_view_2);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this); //상하
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(),1));
//      RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
//                LinearLayoutManager.HORIZONTAL,false); //좌우
//       RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3); //3개 상하 나오게
//      RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2,
//                LinearLayoutManager.HORIZONTAL,false); //2개 좌우 나오게

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MywAdapter(insertItem()));
    }

    ArrayList insertItem()
    {
        itemList = new ArrayList<>();
        WrecItem item1 = new WrecItem(R.drawable.dumbbellsnatch, "덤벨 스내치");
        WrecItem item2 = new WrecItem(R.drawable.plank, "플랭크");

        itemList.add(item1);
        itemList.add(item2);
        return itemList;
    }
}