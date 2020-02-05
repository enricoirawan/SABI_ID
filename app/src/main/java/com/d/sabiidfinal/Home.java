package com.d.sabiidfinal;


import android.content.Intent;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment implements View.OnClickListener {

    View view;
    ImageView buttonBack;
    LinearLayout freeButton, buttonBuy, buttonGive;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        buttonBack = view.findViewById(R.id.notification);
        freeButton = view.findViewById(R.id.button_free);
        buttonBuy =  view.findViewById(R.id.button_buy);
        buttonGive =  view.findViewById(R.id.button_give);

        //menambahkan fungsi onClickListener
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToNotification = new Intent(getActivity(), NotificationAct.class);
                startActivity(goToNotification);
            }
        });
        freeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goFreeAct = new Intent(getActivity(), FreeAct.class);
                startActivity(goFreeAct);
            }
        });
        buttonBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBuyAct = new Intent(getActivity(), BuyAct.class);
                startActivity(goBuyAct);
            }
        });
//        buttonGive.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent goGiveAct = new Intent(getActivity(), GiveAct.class);
//                startActivity(goGiveAct);
//            }
//        });
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
