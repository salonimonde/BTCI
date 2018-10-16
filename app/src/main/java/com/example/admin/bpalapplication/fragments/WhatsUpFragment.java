package com.example.admin.bpalapplication.fragments;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.bpalapplication.R;
import com.example.admin.bpalapplication.adapters.WhatsUpFragmentAdapter;

public class WhatsUpFragment extends Fragment {

    private StaggeredGridLayoutManager staggeredGridLayoutManager;
    private RecyclerView recyclerView;

    public WhatsUpFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.activity_whats_up_fragment, container, false);

        WhatsUpFragmentAdapter adapter = new WhatsUpFragmentAdapter(this.getContext());

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_whats_up);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,1);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);

        return rootView;


    }
}
