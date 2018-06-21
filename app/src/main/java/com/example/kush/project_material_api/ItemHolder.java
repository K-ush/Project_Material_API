package com.example.kush.project_material_api;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemHolder extends RecyclerView.ViewHolder{
    public CardView cardView;
    public TextView txt_title;
    public TextView txt_description;
    public TextView txt_pubDate;


    public ItemHolder(View root) {
        super(root);
        cardView = root.findViewById(R.id.cardView);
        txt_title = (TextView)root.findViewById(R.id.txt_title);
        txt_description = (TextView)root.findViewById(R.id.txt_description);
        txt_pubDate = (TextView) root.findViewById(R.id.txt_pubDate);
    }
}
