package com.ghimireryan.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuScreen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuScreen extends Fragment {

    public MenuScreen() {
        // Required empty public constructor
    }

    public static MenuScreen newInstance() {
        MenuScreen fragment = new MenuScreen();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu_screen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AppCompatButton butto = view.findViewById(R.id.startButtonMenu);
        AppCompatButton butto2 = view.findViewById(R.id.HowButton);
        TextView title = view.findViewById(R.id.titleTextMenu);
        View menuFrame = view.findViewById(R.id.menuFrame);
        SharedPreferences rgb = requireActivity().getSharedPreferences("RGB", Context.MODE_PRIVATE);
        int are = (rgb.getInt("red", 0));
        int gee = (rgb.getInt("green", 0));
        int bee= (rgb.getInt("blue", 0));
        int are2 = (rgb.getInt("red2", 0));
        int gee2 = (rgb.getInt("green2", 0));
        int bee2= (rgb.getInt("blue2", 0));
        int are3 = (rgb.getInt("red3", 0));
        int gee3 = (rgb.getInt("green3", 0));
        int bee3= (rgb.getInt("blue3", 0));
        boolean isUSA = rgb.getBoolean("isUSA", true);
        title.setTextColor(Color.rgb(are, gee, bee));
        if(isUSA){
            butto.setTextColor(Color.rgb(are3, gee3, bee3));
            butto2.setTextColor(Color.rgb(are3, gee3, bee3));
            menuFrame.setBackgroundColor(Color.rgb(are3, gee3, bee3));
        }
        else {
            butto.setTextColor(Color.rgb(are, gee, bee));
            butto2.setTextColor(Color.rgb(are, gee, bee));
            menuFrame.setBackgroundColor(Color.argb(50, are2, gee2, bee2));
        }
        butto.setBackgroundColor(Color.rgb(are2, gee2, bee2));
        butto2.setBackgroundColor(Color.rgb(are, gee, bee));

        butto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

    }
}