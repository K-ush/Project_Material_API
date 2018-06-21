package com.example.kush.project_material_api;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
 * Created by kush on 2018. 6. 21..
 */

public class ViewPagerAdapter extends PagerAdapter {
    private LayoutInflater mInflater;
    EditText text;
    NewsItems newsItems;
    NewsRecyclerAdapter adapter;
    RecyclerView recyclerView;
    Context context;
    String msg = "";
    View view = null;

    TextView tv;

    public ViewPagerAdapter(LayoutInflater inflater, Context context) {
        this.mInflater = inflater;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

//        View view = mInflater.inflate(R.layout.fragment_page, null);
//        container.addView(view);
        switch (position) {
            case 1:
                view = mInflater.inflate(R.layout.fragment_two, null);
                container.addView(view);
                break;
            case 2:
                view = mInflater.inflate(R.layout.fragment_three, null);
                container.addView(view);
                break;

            case 0:
                view = mInflater.inflate(R.layout.fragment_one, null);
                container.addView(view);

                PutData_RecyclerView pr = new PutData_RecyclerView(view, context);
                pr.putData();
                break;
        }
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
//        return "Fragment "+position;
        String msg = "";
        switch (position) {
            case 0:
                msg = "NEWS";
                break;
            case 1:
                msg = "PRODUCT";
                break;
            case 2:
                msg = "KWON";
                break;
        }

        return msg;
    }





}

