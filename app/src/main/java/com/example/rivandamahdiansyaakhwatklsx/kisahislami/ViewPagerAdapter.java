package com.example.rivandamahdiansyaakhwatklsx.kisahislami;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.rivandamahdiansyaakhwatklsx.kisahislami.R;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    int[] gambar;

    public ViewPagerAdapter(Context context, int[] gambar) {
        this.context = context;
        this.gambar = gambar;
    }

    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == ((ScrollView)o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView;

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.view_item, container, false);
        imageView = v.findViewById(R.id.imgview);

        imageView.setImageResource(gambar[position]);
        ((ViewPager) container).addView(v);
        return v;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewPager) container).removeView((ScrollView) object);
    }
}
