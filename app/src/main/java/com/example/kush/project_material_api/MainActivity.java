package com.example.kush.project_material_api;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

//public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
//
//    ViewPager viewPager;
//    TabLayout tabLayout;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        viewPager = (ViewPager)findViewById(R.id.viewpager);
//        tabLayout = (TabLayout)findViewById(R.id.tabs);
//
//        tabLayout=(TabLayout)findViewById(R.id.tabs);
//        tabLayout.setOnTabSelectedListener(this);
//        tabLayout.setupWithViewPager(viewPager);
//
//        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
//    }
//
//    @Override
//    public void onTabSelected(TabLayout.Tab tab) {
//        viewPager.setCurrentItem(tab.getPosition());
//    }
//
//    @Override
//    public void onTabUnselected(TabLayout.Tab tab) {
//
//    }
//
//    @Override
//    public void onTabReselected(TabLayout.Tab tab) {
//
//    }
//
//    private class MyPagerAdapter extends FragmentPagerAdapter {
//
//        List<Fragment> fragments = new ArrayList<>();
//        String titles[] = new String[]{"NEWS", "PRODUCT", "KWON"};
//
//        public MyPagerAdapter(FragmentManager fm) {
//            super(fm);
//            fragments.add(new OneFragment());
//            fragments.add(new TwoFragment());
//            fragments.add(new ThreeFragment());
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return fragments.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return fragments.size();
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return titles[position];
//        }
//    }
//}

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getLayoutInflater());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

