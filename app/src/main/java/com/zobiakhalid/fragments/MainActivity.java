package com.zobiakhalid.fragments;

;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentTransaction;

import com.zobiakhalid.fragments.Fragments.HadithFragment;
import com.zobiakhalid.fragments.Fragments.HomeFragment;
import com.zobiakhalid.fragments.Fragments.IbaadatFragment;
import com.zobiakhalid.fragments.Fragments.MoreFragment;
import com.zobiakhalid.fragments.Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {
   // Button btn1;
    CardView c1,c2,c3,c4,c5;
    LinearLayout LL;
    TextView txt,txt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btn1=findViewById(R.id.btn1);
        c1=findViewById(R.id.Quran);
        c2=findViewById(R.id.Hadith);
        c3=findViewById(R.id.Home);
        c4=findViewById(R.id.Ibaadat);
        c5=findViewById(R.id.More);
        LL=findViewById(R.id.LL);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment secondFragment=new SecondFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, secondFragment).addToBackStack(null);
                transaction.commit();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HadithFragment hadithFragment=new HadithFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, hadithFragment).addToBackStack(null);
                transaction.commit();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                MainActivity mainActivity=new MainActivity();
//                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(intent);
                HomeFragment homeFragment=new HomeFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, homeFragment).addToBackStack(null);
                transaction.commit();

            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IbaadatFragment ibaadatFragment=new IbaadatFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, ibaadatFragment).addToBackStack(null);
                transaction.commit();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoreFragment moreFragment=new MoreFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, moreFragment).addToBackStack(null);
                transaction.commit();
            }
        });
    }
}