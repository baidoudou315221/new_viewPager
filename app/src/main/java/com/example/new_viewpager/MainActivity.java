package com.example.new_viewpager;

import android.os.Bundle;

import com.example.adapter.ViewPagerAdapter;
import com.example.fragment.MyFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TextView tv_title;
    TabLayout tabLayout;

    ArrayList<MyFragment> fragments;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);

        tabLayout = findViewById(R.id.tabLayout);
        tv_title = findViewById(R.id.tv_title);

        tv_title.setText("白豆豆的TabLayout");

        fragments = new ArrayList<>();
        for(int i = 0;i < 10;i++){
            fragments.add(new MyFragment("标题" + i,"内容" + i));
        }

        adapter = new ViewPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

}