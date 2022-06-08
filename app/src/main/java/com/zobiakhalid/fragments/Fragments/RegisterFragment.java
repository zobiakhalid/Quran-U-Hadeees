package com.zobiakhalid.fragments.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.zobiakhalid.fragments.LoginFragment;
import com.zobiakhalid.fragments.R;

public class RegisterFragment extends Fragment {
    private EditText name,email,phone_no,password;
    private Button btn;
    private TextView txt;
    private  FirebaseAuth firebaseAuth;


    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_register, container, false);
        name=view.findViewById(R.id.name);
        email=view.findViewById(R.id.email);
        phone_no=view.findViewById(R.id.phone_no);
        password=view.findViewById(R.id.password);
        txt=view.findViewById(R.id.login);
        btn=view.findViewById(R.id.register);
        firebaseAuth=FirebaseAuth.getInstance();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){
                    String Email=email.getText().toString().trim();
                    String psd=password.getText().toString().trim();

                    firebaseAuth.createUserWithEmailAndPassword(Email,psd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(getActivity().getApplicationContext(), "Registration Scuessful", Toast.LENGTH_SHORT).show();
                                HomeFragment homeFragment=new HomeFragment();
                                FragmentTransaction transaction=getFragmentManager().beginTransaction().addToBackStack(null);
                                transaction.commit();
                            }
                            else{
                                Toast.makeText(getActivity().getApplicationContext(), "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginFragment loginFragment=new LoginFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction().addToBackStack(null);
                transaction.replace(R.id.LL,loginFragment).commit();
            }
        });

        return view;
    }
    private boolean validate(){
        boolean result=true;
        String nm=name.getText().toString();
        String mail=email.getText().toString();
        String phon=phone_no.getText().toString();
        String pass=password.getText().toString();

        if(nm.isEmpty()||mail.isEmpty()||phon.isEmpty()||pass.isEmpty()){
            Toast.makeText(getActivity().getApplicationContext(), "Please Fill All Details", Toast.LENGTH_SHORT).show();
        }
        else{
            result = true;
        }
        return  result;
    }
}