package com.ghimireryan.myapplication;

import static java.lang.Math.atan;
import static java.lang.Math.pow;
import static java.lang.Math.random;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Map;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity implements WinScreen.DialogListener {

    public Map<String, double[]> states = new TreeMap<>();
    AppCompatButton guessButton,settingsButton, xButton;
    EditText guessText;
    FragmentManager fragmentManager;
    private View layout;
    TextView distanceText,arrowText, headingText, titleText, textView6, textView5, textView4, textView3;
    ToggleButton musicToggleButton, SFXToggleButton, mapToggleButton, arrowToggleButton;
    int[] val = {0};
    int[] deg = {0};
    int one = 0;
    final String[] statesList = new String[]{"AK","AL","AR","AZ","CA","CO","CT","DC","DE","FL","GA","HI","IA","ID","IL","IN","KS","KY","LA","MA","MD","ME","MI","MN","MO","MS","MT","NC","ND","NE","NH","NJ","NM","NV","NY","OH","OK","OR","PA","PR","RI","SC","SD","TN","TX","UT","VA","VT","WA","WI","WV","WY",};
    final String[] guessString = new String[]{statesList[((int) (random() * 50))]};
    int requestCodeOne= 1;
    String colores = "";
    int are, gee, bee, are2, gee2, bee2, are3, gee3, bee3;
    UnitedState mapo;
    MediaPlayer bgAudio;
    int guesses = 1;
    boolean isUSA;
    //WinScreen winner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.menuContainer, MenuScreen.newInstance());
        transaction.addToBackStack("menu");
        transaction.commit();

        layout=findViewById(R.id.layouto);
        bgAudio = MediaPlayer.create(this, R.raw.army_music);
        //try{
          //  Thread.sleep(1000);
            bgAudio.start();
       // }catch (Exception e){}
        fragmentManager = getSupportFragmentManager();
        states.put("AK",new double[]{63.588753,	-154.493062});
        states.put("AL",new double[]{32.318231,	-86.902298	});
        states.put("AR",new double[]{35.20105,	-91.831833	});
        states.put("AZ",new double[]{34.048928,	-111.093731});
        states.put("CA",new double[]{36.778261,	-119.417932});
        states.put("CO",new double[]{39.550051,	-105.782067});
        states.put("CT",new double[]{41.603221,	-73.087749	});
        states.put("DC",new double[]{38.905985,	-77.033418	});
        states.put("DE",new double[]{38.910832,	-75.52767	});
        states.put("FL",new double[]{27.664827,	-81.515754	});
        states.put("GA",new double[]{32.157435,	-82.907123	});
        states.put("HI",new double[]{19.898682,	-155.665857});
        states.put("IA",new double[]{41.878003,	-93.097702	});
        states.put("ID",new double[]{44.068202,	-114.742041});
        states.put("IL",new double[]{40.633125,	-89.398528	});
        states.put("IN",new double[]{40.551217,	-85.602364	});
        states.put("KS",new double[]{39.011902,	-98.484246	});
        states.put("KY",new double[]{37.839333,	-84.270018	});
        states.put("LA",new double[]{31.244823,	-92.145024	});
        states.put("MA",new double[]{42.407211,	-71.382437	});
        states.put("MD",new double[]{39.045755,	-76.641271	});
        states.put("ME",new double[]{45.253783,	-69.445469	});
        states.put("MI",new double[]{44.314844,	-85.602364	});
        states.put("MN",new double[]{46.729553,	-94.6859	});
        states.put("MO",new double[]{37.964253,	-91.831833	});
        states.put("MS",new double[]{32.354668,	-89.398528	});
        states.put("MT",new double[]{46.879682,	-110.362566});
        states.put("NC",new double[]{35.759573,	-79.0193	});
        states.put("ND",new double[]{47.551493,	-101.002012});
        states.put("NE",new double[]{41.492537,	-99.901813	});
        states.put("NH",new double[]{43.193852,	-71.572395	});
        states.put("NJ",new double[]{40.058324,	-74.405661	});
        states.put("NM",new double[]{34.97273,	-105.032363});
        states.put("NV",new double[]{38.80261,	-116.419389});
        states.put("NY",new double[]{43.299428,	-74.217933	});
        states.put("OH",new double[]{40.417287,	-82.907123	});
        states.put("OK",new double[]{35.007752,	-97.092877	});
        states.put("OR",new double[]{43.804133,	-120.554201});
        states.put("PA",new double[]{41.203322,	-77.194525	});
        //states.put("PR",new double[]{18.220833,	-66.590149	});
        states.put("RI",new double[]{41.580095,	-71.477429	});
        states.put("SC",new double[]{33.836081,	-81.163725	});
        states.put("SD",new double[]{43.969515,	-99.901813	});
        states.put("TN",new double[]{35.517491,	-86.580447	});
        states.put("TX",new double[]{31.968599,	-99.901813	});
        states.put("UT",new double[]{39.32098,	-111.093731});
        states.put("VA",new double[]{37.431573,	-78.656894	});
        states.put("VT",new double[]{44.558803,	-72.577841	});
        states.put("WA",new double[]{47.751074,	-120.740139});
        states.put("WI",new double[]{43.78444,	-88.787868	});
        states.put("WV",new double[]{38.597626,	-80.454903	});
        states.put("WY",new double[]{43.075968,	-107.290284});
        guessButton = findViewById(R.id.guessButton);
        guessText = findViewById(R.id.guessText);
        distanceText = findViewById(R.id.distanceText);
        arrowText = findViewById(R.id.arrowText);
        settingsButton = findViewById(R.id.settingsButton);
        headingText = findViewById(R.id.headingText);
        titleText =  findViewById(R.id.titleText);
        mapo = findViewById(R.id.canvasBoard);

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
//              startActivity(intent);
                System.out.println("testing : create settings");
                startActivityForResult(intent, requestCodeOne);
            }
        });
        guessText.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    switch (keyCode) {
                        //case KeyEvent.KEYCODE_DPAD_CENTER:
                        case KeyEvent.KEYCODE_ENTER:
                            checkGuess();
                            return true;
                        default:
                            break;
                    }
                }
                return false;
            }
        });

        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(guessText.getWindowToken(), 0);
                checkGuess();
            }
        });

        SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
        are = (rgb.getInt("red", 0));
        gee = (rgb.getInt("green", 0));
        bee= (rgb.getInt("blue", 0));
        are2 = (rgb.getInt("red2", 0));
        gee2 = (rgb.getInt("green2", 0));
        bee2= (rgb.getInt("blue2", 0));
        are3 = (rgb.getInt("red3", 0));
        gee3 = (rgb.getInt("green3", 0));
        bee3= (rgb.getInt("blue3", 0));
        isUSA = rgb.getBoolean("isUSA", true);
        titleText.setTextColor(Color.rgb(are, gee, bee));
        guessText.setTextColor(Color.rgb(are, gee, bee));
        distanceText.setTextColor(Color.rgb(are, gee, bee));
        arrowText.setTextColor(Color.rgb(are2, gee2, bee2));
        headingText.setTextColor(Color.rgb(are2, gee2, bee2));
        guessButton.setBackgroundColor(Color.rgb(are2, gee2, bee2));
        settingsButton.setBackgroundColor(Color.rgb(are2, gee2, bee2));
        if(!isUSA) {
            layout.setBackgroundColor(Color.argb(50, are3, gee3, bee3));
            guessButton.setTextColor(Color.rgb(are, gee, bee));
            settingsButton.setTextColor(Color.rgb(are, gee, bee));
        }
        else{
            layout.setBackgroundColor(Color.rgb(are3, gee3, bee3));
            guessButton.setTextColor(Color.rgb(are3, gee3, bee3));
            settingsButton.setTextColor(Color.rgb(are3, gee3, bee3));
        }


    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        System.out.println("testing : on return");
        if(requestCode==1 & resultCode==RESULT_OK){
            colores = data.getStringExtra("com.ghimireryan.myapplication.extra.REPLY");
//            are = (int)(2.55*Integer.parseInt(colores.split(" ")[0]));
//            gee = (int)(2.55*Integer.parseInt(colores.split(" ")[1]));
//            bee = (int)(2.55*Integer.parseInt(colores.split(" ")[2]));

            SharedPreferences rgb = getSharedPreferences("RGB", MODE_PRIVATE);
            are = (rgb.getInt("red", 0));
            gee = (rgb.getInt("green", 0));
            bee= (rgb.getInt("blue", 0));
            are2 = (rgb.getInt("red2", 0));
            gee2 = (rgb.getInt("green2", 0));
            bee2= (rgb.getInt("blue2", 0));
            are3 = (rgb.getInt("red3", 0));
            gee3 = (rgb.getInt("green3", 0));
            bee3= (rgb.getInt("blue3", 0));
            titleText.setTextColor(Color.rgb(are, gee, bee));
            guessText.setTextColor(Color.rgb(are, gee, bee));
            distanceText.setTextColor(Color.rgb(are, gee, bee));
            arrowText.setTextColor(Color.rgb(are2, gee2, bee2));
            headingText.setTextColor(Color.rgb(are2, gee2, bee2));
            guessButton.setBackgroundColor(Color.rgb(are2, gee2, bee2));
            settingsButton.setBackgroundColor(Color.rgb(are2, gee2, bee2));
            isUSA = rgb.getBoolean("isUSA", true);
            if(!isUSA) {
                layout.setBackgroundColor(Color.argb(50, are3, gee3, bee3));
                guessButton.setTextColor(Color.rgb(are, gee, bee));
                settingsButton.setTextColor(Color.rgb(are, gee, bee));
            }
            else{
                layout.setBackgroundColor(Color.rgb(are3, gee3, bee3));
                guessButton.setTextColor(Color.rgb(are3, gee3, bee3));
                settingsButton.setTextColor(Color.rgb(are3, gee3, bee3));
            }

        }
    }
    public void checkGuess(){
        // Get the input manager
        InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        // Hide the keyboard
        try {
            inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }catch (Exception e){
            return;
        }

        distanceText.setTextColor(Color.rgb(are, gee, bee));
        arrowText.setTextColor(Color.rgb(are2, gee2, bee2));
        if(one != 0){
            mapo.resetMap();
            one = 0;
        }
        if(guessText.getText().toString().equals(guessString[0])){
            WinScreen dialogFragment = WinScreen.newInstance(guesses);
            dialogFragment.setDialogListener(this);
            dialogFragment.show(getSupportFragmentManager(),"WinFrag");
//            FragmentTransaction transaction = fragmentManager.beginTransaction();
//            transaction.replace(R.id.containerOfFragments, WinScreen.newInstance(guesses), "TwoTag");
//            transaction.addToBackStack("");
//            transaction.commit();
            distanceText.setText("");
            arrowText.setText("");
            guessString[0] = statesList[((int)(random()* 50))];
            mapo.changeColor(guessText.getText().toString(), 0);
            one = 1;
            guesses = 1;
        }
        else if(states.get(guessText.getText().toString()) != null){
            val[0] =  (int) round(sqrt(pow((states.get(guessString[0])[0] - states.get(guessText.getText().toString())[0])*69, 2) +
                    pow((states.get(guessString[0])[1] - states.get(guessText.getText().toString())[1])*55, 2)));
            deg[0] = -1* (int)(57*(atan(((states.get(guessString[0])[0] - states.get(guessText.getText().toString())[0])*69f) / ((states.get(guessString[0])[1] - states.get(guessText.getText().toString())[1])*55f) )));
            if(states.get(guessString[0])[1] < states.get(guessText.getText().toString())[1]) {
                deg[0] += 180;
            }
            distanceText.setText("Your guess is:\n" + val[0] + " miles away\nIn this direction:");
            arrowText.setText("----->");
            arrowText.setRotation(deg[0]);
            mapo.changeColor(guessText.getText().toString(), val[0]);
            guesses+=1;

        }
        else{
            distanceText.setText("That's not a\nstate abbreviation");
            arrowText.setText("");
        }
        guessText.setText("");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bgAudio.release();
    }

    public void onDialogDismissed() {
        mapo.resetMap();
    }
}