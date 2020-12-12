package jaskaran.singh.s301109429.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import jaskaran.singh.s301109429.R;


/*
    First name: Jaskaran
    Last name: Singh
    Student Id: 301109429
    Section: 002

*/
public class S301109429Fragment extends Fragment {

    EditText email, password;
    Button  login;
    CheckBox checkBox;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_s301109429, container, false);
          email = root.findViewById(R.id.jasemail);
        password   = root.findViewById(R.id.jaspassword);
         checkBox= root.findViewById(R.id.jascheckbox);
        login = root.findViewById(R.id.jaslogin);

        String pw=password.getText().toString();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pw.equals("301109429")){
                    Toast.makeText(getContext(),"Login Success",Toast.LENGTH_SHORT).show();
                }
            }
        });

        return root;
    }
}