package com.example.homegym;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LrecItemActivity extends AppCompatActivity {
    private Intent lintent;
    private int lnumber;
    private String ltitle;
    private ImageView limageView;
    private TextView ltextView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.litem_detail);

        lintent = getIntent();
        lnumber = lintent.getIntExtra("lnumber", -1);
        ltitle = lintent.getStringExtra("ltitle");

        limageView = findViewById(R.id.litem_detail_image);
        ltextView = findViewById(R.id.litem_detail_text);

        switch (lnumber)
        {
            case 0://스쿼트
                limageView.setImageResource(R.drawable.squat);
                ltextView.setText("\t\t스쿼트 20회 \n");
                ltextView.append("\n");
                ltextView.append("\n");
                ltextView.append("\t내려간다는 느낌보다는 골반과 무릎을 동시에 \n");
                ltextView.append("\t서서히 푼다는 느낌으로 하고, 골반이 말리지 \n");
                ltextView.append("\t않도록 코어를 유지한 상태에서 내려가야 합니 \n");
                ltextView.append("\t다. \n");
                break;

            case 1://덤벨 스쿼트
                limageView.setImageResource(R.drawable.dumbbellsquat);
                ltextView.setText("\t\t덤벨 스쿼트 10회 \n");
                ltextView.append("\n");
                ltextView.append("\n");
                ltextView.append("\t(덤벨 스쿼트 운동 방법 설명)\n");
                break;
        }
    }//전환된 xml
}
