package com.example.nguyenthanhtungh.myapplication.ui.adapter;

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
    private ArrayList<Hero> mListHeros;

    public HeroAdapter(ArrayList<Hero> listHeros) {
        mListHeros = listHeros;
    }

    @NonNull
    @Override
    public HeroHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_hero_items, viewGroup, false);
        return new HeroHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroHolder heroHolder, int i) {
        heroHolder.bindData(mListHeros.get(i));
    }

    @Override
    public int getItemCount() {
        return mListHeros.size() != 0 ? mListHeros.size() : 0;
    }

    public class HeroHolder extends RecyclerView.ViewHolder {
        private ImageView mImageHero;

        private HeroHolder(@NonNull View itemView) {
            super(itemView);
            mImageHero = (ImageView) itemView.findViewById(R.id.image_hero);
        }

        public void bindData(Hero hero) {
            mImageHero.setImageResource(hero.getImageId());
        }
    }
}
