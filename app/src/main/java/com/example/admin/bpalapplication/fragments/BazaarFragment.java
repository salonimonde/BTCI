package com.example.admin.bpalapplication.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.bpalapplication.R;

public class BazaarFragment extends Fragment {

    private Context mContext;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView recyclerViewBazaar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_bazaar_fragment, container, false);



    }
}
