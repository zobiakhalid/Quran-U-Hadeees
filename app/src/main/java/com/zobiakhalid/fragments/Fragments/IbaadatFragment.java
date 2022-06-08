package com.zobiakhalid.fragments.Fragments;

import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.zobiakhalid.fragments.Fragments.Ibaadat.HajjFragment;
import com.zobiakhalid.fragments.Fragments.Ibaadat.NamazEJanazaFragment;
import com.zobiakhalid.fragments.Fragments.Ibaadat.NamazEidFragment;
import com.zobiakhalid.fragments.Fragments.Ibaadat.NamazFragment;
import com.zobiakhalid.fragments.Fragments.Ibaadat.RamzanFragment;
import com.zobiakhalid.fragments.Fragments.Ibaadat.UmraahFragment;
import com.zobiakhalid.fragments.R;

public class IbaadatFragment extends Fragment {
    CardView c1,c2,c3,c4,c5,c6;
        public IbaadatFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_ibaadat, container, false);
        c1=(CardView) view.findViewById(R.id.c1);
        c2=(CardView) view.findViewById(R.id.c2);
        c3=(CardView) view.findViewById(R.id.c3);
        c4=(CardView) view.findViewById(R.id.c4);
        c5=(CardView) view.findViewById(R.id.c5);
        c6=(CardView) view.findViewById(R.id.c6);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NamazFragment namazFragment=new NamazFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, namazFragment);
                transaction.commit();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RamzanFragment ramzanFragment=new RamzanFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, ramzanFragment);
                transaction.commit();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HajjFragment hajjFragment=new HajjFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, hajjFragment);
                transaction.commit();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UmraahFragment umraahFragment=new UmraahFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, umraahFragment);
                transaction.commit();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NamazEJanazaFragment namazEJanazaFragment=new NamazEJanazaFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, namazEJanazaFragment).addToBackStack(null);
                transaction.commit();
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NamazEidFragment namazEidFragment=new NamazEidFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, namazEidFragment).addToBackStack(null);
                transaction.commit();
            }
        });
        return view;
    }
}