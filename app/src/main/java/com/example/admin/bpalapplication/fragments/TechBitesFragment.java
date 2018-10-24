package com.example.admin.bpalapplication.fragments;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.bpalapplication.R;
import com.example.admin.bpalapplication.adapters.TechBitesFragmentAdapter;
import com.example.admin.bpalapplication.adapters.WhatsUpFragmentAdapter;

public class TechBitesFragment extends Fragment {

    private StaggeredGridLayoutManager staggeredGridLayoutManager;
    private RecyclerView recyclerView;


    public TechBitesFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_tech_bites_fragment, container, false);






        TechBitesFragmentAdapter adapter = new TechBitesFragmentAdapter(this.getContext());

        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_tech_bites);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(1,1);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
