package com.example.aff02.scrolltabstwo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aff02.scrolltabstwo.R;

/**
 * Created by AFF02 on 12-Aug-17.
 */

public class FragA extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_a,container,false);
        return view;
    }

    public FragA(){

    }
}
