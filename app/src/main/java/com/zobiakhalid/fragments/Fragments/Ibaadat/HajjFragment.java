package com.zobiakhalid.fragments.Fragments.Ibaadat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zobiakhalid.fragments.R;
public class HajjFragment extends Fragment {
    TextView txt;

    public HajjFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_hajj, container, false);
        txt=(TextView) view.findViewById(R.id.txt20);
        txt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              Intent intent=new Intent(Intent.ACTION_VIEW);
              intent.setData(Uri.parse("https://www.mohrasharif.com/PDFs/Hajj-Guide-Book-Urdu.pdf"));
              startActivity(intent);
           }
        });
        return view;
    }
}