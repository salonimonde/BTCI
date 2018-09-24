package com.example.admin.bpalapplication.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.admin.bpalapplication.R;
import com.example.admin.bpalapplication.adapters.ViewPagerAdapter;
import com.example.admin.bpalapplication.fragments.BazaarFragment;
import com.example.admin.bpalapplication.fragments.ConnectFragment;
import com.example.admin.bpalapplication.fragments.TechBitesFragment;
import com.example.admin.bpalapplication.fragments.WhatsUpFragment;

public class LandingActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private int[] tabIcons = {
            R.drawable.ic_action_whats_up,
            R.drawable.ic_action_tech_bites,
            R.drawable.ic_action_bazaar,
            R.drawable.ic_action_connect,
            R.drawable.ic_action_whats_up_with_shadow,
            R.drawable.ic_action_tech_bites_with_shadow,
            R.drawable.ic_action_bazaar_with_shadow,
            R.drawable.ic_action_connect_with_shadow,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        toolbar = (Toolbar) findViewById(R.id.toolbar_landing);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = findViewById(R.id.viewpager_landing);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tablayout_landing);
        tabLayout.setupWithViewPager(viewPager);
        
        setupTabIcons();
        
    }

    private void setupTabIcons() {

        TextView tabWhatsUp = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab,null);
        tabWhatsUp.setText(R.string.whats_up);
        tabWhatsUp.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.ic_action_whats_up,0,0);
        tabLayout.getTabAt(0).setCustomView(tabWhatsUp);

        TextView tabTechBites = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab,null);
        tabTechBites.setText(R.string.tech_bites);
        tabTechBites.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.ic_action_tech_bites,0,0);
        tabLayout.getTabAt(1).setCustomView(tabTechBites);

        TextView tabBazaar = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab,null);
        tabBazaar.setText(R.string.bazaar);
        tabBazaar.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.ic_action_bazaar,0,0);
        tabLayout.getTabAt(2).setCustomView(tabBazaar);

        TextView tabConnect = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab,null);
        tabConnect.setText(R.string.connect);
        tabConnect.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.ic_action_connect,0,0);
        tabLayout.getTabAt(3).setCustomView(tabConnect);
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new WhatsUpFragment(),"What's Up");
        viewPagerAdapter.addFragment(new TechBitesFragment(),"Tech Bites");
        viewPagerAdapter.addFragment(new BazaarFragment(),"Bazaar");
        viewPagerAdapter.addFragment(new ConnectFragment(),"Connect");

        viewPager.setAdapter(viewPagerAdapter);
    }


}
