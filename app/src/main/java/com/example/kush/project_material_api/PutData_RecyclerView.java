package com.example.kush.project_material_api;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kush on 2018. 6. 22..
 */

public class PutData_RecyclerView implements View.OnClickListener {

    private View view;
    private Context context;

    NewsItems newsItems;
    NewsRecyclerAdapter adapter;

    EditText text;
    RecyclerView recyclerView;

    public PutData_RecyclerView(View view, Context context){
        this.view = view;
        this.context = context;

        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
    }
    public void putData(){
        Button btn = (Button) view.findViewById(R.id.searchBtn);
        text = (EditText) view.findViewById(R.id.searchEdit);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        btn.setOnClickListener(this);
//
    }

    @Override
    public void onClick(View view) {
        String key = text.getText().toString();
        getNewsList(key);
    }

    private void getNewsList(String key) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://openapi.naver.com/").addConverterFactory(GsonConverterFactory.create()).build();

        NaverApiService apiService = retrofit.create(NaverApiService.class);
        Call<NewsItems> call = apiService.getSearchItems(key, "10", "1", "sim");
        call.enqueue(new Callback<NewsItems>() {

            @Override
            public void onResponse(Call<NewsItems> call, Response<NewsItems> response) {

                if (response.isSuccessful()) {
                    newsItems = response.body();

                    if (!newsItems.getItems().isEmpty()) {
                        adapter = new NewsRecyclerAdapter(newsItems, context);
                        recyclerView.setAdapter(adapter);
                    }
                    Log.d(newsItems.getItems().get(1).getTitle(), newsItems.getItems().get(1).getDescription());
                }
            }

            @Override
            public void onFailure(Call<NewsItems> call, Throwable t) { call.cancel(); }
        });

    }
}
