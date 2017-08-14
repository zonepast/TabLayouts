package com.example.aff02.scrolltabstwo.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.aff02.scrolltabstwo.R;
import com.example.aff02.scrolltabstwo.adapter.ViewPagerAdapter;
import com.example.aff02.scrolltabstwo.fragments.FragA;
import com.example.aff02.scrolltabstwo.fragments.FragB;
import com.example.aff02.scrolltabstwo.fragments.FragC;

public class CustomTabs extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TextView txt;

    private int[] icons = {

            R.drawable.ic_phone,
            R.drawable.ic_favorite,
            R.drawable.ic_contacts
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tabs);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Custom Tabs");

        viewPager = (ViewPager)findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupIcons();

        txt = (TextView)findViewById(R.id.customttile);
    }

    private void setupIcons() {

        TextView customtextone  = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab,null);
        customtextone.setText("Call");
        customtextone.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.ic_phone,0,0);
        tabLayout.getTabAt(0).setCustomView(customtextone);

        TextView customtexttwo = (TextView)LayoutInflater.from(this).inflate(R.layout.custom_tab,null);
        customtexttwo.setText("Favorites");
        customtexttwo.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.ic_favorite,0,0);
        tabLayout.getTabAt(1).setCustomView(customtexttwo);

        TextView customtextthree = (TextView)LayoutInflater.from(this).inflate(R.layout.custom_tab,null);
        customtextthree.setText("Contacts");
        customtextthree.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.ic_contacts,0,0);
        tabLayout.getTabAt(2).setCustomView(customtextthree);

    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter viewpageradapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewpageradapter.addFragment(new FragA(),"Call");
        viewpageradapter.addFragment(new FragB(),"Favorites");
        viewpageradapter.addFragment(new FragC(),"Contacts");
        viewPager.setAdapter(viewpageradapter);
    }
}
