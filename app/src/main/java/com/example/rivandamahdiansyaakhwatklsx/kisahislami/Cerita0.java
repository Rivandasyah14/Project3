package com.example.rivandamahdiansyaakhwatklsx.kisahislami;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Cerita0 extends Fragment {


    public Cerita0() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kisah_islami, container, false);
        TextView txt = view.findViewById(R.id.txt1);
        TextView txtt = view.findViewById(R.id.txt2);

        txt.setText("Awal dari sang Pengembara");
        txtt.setText(R.string.cerita_pengembara);

        return view;
    }

}
