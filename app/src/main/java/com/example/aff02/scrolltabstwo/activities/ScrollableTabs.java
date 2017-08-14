package com.example.aff02.scrolltabstwo.activities;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;

import com.example.aff02.scrolltabstwo.R;
import com.example.aff02.scrolltabstwo.adapter.ViewPagerAdapter;
import com.example.aff02.scrolltabstwo.fragments.FragA;
import com.example.aff02.scrolltabstwo.fragments.FragB;
import com.example.aff02.scrolltabstwo.fragments.FragC;
import com.example.aff02.scrolltabstwo.fragments.FragD;
import com.example.aff02.scrolltabstwo.fragments.FragE;
import com.example.aff02.scrolltabstwo.fragments.FragF;
import com.example.aff02.scrolltabstwo.fragments.FragG;
import com.example.aff02.scrolltabstwo.fragments.FragH;
import com.example.aff02.scrolltabstwo.fragments.FragI;
import com.example.aff02.scrolltabstwo.fragments.FragJ;
import com.example.aff02.scrolltabstwo.fragments.FragK;
import com.example.aff02.scrolltabstwo.fragments.FragL;
import com.example.aff02.scrolltabstwo.fragments.FragM;
import com.example.aff02.scrolltabstwo.fragments.FragN;
import com.example.aff02.scrolltabstwo.fragments.FragO;
import com.example.aff02.scrolltabstwo.fragments.FragP;

/**
 * Created by AFF02 on 12-Aug-17.
 */

public class ScrollableTabs extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollable_tabs);


        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Scrollable Tabs");

        viewPager = (ViewPager)findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter viewpageadapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewpageadapter.addFragment(new FragA(),"First");
        viewpageadapter.addFragment(new FragB(),"Second");
        viewpageadapter.addFragment(new FragC(),"Third");
        viewpageadapter.addFragment(new FragD(),"Fourth");
        viewpageadapter.addFragment(new FragE(),"Fifth");
        viewpageadapter.addFragment(new FragF(),"Sixth");
        viewpageadapter.addFragment(new FragG(),"Seventh");
        viewpageadapter.addFragment(new FragH(),"Eighth");
        viewpageadapter.addFragment(new FragI(),"Ninth");
        viewpageadapter.addFragment(new FragJ(),"Tenth");
        viewpageadapter.addFragment(new FragK(),"Eleventh");
        viewpageadapter.addFragment(new FragL(),"Twelvth");
        viewpageadapter.addFragment(new FragM(),"Thirteenth");
        viewpageadapter.addFragment(new FragN(),"Fourteenth");
        viewpageadapter.addFragment(new FragO(),"Fifteenth");
        viewpageadapter.addFragment(new FragP(),"Sixteenth");
        viewPager.setAdapter(viewpageadapter);
    }
}
