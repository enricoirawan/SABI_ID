package com.d.sabiidfinal;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class User extends Fragment implements View.OnClickListener{

    View view;
    TextView buttonPengaturanLain;

    public User() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_user, container, false);
        buttonPengaturanLain = view.findViewById(R.id.btn_pengaturan_lainnya);
        buttonPengaturanLain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPengturanLain = new Intent(getActivity(), PengaturanLainAct.class);
                startActivity(goToPengturanLain);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
