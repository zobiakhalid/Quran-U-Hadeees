package com.zobiakhalid.fragments;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.zobiakhalid.fragments.Fragments.HomeFragment;
import com.zobiakhalid.fragments.Fragments.More.ShadaatFragment;
import com.zobiakhalid.fragments.Fragments.RegisterFragment;

public class LoginFragment extends Fragment {
    androidx.appcompat.widget.AppCompatEditText email,password;
    TextView register;
    Button login;

    public LoginFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_login, container, false);
        register=(TextView) view.findViewById(R.id.register);
        login=(Button) view.findViewById(R.id.login);
        email=(AppCompatEditText) view.findViewById(R.id.email);
        password=(AppCompatEditText) view.findViewById(R.id.password);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterFragment registerFragment=new RegisterFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.LL, registerFragment);
                transaction.commit();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaildate(email.getText().toString(), password.getText().toString());
            }
        });

        return view;
    }
    private void vaildate(String Email, String pass){
        if((Email == "zobiikhalid@gmail.com")&&(Email=="123456")){
            HomeFragment homeFragment=new HomeFragment();
            FragmentTransaction transaction=getFragmentManager().beginTransaction();
            transaction.replace(R.id.LL, homeFragment);
            transaction.commit();
        }
        else{
            Toast.makeText(getActivity().getApplicationContext(), "Invalid Login", Toast.LENGTH_SHORT).show();

        }

    }

}