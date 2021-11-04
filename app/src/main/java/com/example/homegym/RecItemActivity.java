package com.example.homegym;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

public class RecItemActivity extends AppCompatActivity {
    private Intent intent;
    private int number;
    private String title;
    private ImageView imageView;
    private TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail); //전환된 xml

        intent = getIntent();
        number = intent.getIntExtra("number", -1);
        title = intent.getStringExtra("title");

        imageView = findViewById(R.id.item_detail_image);
        textView = findViewById(R.id.item_detail_text);

        switch (number)
        {
            case 0://푸쉬업
                imageView.setImageResource(R.drawable.pushup);
                textView.setText("\t\t팔굽혀 펴기 10회 \n");
                textView.append("\n");
                textView.append("\n");
                textView.append("\t팔을 어깨폭 보다 넓게 벌리면 어깨에 포인트를 \n");
                textView.append("\t줄 수 있고, 그보다 좁게 짚으면 삼.두.근을 \n");
                textView.append("\t집중적으로 할 수 있습니다. 상체 근육에 좋은 \n");
                textView.append("\t운동이지만 힘이 쓰이는 방식에 따라 둔근과 \n");
                textView.append("\t복근도 단련할 수 있습니다.\n");
                textView.append("\t그래서 전신운동으로도 많이 활용되고 있습니다.\n");
                break;

            case 1://네거티브 푸쉬업
                imageView.setImageResource(R.drawable.nagativepushup);
                textView.setText("\t\t네거티브 푸쉬업 5회 \n");
                textView.append("\n");
                textView.append("\n");
                textView.append("\t(네거티브 푸쉬업 운동 방법 설명)\n");
                break;

            case 2://덤벨 컬
                imageView.setImageResource(R.drawable.dumbbellcurl);
                textView.setText("\t\t덤벨 컬 10회 \n");
                textView.append("\n");
                textView.append("\n");
                textView.append("\t(덤벨 컬 운동 방법 설명)\n");
                break;
        }
    }
}

