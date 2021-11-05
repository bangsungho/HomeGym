package com.example.homegym;
import android.app.Activity;
import android.os.Bundle;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

//상체 운동법 리스트
public class UpperActivity extends Activity {
    public RecyclerView recyclerView;
    ArrayList<RecItem> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upper);

        recyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this); //상하
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(),1));

//      RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
//                LinearLayoutManager.HORIZONTAL,false); //좌우
//       RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3); //3개 상하 나오게
//      RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2,
//                LinearLayoutManager.HORIZONTAL,false); //2개 좌우 나오게

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MyAdapter(insertItem()));

    }

    ArrayList insertItem()
    {
        itemList = new ArrayList<>();
        RecItem item1 = new RecItem(R.drawable.pushup, "팔굽혀펴기");
        RecItem item2 = new RecItem(R.drawable.nagativepushup, "네거티브 푸쉬업");
        RecItem item3 = new RecItem(R.drawable.dumbbellcurl, "덤벨 컬");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        return itemList;
    }
}

//상체

/*리스트
public class SecondActivity extends Activity {
    private ListView listView;
    private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        adapter = new ListViewAdapter();

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        //listview.setOnItemClickListener(listener);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                int imgRes = ((ListViewItem)adapter.getItem(position)).getIcon();

                // new Intent(현재 Activity의 Context, 시작할 Activity 클래스)
                Intent intent = new Intent(SecondActivity.this, DetailActivity.class);
                // putExtra(key, value)
                intent.putExtra("imgRes", imgRes);
                startActivity(intent);
            }
        });

        adapter.addItem("덤벨", R.drawable.dumbbell, "덤벨 이미지 입니다.");
        adapter.addItem("메뉴 버튼", R.drawable.menu, "메뉴 버튼 이미지 입니다.");
        adapter.addItem("제목3", R.drawable.dumbbell, "내용3");
        adapter.addItem("제목4", R.drawable.dumbbell, "내용4");
        adapter.addItem("제목5", R.drawable.dumbbell, "내용5");

        adapter.notifyDataSetChanged();
    }
}
*/