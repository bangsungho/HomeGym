package com.example.homegym;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
// 전신 운동 방법 각 운동법
public class WrecItemActivity extends AppCompatActivity {
    private Intent wintent;
    private int wnumber;
    private String wtitle;
    private ImageView wimageView;
    private TextView wtextView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.witem_detail);

        wintent = getIntent();
        wnumber = wintent.getIntExtra("wnumber", -1);
        wtitle = wintent.getStringExtra("wtitle");

        wimageView = findViewById(R.id.witem_detail_image);
        wtextView = findViewById(R.id.witem_detail_text);

        switch (wnumber)
        {
            case 0://스쿼트
                wimageView.setImageResource(R.drawable.dumbbellsnatch);
                wtextView.setText("\t\t덤벨 스내치 5회 \n");
                wtextView.append("\n");
                wtextView.append("\n");
                wtextView.append("\t(덤벨 스내치 운동 방법 설명)\n");
                break;

            case 1://덤벨 스쿼트
                wimageView.setImageResource(R.drawable.plank);
                wtextView.setText("\t\t플랭크 1회당 10초씩 4회 \n");
                wtextView.append("\n");
                wtextView.append("\n");
                wtextView.append("\t(플랭크 운동 방법 설명)\n");
                break;
        }
    }//전환된 xml
}
