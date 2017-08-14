package com.example.aff02.scrolltabstwo.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.aff02.scrolltabstwo.R;
import com.example.aff02.scrolltabstwo.adapter.ViewPagerAdapter;
import com.example.aff02.scrolltabstwo.fragments.FragA;
import com.example.aff02.scrolltabstwo.fragments.FragB;
import com.example.aff02.scrolltabstwo.fragments.FragC;

public class SimpleTabs extends AppCompatActivity{

   private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_tabs);


        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Simple Tabs");

        viewPager = (ViewPager)findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void setupViewPager (ViewPager viewPager)
    {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment( new FragA(),"Fragment A");
        viewPagerAdapter.addFragment(new FragB(),"Fragment B");
        viewPagerAdapter.addFragment(new FragC(),"Fragment C");
        viewPager.setAdapter(viewPagerAdapter);
    }
   }
