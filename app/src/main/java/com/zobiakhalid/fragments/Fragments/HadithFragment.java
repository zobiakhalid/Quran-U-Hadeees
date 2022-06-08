package com.zobiakhalid.fragments.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.zobiakhalid.fragments.R;


public class HadithFragment extends Fragment {
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9;


    public HadithFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_hadith, container, false);
        //txt1=(TextView) view.findViewById(R.id.txt1);
        c1=(CardView) view.findViewById(R.id.c1);
        c2=(CardView) view.findViewById(R.id.c2);
        c3=(CardView) view.findViewById(R.id.c3);
        c4=(CardView) view.findViewById(R.id.c4);
        c5=(CardView) view.findViewById(R.id.c5);
        c6=(CardView) view.findViewById(R.id.c6);
        c7=(CardView) view.findViewById(R.id.c7);
        c8=(CardView) view.findViewById(R.id.c8);
        c9=(CardView) view.findViewById(R.id.c9);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Hadith by Al-Bhukhari", Toast.LENGTH_SHORT).show();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Hadith by Al-Muslim", Toast.LENGTH_SHORT).show();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Hadith by Al-Tirmazi", Toast.LENGTH_SHORT).show();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Hadith by Al-Dawood", Toast.LENGTH_SHORT).show();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Hadith by Al-Nasai", Toast.LENGTH_SHORT).show();
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Hadith by Sunnan e lbn e Maja", Toast.LENGTH_SHORT).show();
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Hadith by Al-Silsila", Toast.LENGTH_SHORT).show();
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Hadith by Musnad Ahmed", Toast.LENGTH_SHORT).show();
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Hadith by Mishkat", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}