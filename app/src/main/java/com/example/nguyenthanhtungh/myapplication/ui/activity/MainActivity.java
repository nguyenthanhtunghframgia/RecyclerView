package com.example.nguyenthanhtungh.myapplication.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.nguyenthanhtungh.myapplication.R;
import com.example.nguyenthanhtungh.myapplication.data.local.HeroManager;
import com.example.nguyenthanhtungh.myapplication.data.model.Hero;
import com.example.nguyenthanhtungh.myapplication.ui.adapter.HeroAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Hero> heroArrayList;
    private RecyclerView recyclerView;
    private HeroManager heroManager;
    private HeroAdapter heroAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        heroManager = new HeroManager();
        heroArrayList = heroManager.getHeroArrayList();
        heroAdapter = new HeroAdapter(heroArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(heroAdapter);
    }
}
