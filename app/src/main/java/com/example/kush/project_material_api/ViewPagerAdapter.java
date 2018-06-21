package com.example.kush.project_material_api;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by kush on 2018. 6. 21..
 */

public class ViewPagerAdapter extends PagerAdapter {
    private LayoutInflater mInflater;
    EditText text;

    public ViewPagerAdapter(LayoutInflater inflater) {
        this.mInflater = inflater;
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
        View view = null;
        switch(position){
            case 0:
                view = mInflater.inflate(R.layout.fragment_one, null);
                container.addView(view);
                Button btn = (Button)view.findViewById(R.id.searchBtn);
                text = (EditText)view.findViewById(R.id.searchEdit);
                btn.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        String key = text.getText().toString();

//                        getNewsList(key);
                    }
                });
                break;
            case 1:
                view = mInflater.inflate(R.layout.fragment_two, null);
                container.addView(view);
                break;
            case 2:
                view = mInflater.inflate(R.layout.fragment_three, null);
                container.addView(view);
                break;
        }
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
//        return "Fragment "+position;
        String msg = "";
        switch(position){
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

