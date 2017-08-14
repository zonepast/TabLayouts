package com.example.aff02.scrolltabstwo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.aff02.scrolltabstwo.fragments.FragA;
import com.example.aff02.scrolltabstwo.fragments.FragB;
import com.example.aff02.scrolltabstwo.fragments.FragC;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFF02 on 12-Aug-17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    private String[] tabTitles = new String[]{"Tab1", "Tab2", "Tab3"};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
       // return null;
    }


    public void addFragment(Fragment fragment , String title)
    {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

}
