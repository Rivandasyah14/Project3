package com.example.rivandamahdiansyaakhwatklsx.kisahislami;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Cerita3 extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_kisah_islami, container, false);
        TextView txt = view.findViewById(R.id.txt1);
        TextView txtt = view.findViewById(R.id.txt2);

        txt.setText("Tukang Kebun yang Rajin Sedekah");
        txtt.setText(R.string.cerita_kakekalam);
        return view;
    }

}
