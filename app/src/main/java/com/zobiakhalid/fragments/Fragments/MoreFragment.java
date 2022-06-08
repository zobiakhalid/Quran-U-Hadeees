package com.zobiakhalid.fragments.Fragments;

import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zobiakhalid.fragments.Fragments.Ibaadat.HajjFragment;
import com.zobiakhalid.fragments.Fragments.More.ShadaatFragment;
import com.zobiakhalid.fragments.Fragments.More.TasbihFragment;
import com.zobiakhalid.fragments.LoginFragment;
import com.zobiakhalid.fragments.R;
public class MoreFragment extends Fragment {
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    public MoreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_more, container, false);
        c1=(CardView) view.findViewById(R.id.c1);
        c2=(CardView) view.findViewById(R.id.c2);
        c3=(CardView) view.findViewById(R.id.c3);
        c4=(CardView) view.findViewById(R.id.c4);
        c5=(CardView) view.findViewById(R.id.c5);
        c6=(CardView) view.findViewById(R.id.c6);
        c7=(CardView) view.findViewById(R.id.c7);
        c8=(CardView) view.findViewById(R.id.c8);
        c9=(CardView) view.findViewById(R.id.c9);
        c10=(CardView) view.findViewById(R.id.c10);

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TasbihFragment tasbihFragment=new TasbihFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, tasbihFragment);
                transaction.commit();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShadaatFragment shadaatFragment=new ShadaatFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, shadaatFragment);
                transaction.commit();
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginFragment loginFragment=new LoginFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.LL,loginFragment).commit();
//                LoginFragment loginFragment=new LoginFragment();
//                FragmentTransaction transaction=getFragmentManager().beginTransaction();
//                transaction.replace(R.id.LL, loginFragment);
//                transaction.commit();
            }
        });
        return  view;
    }
}