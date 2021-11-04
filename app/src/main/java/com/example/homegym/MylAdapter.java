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

class MylAdapter extends RecyclerView.Adapter<MylAdapter.ViewHolder>{
    private ArrayList<LrecItem> litemList;
    private Context lcontext;
    private Intent lintent;
    ImageView limageView;

    public MylAdapter(ArrayList<LrecItem> litemList) {
        this.litemList = litemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.litem_view,parent,false);

        return new ViewHolder(view);
    }//아이템 뷰로 사용 될 xml inflate 시킴

    @Override
    public void onBindViewHolder(@NonNull MylAdapter.ViewHolder holder, final int position) {
        holder.imageView.setImageResource(litemList.get(position).getItem_image());
        holder.textView.setText(litemList.get(position).getItem_title());   //viewHolder 객체

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lintent = new Intent(v.getContext(), LrecItemActivity.class);
                lintent.putExtra("lnumber", position);
                lintent.putExtra("ltitle",litemList.get(position).getItem_title());
                v.getContext().startActivity(lintent);
                Toast.makeText(v.getContext(), "클릭 되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }//뷰안에 필요한 정보 채움

    @Override
    public int getItemCount() {//data set 전체크기
        return litemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.litem_image);
            textView = itemView.findViewById(R.id.litem_text); //파라메타 id 찾기
        }

    }
}
