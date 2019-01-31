package com.example.rivandamahdiansyaakhwatklsx.kisahislami;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewPager extends Fragment {

    android.support.v4.view.ViewPager vp;

    int[] gambar = {
        R.drawable.bija, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g,
    };

    public ViewPager() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_view_pager, container, false);

        vp = v.findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity(), gambar);
        vp.setAdapter(adapter);
        return v;
    }

}
