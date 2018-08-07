package com.example.nguyenthanhtungh.myapplication.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.nguyenthanhtungh.myapplication.R;
import com.example.nguyenthanhtungh.myapplication.data.model.Hero;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroHolder> {
    private ArrayList<Hero> heroArrayList;

    public HeroAdapter(ArrayList<Hero> heroArrayList) {
        this.heroArrayList = heroArrayList;
    }

    @NonNull
    @Override
    public HeroHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_hero_items,viewGroup,false);
        return new HeroHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroHolder heroHolder, int i) {
        Hero hero = heroArrayList.get(i);
        heroHolder.imageHero.setImageResource(hero.getmImageId());
    }

    @Override
    public int getItemCount() {
        return heroArrayList.size();
    }

    public class HeroHolder extends RecyclerView.ViewHolder {
        private ImageView imageHero;

        public HeroHolder(@NonNull View itemView) {
            super(itemView);
            imageHero = (ImageView) itemView.findViewById(R.id.image_hero);
        }
    }
}
