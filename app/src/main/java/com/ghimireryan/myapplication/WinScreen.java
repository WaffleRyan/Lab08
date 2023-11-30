package com.ghimireryan.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WinScreen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WinScreen extends DialogFragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String guesses = "Guesses";
    //private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private int mGuesses;
    private TextView text;
    private AppCompatButton button;
    private DialogListener dialogListener;
    //private String mParam2;

    public WinScreen() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static WinScreen newInstance(int g) {
        WinScreen fragment = new WinScreen();
        Bundle args = new Bundle();
        args.putInt(guesses, g);
        //args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mGuesses = getArguments().getInt(guesses);
            //mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_win_screen, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        text = view.findViewById(R.id.wt1);
        button = view.findViewById(R.id.wb1);
        View winnerFrame = view.findViewById(R.id.winnerFrame);
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
        if(mGuesses == 1){
            text.setText("You win!\nIt took you " + mGuesses + " guess");
        }
        else {
            text.setText("You win!\nIt took you " + mGuesses + " guesses");
        }
        text.setTextColor(Color.rgb(are, gee, bee));
        if(isUSA){
            button.setTextColor(Color.rgb(are3, gee3, bee3));
            text.setBackgroundColor(Color.rgb(are3, gee3, bee3));
            winnerFrame.setBackgroundColor(Color.rgb(are3, gee3, bee3));
        }
        else {
            button.setTextColor(Color.rgb(are, gee, bee));
            text.setBackgroundColor(Color.argb(50, are2, gee2, bee2));
            winnerFrame.setBackgroundColor(Color.argb(50, are2, gee2, bee2));
        }
        button.setBackgroundColor(Color.rgb(are2, gee2, bee2));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
                dialogListener.onDialogDismissed();
            }
        });
    }

    public interface DialogListener {
        void onDialogDismissed();
    }
    public void setDialogListener(DialogListener listener) {
        dialogListener = listener;
    }
}