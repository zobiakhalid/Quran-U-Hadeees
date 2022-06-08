package com.zobiakhalid.fragments.Fragments.Ibaadat;

import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zobiakhalid.fragments.R;

public class NamazEidFragment extends Fragment {

    public NamazEidFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_namaz_eid, container, false);
        return view;
    }
}