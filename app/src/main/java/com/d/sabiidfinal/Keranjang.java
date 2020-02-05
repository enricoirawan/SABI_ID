package com.d.sabiidfinal;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Keranjang extends Fragment implements View.OnClickListener {

    Button buttonCheckout;
    View view;

    public Keranjang() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_keranjang, container, false);
        buttonCheckout = view.findViewById(R.id.btn_checkout);
        buttonCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToCheckout = new Intent(getActivity(), CheckoutAct.class);
                startActivity(goToCheckout);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
