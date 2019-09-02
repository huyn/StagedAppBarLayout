package com.example.brian.appbarlayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.brian.appbarlayoutdemo.widget.AppBarLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring_app_bar_tab_layout);

        final AppBarLayout appBarLayout = findViewById(R.id.app_bar);

//        ViewPager viewPager = findViewById(R.id.tabs_viewpager);
////        TabLayout tabLayout = findViewById(R.id.tabs);
////        tabLayout.setupWithViewPager(viewPager);
//        viewPager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));
//
//        findViewById(R.id.change_offset).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                appBarLayout.pinHeaderTopBottomOffset(-200);
//            }
//        });

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyItemRecyclerViewAdapter(DummyContent.ITEMS));
    }
}
