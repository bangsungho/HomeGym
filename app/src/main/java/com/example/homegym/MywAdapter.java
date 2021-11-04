package com.example.homegym;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MywAdapter extends RecyclerView.Adapter<MywAdapter.ViewHolder>{
    private ArrayList<WrecItem> witemList;
    private Context wcontext;
    private Intent wintent;
    ImageView wimageView;

    public MywAdapter(ArrayList<WrecItem> witemList) {
        this.witemList = witemList;
    }

    @NonNull
    @Override
    public MywAdapter.ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.witem_view,parent,false);

        return new MywAdapter.ViewHolder(view);
    }//아이템 뷰로 사용 될 xml inflate 시킴

    @Override
    public void onBindViewHolder(@NonNull MywAdapter.ViewHolder holder, final int position) {
        holder.imageView.setImageResource(witemList.get(position).getItem_image());
        holder.textView.setText(witemList.get(position).getItem_title());   //viewHolder 객체

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wintent = new Intent(v.getContext(), WrecItemActivity.class);
                wintent.putExtra("wnumber", position);
                wintent.putExtra("wtitle",witemList.get(position).getItem_title());
                v.getContext().startActivity(wintent);
                Toast.makeText(v.getContext(), "클릭 되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }//뷰안에 필요한 정보 채움

    @Override
    public int getItemCount() {//data set 전체크기
        return witemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.witem_image);
            textView = itemView.findViewById(R.id.witem_text); //파라메타 id 찾기
        }

    }
}
