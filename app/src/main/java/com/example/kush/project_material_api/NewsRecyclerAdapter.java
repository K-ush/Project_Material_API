package com.example.kush.project_material_api;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NewsRecyclerAdapter extends RecyclerView.Adapter<ItemHolder> {

    NewsItems newsItems;
    Context context;

//    ArrayList<BookItems> datas;
    CardView cardView;
    ImageView list_img;
    TextView txt_title, txt_content, txt_date;

    public NewsRecyclerAdapter(NewsItems datas, Context context) {
        this.newsItems = datas;
        this.context = context;
    }

    @Override
    // 필수로 Generate 되어야 하는 메소드 1 : 새로운 뷰 생성
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_list_item, parent, false);
        ItemHolder holder = new ItemHolder(view);
        return holder;
    }


    // 필수로 Generate 되어야 하는 메소드 2 : ListView의 getView 부분을 담당하는 메소드
    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, final int position) {
        cardView = holder.cardView;
        txt_title = holder.txt_title;
        txt_content = holder.txt_description;
        txt_date = holder.txt_pubDate;

        txt_title.setText(Html.fromHtml(newsItems.getItems().get(position).getTitle()));
        txt_content.setText(Html.fromHtml(newsItems.getItems().get(position).getDescription()));
        txt_date.setText(newsItems.getItems().get(position).getPubDate());

        cardView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String link = newsItems.getItems().get(position).getLink();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                context.startActivity(intent);

            }
        });
    }

    // 필수로 Generate 되어야 하는 메소드 3
    @Override
    public int getItemCount() {

        return newsItems.getItems().size();
    }


}
