package com.example.nguyenthanhtungh.myapplication.data.local;

import com.example.nguyenthanhtungh.myapplication.R;
import com.example.nguyenthanhtungh.myapplication.data.model.Hero;

import java.util.ArrayList;

public class HeroManager {
    private ArrayList<Hero> heroArrayList;

    public ArrayList<Hero> getHeroArrayList() {
        heroArrayList = new ArrayList<>();
        heroArrayList.add(new Hero(R.drawable.blac_widow));
        heroArrayList.add(new Hero(R.drawable.iron_man));
        heroArrayList.add(new Hero(R.drawable.nguoi_soi));
        return heroArrayList;
    }
}
