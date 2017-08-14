package com.example.aff02.scrolltabstwo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.aff02.scrolltabstwo.R;

/**
 * Created by AFF02 on 12-Aug-17.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Toolbar toolbar;
    private Button btnsimpletabs, btnscrollabletabs,btniconwithtext,btnonlyicons,btncustomtab;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnsimpletabs= (Button) findViewById(R.id.btnsimpletabs);
        btnscrollabletabs = (Button) findViewById(R.id.btnscrollabletabs);
        btniconwithtext = (Button)findViewById(R.id.btniconwithtabs);
        btnonlyicons = (Button)findViewById(R.id.btnonlyicon);
        btncustomtab = (Button)findViewById(R.id.btncustomtab);

        btnsimpletabs.setOnClickListener(this);
        btnscrollabletabs.setOnClickListener(this);
        btniconwithtext.setOnClickListener(this);
        btnonlyicons.setOnClickListener(this);
        btncustomtab.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnsimpletabs:
                startActivity(new Intent(MainActivity.this,SimpleTabs.class));
                break;
            case R.id.btnscrollabletabs:
                startActivity(new Intent(MainActivity.this,ScrollableTabs.class));
                break;
            case R.id.btniconwithtabs:
                startActivity(new Intent(MainActivity.this,IconwithTextTabs.class));
                break;
            case R.id.btnonlyicon:
                startActivity(new Intent(MainActivity.this, OnlyIcons.class));
                break;
            case R.id.btncustomtab:
                startActivity(new Intent(MainActivity.this,CustomTabs.class));
                break;
        }
    }
}
