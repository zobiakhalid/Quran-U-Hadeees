package com.zobiakhalid.fragments.Fragments;

import android.Manifest;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.zobiakhalid.fragments.MainActivity;
import com.zobiakhalid.fragments.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SecondFragment extends Fragment implements View.OnClickListener {
    DownloadManager downloadManager;
    public SecondFragment(){
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);
        TextView txt1=(TextView) view.findViewById(R.id.txt1);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%201.pdf"));
                startActivity(intent);
            }
        });
        TextView txt2=(TextView) view.findViewById(R.id.txt2);
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%202.pdf"));
                startActivity(intent);
            }
        });
        TextView txt3=(TextView) view.findViewById(R.id.txt3);
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%203.pdf"));
                startActivity(intent);
            }
        });
        TextView txt4=(TextView) view.findViewById(R.id.txt4);
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%204.pdf"));
                startActivity(intent);
            }
        });
        TextView txt5=(TextView) view.findViewById(R.id.txt5);
        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%205.pdf"));
                startActivity(intent);
            }
        });
        TextView txt6=(TextView) view.findViewById(R.id.txt6);
        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%206.pdf"));
                startActivity(intent);
            }
        });

        TextView txt7=(TextView) view.findViewById(R.id.txt7);
        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%207.pdf"));
                startActivity(intent);
            }
        });

        TextView txt8=(TextView) view.findViewById(R.id.txt8);
        txt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%208.pdf"));
                startActivity(intent);
            }
        });

        TextView txt9=(TextView) view.findViewById(R.id.txt9);
        txt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%209.pdf"));
                startActivity(intent);
            }
        });

        TextView txt10=(TextView) view.findViewById(R.id.txt10);
        txt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2010.pdf"));
                startActivity(intent);
            }
        });

        TextView txt11=(TextView) view.findViewById(R.id.txt11);
        txt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2011.pdf"));
                startActivity(intent);
            }
        });

        TextView txt12=(TextView) view.findViewById(R.id.txt12);
        txt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2012.pdf"));
                startActivity(intent);
            }
        });

        TextView txt13=(TextView) view.findViewById(R.id.txt13);
        txt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2013.pdf"));
                startActivity(intent);
            }
        });

        TextView txt14=(TextView) view.findViewById(R.id.txt14);
        txt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2014.pdf"));
                startActivity(intent);
            }
        });

        TextView txt15=(TextView) view.findViewById(R.id.txt15);
        txt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2015.pdf"));
                startActivity(intent);
            }
        });

        TextView txt16=(TextView) view.findViewById(R.id.txt16);
        txt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2016.pdf"));
                startActivity(intent);
            }
        });

        TextView txt17=(TextView) view.findViewById(R.id.txt17);
        txt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2017.pdf"));
                startActivity(intent);
            }
        });

        TextView txt18=(TextView) view.findViewById(R.id.txt18);
        txt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.islamicnet.com/online_quran_pdf/Holy-Quran-Para-18.pdf"));
                startActivity(intent);
            }
        });

        TextView txt19=(TextView) view.findViewById(R.id.txt19);
        txt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2019.pdf"));
                startActivity(intent);
            }
        });

        TextView txt20=(TextView) view.findViewById(R.id.txt20);
        txt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.islamicnet.com/online_quran_pdf/Holy-Quran-Para-20.pdf"));
                startActivity(intent);
            }
        });

        TextView txt21=(TextView) view.findViewById(R.id.txt21);
        txt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2021.pdf"));
                startActivity(intent);
            }
        });

        TextView txt22=(TextView) view.findViewById(R.id.txt22);
        txt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2022.pdf"));
                startActivity(intent);
            }
        });

        TextView txt23=(TextView) view.findViewById(R.id.txt23);
        txt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2023.pdf"));
                startActivity(intent);
            }
        });

        TextView txt24=(TextView) view.findViewById(R.id.txt24);
        txt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2024.pdf"));
                startActivity(intent);
            }
        });

        TextView txt25=(TextView) view.findViewById(R.id.txt25);
        txt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2025.pdf"));
                startActivity(intent);
            }
        });

        TextView txt26=(TextView) view.findViewById(R.id.txt26);
        txt26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2026.pdf"));
                startActivity(intent);
            }
        });

        TextView txt27=(TextView) view.findViewById(R.id.txt27);
        txt27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2027.pdf"));
                startActivity(intent);
            }
        });

        TextView txt28=(TextView) view.findViewById(R.id.txt28);
        txt28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2028.pdf"));
                startActivity(intent);
            }
        });

        TextView txt29=(TextView) view.findViewById(R.id.txt29);
        txt29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2029.pdf"));
                startActivity(intent);
            }
        });

        TextView txt30=(TextView) view.findViewById(R.id.txt30);
        txt30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%2030.pdf"));
                startActivity(intent);
            }
        });


        ImageView img=(ImageView) view.findViewById(R.id.imageView);
        img.setOnClickListener(this);
        ImageView img1=(ImageView) view.findViewById(R.id.imageView2);
        img1.setOnClickListener(this);
        ImageView img2=(ImageView) view.findViewById(R.id.imageView3);
        img2.setOnClickListener(this);
        ImageView img3=(ImageView) view.findViewById(R.id.imageView4);
        img3.setOnClickListener(this);
        ImageView img4=(ImageView) view.findViewById(R.id.imageView5);
        img4.setOnClickListener(this);
        ImageView img5=(ImageView) view.findViewById(R.id.imageView6);
        img5.setOnClickListener(this);
        ImageView img6=(ImageView) view.findViewById(R.id.imageView7);
        img6.setOnClickListener(this);
        ImageView img7=(ImageView) view.findViewById(R.id.imageView8);
        img7.setOnClickListener(this);
        ImageView img8=(ImageView) view.findViewById(R.id.imageView9);
        img8.setOnClickListener(this);
        ImageView img9=(ImageView) view.findViewById(R.id.imageView10);
        img9.setOnClickListener(this);
        ImageView img10=(ImageView) view.findViewById(R.id.imageView11);
        img10.setOnClickListener(this);
        ImageView img11=(ImageView) view.findViewById(R.id.imageView12);
        img11.setOnClickListener(this);
        ImageView img12=(ImageView) view.findViewById(R.id.imageView13);
        img12.setOnClickListener(this);
        ImageView img13=(ImageView) view.findViewById(R.id.imageView14);
        img13.setOnClickListener(this);
        ImageView img14=(ImageView) view.findViewById(R.id.imageView15);
        img14.setOnClickListener(this);
        ImageView img15=(ImageView) view.findViewById(R.id.imageView16);
        img15.setOnClickListener(this);
        ImageView img16=(ImageView) view.findViewById(R.id.imageView17);
        img16.setOnClickListener(this);
        ImageView img17=(ImageView) view.findViewById(R.id.imageView18);
        img17.setOnClickListener(this);
        ImageView img18=(ImageView) view.findViewById(R.id.imageView19);
        img18.setOnClickListener(this);
        ImageView img19=(ImageView) view.findViewById(R.id.imageView20);
        img19.setOnClickListener(this);
        ImageView img20=(ImageView) view.findViewById(R.id.imageView21);
        img20.setOnClickListener(this);
        ImageView img21=(ImageView) view.findViewById(R.id.imageView22);
        img21.setOnClickListener(this);
        ImageView img22=(ImageView) view.findViewById(R.id.imageView23);
        img22.setOnClickListener(this);
        ImageView img23=(ImageView) view.findViewById(R.id.imageView24);
        img23.setOnClickListener(this);
        ImageView img24=(ImageView) view.findViewById(R.id.imageView25);
        img24.setOnClickListener(this);
        ImageView img25=(ImageView) view.findViewById(R.id.imageView26);
        img25.setOnClickListener(this);
        ImageView img26=(ImageView) view.findViewById(R.id.imageView27);
        img26.setOnClickListener(this);
        ImageView img27=(ImageView) view.findViewById(R.id.imageView28);
        img27.setOnClickListener(this);
        ImageView img28=(ImageView) view.findViewById(R.id.imageView29);
        img28.setOnClickListener(this);
        ImageView img30=(ImageView) view.findViewById(R.id.imageView31);
        img30.setOnClickListener(this);
        ImageView img31=(ImageView) view.findViewById(R.id.imageView32);
        img31.setOnClickListener(this);
        ImageView img32=(ImageView) view.findViewById(R.id.imageView33);
        img32.setOnClickListener(this);
        ImageView img33=(ImageView) view.findViewById(R.id.imageView34);
        img33.setOnClickListener(this);
        ImageView img34=(ImageView) view.findViewById(R.id.imageView35);
        img34.setOnClickListener(this);
        ImageView img35=(ImageView) view.findViewById(R.id.imageView36);
        img35.setOnClickListener(this);
        ImageView img36=(ImageView) view.findViewById(R.id.imageView37);
        img36.setOnClickListener(this);
        ImageView img37=(ImageView) view.findViewById(R.id.imageView38);
        img37.setOnClickListener(this);
        ImageView img38=(ImageView) view.findViewById(R.id.imageView39);
        img38.setOnClickListener(this);
        ImageView img39=(ImageView) view.findViewById(R.id.imageView40);
        img39.setOnClickListener(this);
        ImageView img40=(ImageView) view.findViewById(R.id.imageView41);
        img40.setOnClickListener(this);
        ImageView img41=(ImageView) view.findViewById(R.id.imageView42);
        img41.setOnClickListener(this);
        ImageView img42=(ImageView) view.findViewById(R.id.imageView43);
        img42.setOnClickListener(this);
        ImageView img43=(ImageView) view.findViewById(R.id.imageView44);
        img43.setOnClickListener(this);
        ImageView img44=(ImageView) view.findViewById(R.id.imageView45);
        img44.setOnClickListener(this);
        ImageView img45=(ImageView) view.findViewById(R.id.imageView46);
        img45.setOnClickListener(this);
        ImageView img46=(ImageView) view.findViewById(R.id.imageView47);
        img46.setOnClickListener(this);
        ImageView img47=(ImageView) view.findViewById(R.id.imageView48);
        img47.setOnClickListener(this);
        ImageView img48=(ImageView) view.findViewById(R.id.imageView49);
        img48.setOnClickListener(this);
        ImageView img49=(ImageView) view.findViewById(R.id.imageView50);
        img49.setOnClickListener(this);
        ImageView img50=(ImageView) view.findViewById(R.id.imageView51);
        img50.setOnClickListener(this);
        ImageView img51=(ImageView) view.findViewById(R.id.imageView52);
        img51.setOnClickListener(this);
        ImageView img52=(ImageView) view.findViewById(R.id.imageView53);
        img52.setOnClickListener(this);
        ImageView img53=(ImageView) view.findViewById(R.id.imageView54);
        img53.setOnClickListener(this);
        ImageView img54=(ImageView) view.findViewById(R.id.imageView55);
        img54.setOnClickListener(this);
        ImageView img55=(ImageView) view.findViewById(R.id.imageView56);
        img55.setOnClickListener(this);
        ImageView img56=(ImageView) view.findViewById(R.id.imageView57);
        img56.setOnClickListener(this);
        ImageView img57=(ImageView) view.findViewById(R.id.imageView58);
        img57.setOnClickListener(this);
        ImageView img58=(ImageView) view.findViewById(R.id.imageView59);
        img58.setOnClickListener(this);
        ImageView img59=(ImageView) view.findViewById(R.id.imageView60);
        img59.setOnClickListener(this);
        ImageView img60=(ImageView) view.findViewById(R.id.imageView61);
        img60.setOnClickListener(this);
        ImageView img61=(ImageView) view.findViewById(R.id.imageView62);
        img61.setOnClickListener(this);
        ImageView img62=(ImageView) view.findViewById(R.id.imageView63);
        img62.setOnClickListener(this);
        ImageView img63=(ImageView) view.findViewById(R.id.imageView64);
        img63.setOnClickListener(this);
        ImageView img64=(ImageView) view.findViewById(R.id.imageView65);
        img64.setOnClickListener(this);
        ImageView img65=(ImageView) view.findViewById(R.id.imageView66);
        img65.setOnClickListener(this);
        ImageView img66=(ImageView) view.findViewById(R.id.imageView67);
        img66.setOnClickListener(this);
        ImageView img67=(ImageView) view.findViewById(R.id.imageView68);
        img67.setOnClickListener(this);
        ImageView img68=(ImageView) view.findViewById(R.id.imageView69);
        img68.setOnClickListener(this);
        ImageView img69=(ImageView) view.findViewById(R.id.imageView70);
        img69.setOnClickListener(this);
        ImageView img70=(ImageView) view.findViewById(R.id.imageView71);
        img70.setOnClickListener(this);
        ImageView img71=(ImageView) view.findViewById(R.id.imageView72);
        img71.setOnClickListener(this);
        ImageView img72=(ImageView) view.findViewById(R.id.imageView73);
        img72.setOnClickListener(this);
        ImageView img73=(ImageView) view.findViewById(R.id.imageView74);
        img73.setOnClickListener(this);
        ImageView img74=(ImageView) view.findViewById(R.id.imageView75);
        img74.setOnClickListener(this);
        ImageView img75=(ImageView) view.findViewById(R.id.imageView76);
        img75.setOnClickListener(this);
        ImageView img76=(ImageView) view.findViewById(R.id.imageView77);
        img76.setOnClickListener(this);
        ImageView img77=(ImageView) view.findViewById(R.id.imageView78);
        img77.setOnClickListener(this);
        ImageView img78=(ImageView) view.findViewById(R.id.imageView79);
        img78.setOnClickListener(this);
        ImageView img79=(ImageView) view.findViewById(R.id.imageView80);
        img79.setOnClickListener(this);
        ImageView img80=(ImageView) view.findViewById(R.id.imageView81);
        img80.setOnClickListener(this);
        ImageView img81=(ImageView) view.findViewById(R.id.imageView82);
        img81.setOnClickListener(this);
        ImageView img82=(ImageView) view.findViewById(R.id.imageView83);
        img82.setOnClickListener(this);
        ImageView img83=(ImageView) view.findViewById(R.id.imageView84);
        img83.setOnClickListener(this);
        ImageView img84=(ImageView) view.findViewById(R.id.imageView85);
        img84.setOnClickListener(this);
        ImageView img85=(ImageView) view.findViewById(R.id.imageView86);
        img85.setOnClickListener(this);
        ImageView img86=(ImageView) view.findViewById(R.id.imageView87);
        img86.setOnClickListener(this);
        ImageView img87=(ImageView) view.findViewById(R.id.imageView88);
        img87.setOnClickListener(this);
        ImageView img88=(ImageView) view.findViewById(R.id.imageView89);
        img88.setOnClickListener(this);
        ImageView img89=(ImageView) view.findViewById(R.id.imageView90);
        img89.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView:
                //DownloadManager downloadManager = null;
//                Uri uri=Uri.parse("http://moshaf.org/files/other/quran/Quran%20Hendi%20-%20joz%201.pdf");
//                DownloadManager.Request request=new DownloadManager.Request(uri);
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                Long reference=downloadManager.enqueue(request);
                Toast.makeText(getActivity().getApplicationContext(), "File Downloading", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView4:
                Toast.makeText(getActivity().getApplicationContext(), "File Downloading", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView7:
                Toast.makeText(getActivity().getApplicationContext(), "File Downloading", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView10:
                    Toast.makeText(getActivity().getApplicationContext(), "File Downloading", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.imageView13:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView16:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView19:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView22:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView25:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView28:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView31:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView34:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView37:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView40:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView43:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView46:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView49:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView52:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView55:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView58:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView61:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView64:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView67:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView70:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView73:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView76:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView79:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView82:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView85:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView88:
                Toast.makeText(getActivity().getApplicationContext(),"File Downloading",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView2:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView5:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView8:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView11:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView14:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView17:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView20:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView23:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView26:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView29:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView32:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView35:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView38:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView41:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView44:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView47:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView50:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView53:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView56:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView59:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView62:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView65:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView68:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView71:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView74:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView77:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView80:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView83:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView86:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView89:
                Toast.makeText(getActivity().getApplicationContext(), "File Saved as Offline", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView3:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView6:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView9:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView12:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView15:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView18:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView21:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView24:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView27:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView30:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView33:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView36:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView39:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView42:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView45:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView48:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView51:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView54:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView57:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView60:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView63:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView66:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView69:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView72:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView75:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView78:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView81:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView84:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView87:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView90:
                Toast.makeText(getActivity().getApplicationContext(), "File Bookmarked", Toast.LENGTH_SHORT).show();
                break;
                default:
                throw new IllegalStateException("Unexpected value: " + getId());
        }
    }
}


