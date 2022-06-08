package com.zobiakhalid.fragments.Fragments.More;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.zobiakhalid.fragments.R;

import static android.content.Context.MODE_PRIVATE;

public class TasbihFragment extends Fragment {
    private static String file="com.example.sharedprefrences";
    TextView tv;
    Button inc;
    Button clr;
    int count;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    public TasbihFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tasbih, container, false);

        //setContentView(R.layout.fragment_tasbih);
        tv=(TextView) view.findViewById(R.id.tv);
        inc=(Button) view.findViewById(R.id.inc);
        clr=(Button) view.findViewById(R.id.clear);
        sharedPreferences= getContext().getSharedPreferences(file,MODE_PRIVATE);
        editor=sharedPreferences.edit();
        count=sharedPreferences.getInt("c",0);
        tv.setText(count+"");


        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(++count+"");

            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                editor.remove("c");
//                editor.clear();
//                editor.apply();
                count=sharedPreferences.getInt("c",0);
                tv.setText("0");

            }
        });
        return view;
    }


    @Override
    public void onPause() {
        super.onPause();
        editor.putInt("c",count);
        editor.apply();
    }
}
