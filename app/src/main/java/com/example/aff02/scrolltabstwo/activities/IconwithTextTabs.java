package com.example.aff02.scrolltabstwo.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.aff02.scrolltabstwo.R;
import com.example.aff02.scrolltabstwo.adapter.ViewPagerAdapter;
import com.example.aff02.scrolltabstwo.fragments.FragA;
import com.example.aff02.scrolltabstwo.fragments.FragB;
import com.example.aff02.scrolltabstwo.fragments.FragC;

/**
 * Created by AFF02 on 14-Aug-17.
 */

public class IconwithTextTabs extends AppCompatActivity {

    private TabLayout tabLayout;
    private Toolbar toolbar;
    private ViewPager viewPager;

    private int[] icons =
            {
                    R.drawable.ic_phone,
                    R.drawable.ic_favorite,
                    R.drawable.ic_contacts
            };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_text_tabs);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Icon with Text");

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setUpTabIcons();
    }

    private void setUpTabIcons() {

        tabLayout.getTabAt(0).setIcon(icons[0]);
        tabLayout.getTabAt(1).setIcon(icons[1]);
        tabLayout.getTabAt(2).setIcon(icons[2]);


    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter viewpageradapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewpageradapter.addFragment(new FragA(), "Call");
        viewpageradapter.addFragment(new FragB(), "Favorites");
        viewpageradapter.addFragment(new FragC(), "Contacts");
        viewPager.setAdapter(viewpageradapter);
    }


}

