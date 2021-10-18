package com.infinitysensei.blueprotocol_interactivemap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ZoomControls;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import static android.content.ContentValues.TAG;

public class Map2 extends AppCompatActivity {
    CardView cardview;

    ImageButton button1;

    ImageView info;

    CardView infoCard;


    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;
    Switch switch7;
    Switch switch8;
    Switch switch9;
    Switch switch10;
    Switch switch11;

    ImageView tp1;
    ImageView tp2;
    ImageView tp3;
    ImageView tp4;
    ImageView tp5;
    ImageView tp6;
    ImageView tp7;
    ImageView tp8;
    ImageView tp9;
    ImageView tp10;
    ImageView tp11;
    ImageView tp12;
    ImageView tp13;
    ImageView tp14;
    ImageView tp15;
    ImageView tp16;
    ImageView tp17;
    ImageView tp18;
    ImageView tp19;
    ImageView tp20;
    ImageView tp21;


    CardView c1;
    CardView c2;
    CardView c3;
    CardView c4;
    CardView c5;
    CardView c6;
    CardView c7;
    CardView c8;
    CardView c9;
    CardView c10;
    CardView c11;
    CardView c12;
    ImageView ii1;
    ImageView ii2;
    ImageView ii3;
    ImageView ii4;
    ImageView ii5;
    ImageView ii6;
    ImageView ii7;
    ImageView ii8;
    ImageView ii9;
    ImageView ii10;
    ImageView ii11;
    ImageView ii12;
    ImageView ii13;

    ImageView lm1;
    ImageView lm2;
    ImageView lm3;
    ImageView next;
    ImageView d1;
    ImageView d2;
    
ImageView parent;

    ImageView fn1;
    ImageView fn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map2);


        next=(ImageView)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent4 =new Intent(Map2.this,Map3.class);
                    finish();
                    startActivity(intent4);}

        });
        parent=(ImageView)findViewById(R.id.parent);

        parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoCard.setVisibility(View.INVISIBLE);
                c1.setVisibility(View.INVISIBLE);
                c2.setVisibility(View.INVISIBLE);
                c3.setVisibility(View.INVISIBLE);
                c4.setVisibility(View.INVISIBLE);
                c5.setVisibility(View.INVISIBLE);
                c6.setVisibility(View.INVISIBLE);
                c7.setVisibility(View.INVISIBLE);
                c8.setVisibility(View.INVISIBLE);
                c9.setVisibility(View.INVISIBLE);
                c10.setVisibility(View.INVISIBLE);
                c11.setVisibility(View.INVISIBLE);
                c12.setVisibility(View.INVISIBLE);
            }
        });





        info=(ImageView) findViewById(R.id.info);
        infoCard=(CardView) findViewById(R.id.infoCard);
        infoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoCard.setVisibility(View.INVISIBLE);
            }
        });



        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoCard.setVisibility(View.VISIBLE);



            }
        });



        button1=(ImageButton)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        cardview=findViewById(R.id.cardview);


        // for fn
        fn1=(ImageView)findViewById(R.id.fn1);
        fn2=(ImageView)findViewById(R.id.fn2);
        switch1 = (Switch) findViewById(R.id.switch1);
        switch1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switch1.isChecked()) {

                    fn1.setVisibility(View.VISIBLE);
                    fn2.setVisibility(View.VISIBLE);
                } else {
                    fn1.setVisibility(View.INVISIBLE);
                    fn2.setVisibility(View.INVISIBLE);


                }
            }
        });


// for tp



        tp1=(ImageView)findViewById(R.id.tp1);
        tp2=(ImageView)findViewById(R.id.tp2);
        tp3=(ImageView)findViewById(R.id.tp3);
        tp4=(ImageView)findViewById(R.id.tp4);
        tp5=(ImageView)findViewById(R.id.tp5);
        tp6=(ImageView)findViewById(R.id.tp6);
        tp7=(ImageView)findViewById(R.id.tp7);
        tp8=(ImageView)findViewById(R.id.tp8);
        tp9=(ImageView)findViewById(R.id.tp9);
        tp10=(ImageView)findViewById(R.id.tp10);
        tp11=(ImageView)findViewById(R.id.tp11);
        tp12=(ImageView)findViewById(R.id.tp12);
        tp13=(ImageView)findViewById(R.id.tp13);
        tp14=(ImageView)findViewById(R.id.tp14);
        tp15=(ImageView)findViewById(R.id.tp15);
        tp16=(ImageView)findViewById(R.id.tp16);
        tp17=(ImageView)findViewById(R.id.tp17);
        tp18=(ImageView)findViewById(R.id.tp18);
        tp19=(ImageView)findViewById(R.id.tp19);
        tp20=(ImageView)findViewById(R.id.tp20);
        tp21=(ImageView)findViewById(R.id.tp21);
        switch2 = (Switch) findViewById(R.id.switch2);
        switch2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switch2.isChecked()) {

                    tp1.setVisibility(View.VISIBLE);
                    tp2.setVisibility(View.VISIBLE);
                    tp3.setVisibility(View.VISIBLE);
                    tp4.setVisibility(View.VISIBLE);
                    tp5.setVisibility(View.VISIBLE);
                    tp6.setVisibility(View.VISIBLE);
                    tp7.setVisibility(View.VISIBLE);
                    tp8.setVisibility(View.VISIBLE);
                    tp9.setVisibility(View.VISIBLE);
                    tp10.setVisibility(View.VISIBLE);
                    tp11.setVisibility(View.VISIBLE);
                    tp12.setVisibility(View.VISIBLE);
                    tp13.setVisibility(View.VISIBLE);
                    tp14.setVisibility(View.VISIBLE);
                    tp15.setVisibility(View.VISIBLE);
                    tp16.setVisibility(View.VISIBLE);
                    tp17.setVisibility(View.VISIBLE);
                    tp18.setVisibility(View.VISIBLE);
                    tp19.setVisibility(View.VISIBLE);
                    tp20.setVisibility(View.VISIBLE);
                    tp21.setVisibility(View.VISIBLE);
                } else {
                    tp1.setVisibility(View.INVISIBLE);
                    tp2.setVisibility(View.INVISIBLE);
                    tp3.setVisibility(View.INVISIBLE);
                    tp4.setVisibility(View.INVISIBLE);
                    tp5.setVisibility(View.INVISIBLE);
                    tp6.setVisibility(View.INVISIBLE);
                    tp7.setVisibility(View.INVISIBLE);
                    tp8.setVisibility(View.INVISIBLE);
                    tp9.setVisibility(View.INVISIBLE);
                    tp10.setVisibility(View.INVISIBLE);
                    tp11.setVisibility(View.INVISIBLE);
                    tp12.setVisibility(View.INVISIBLE);
                    tp13.setVisibility(View.INVISIBLE);
                    tp14.setVisibility(View.INVISIBLE);
                    tp15.setVisibility(View.INVISIBLE);
                    tp16.setVisibility(View.INVISIBLE);
                    tp17.setVisibility(View.INVISIBLE);
                    tp18.setVisibility(View.INVISIBLE);
                    tp19.setVisibility(View.INVISIBLE);
                    tp20.setVisibility(View.INVISIBLE);
                    tp21.setVisibility(View.INVISIBLE);


                }
            }
        });





        lm1=(ImageView)findViewById(R.id.lm1);
        lm2=(ImageView)findViewById(R.id.lm2);
        lm3=(ImageView)findViewById(R.id.lm3);

        switch3 = (Switch) findViewById(R.id.switch3);
        switch3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switch3.isChecked()) {

                    lm1.setVisibility(View.VISIBLE);
                    lm2.setVisibility(View.VISIBLE);
                    lm3.setVisibility(View.VISIBLE);
                } else {
                    lm1.setVisibility(View.INVISIBLE);
                    lm2.setVisibility(View.INVISIBLE);
                    lm3.setVisibility(View.INVISIBLE);


                }
            }
        });



        ii1=(ImageView)findViewById(R.id.ii1);
        ii2=(ImageView)findViewById(R.id.ii2);
        ii3=(ImageView)findViewById(R.id.ii3);
        ii4=(ImageView)findViewById(R.id.ii4);
        ii5=(ImageView)findViewById(R.id.ii5);
        ii6=(ImageView)findViewById(R.id.ii6);
        ii7=(ImageView)findViewById(R.id.ii7);
        ii8=(ImageView)findViewById(R.id.ii8);
        ii9=(ImageView)findViewById(R.id.ii9);
        ii10=(ImageView)findViewById(R.id.ii10);
        ii11=(ImageView)findViewById(R.id.ii11);
        ii12=(ImageView)findViewById(R.id.ii12);
        ii13=(ImageView)findViewById(R.id.ii13);
        
        switch6 = (Switch) findViewById(R.id.switch6);
        switch6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switch6.isChecked()) {

                    ii1.setVisibility(View.VISIBLE);
                    ii2.setVisibility(View.VISIBLE);
                    ii3.setVisibility(View.VISIBLE);
                    ii4.setVisibility(View.VISIBLE);
                    ii5.setVisibility(View.VISIBLE);
                    ii6.setVisibility(View.VISIBLE);
                    ii7.setVisibility(View.VISIBLE);
                    ii8.setVisibility(View.VISIBLE);
                    ii9.setVisibility(View.VISIBLE);
                    ii10.setVisibility(View.VISIBLE);
                    ii11.setVisibility(View.VISIBLE);
                    ii12.setVisibility(View.VISIBLE);
                    ii13.setVisibility(View.VISIBLE);
                   
                } else {
                    ii1.setVisibility(View.INVISIBLE);
                    ii2.setVisibility(View.INVISIBLE);
                    ii3.setVisibility(View.INVISIBLE);
                    ii4.setVisibility(View.INVISIBLE);
                    ii5.setVisibility(View.INVISIBLE);
                    ii6.setVisibility(View.INVISIBLE);
                    ii7.setVisibility(View.INVISIBLE);
                    ii8.setVisibility(View.INVISIBLE);
                    ii9.setVisibility(View.INVISIBLE);
                    ii10.setVisibility(View.INVISIBLE);
                    ii11.setVisibility(View.INVISIBLE);
                    ii12.setVisibility(View.INVISIBLE);
                    ii13.setVisibility(View.INVISIBLE);
                 


                }
            }
        });
        d1=(ImageView)findViewById(R.id.d1);
        d2=(ImageView)findViewById(R.id.d2);


        switch5 = (Switch) findViewById(R.id.switch5);
        switch5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switch5.isChecked()) {

                    d1.setVisibility(View.VISIBLE);
                    d2.setVisibility(View.VISIBLE);

                } else {
                    d1.setVisibility(View.INVISIBLE);
                    d2.setVisibility(View.INVISIBLE);
                 


                }
            }
        });


        c1=(CardView) findViewById(R.id.c1);
        c2=(CardView) findViewById(R.id.c2);
        c3=(CardView) findViewById(R.id.c3);
        c4=(CardView) findViewById(R.id.c4);
        c5=(CardView) findViewById(R.id.c5);
        c6=(CardView) findViewById(R.id.c6);
        c7=(CardView) findViewById(R.id.c7);
        c8=(CardView) findViewById(R.id.c8);
        c9=(CardView) findViewById(R.id.c9);
        c10=(CardView) findViewById(R.id.c10);
        c11=(CardView) findViewById(R.id.c11);
        c12=(CardView) findViewById(R.id.c12);


        ii1=(ImageView)findViewById(R.id.ii1);
        ii1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1.setVisibility(View.VISIBLE);
            }
        });
       


        ii2=(ImageView)findViewById(R.id.ii2);
        ii2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c2.setVisibility(View.VISIBLE);
            }
        });
        ii3=(ImageView)findViewById(R.id.ii3);
        ii3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c3.setVisibility(View.VISIBLE);
            }
        });

        ii4=(ImageView)findViewById(R.id.ii4);
        ii4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4.setVisibility(View.VISIBLE);
            }
        });

        ii5=(ImageView)findViewById(R.id.ii5);
        ii5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c5.setVisibility(View.VISIBLE);
            }
        });
        ii7=(ImageView)findViewById(R.id.ii7);
        ii7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c6.setVisibility(View.VISIBLE);
            }
        });
        ii9=(ImageView)findViewById(R.id.ii9);
        ii9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c7.setVisibility(View.VISIBLE);
            }
        });

        d1=(ImageView)findViewById(R.id.d1);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c8.setVisibility(View.VISIBLE);
            }
        });
        lm1=(ImageView)findViewById(R.id.lm1);
        lm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c9.setVisibility(View.VISIBLE);
            }
        });
        lm2=(ImageView)findViewById(R.id.lm2);
        lm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c10.setVisibility(View.VISIBLE);
            }
        });
        lm3=(ImageView)findViewById(R.id.lm3);
        lm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c11.setVisibility(View.VISIBLE);
            }
        });
        d2=(ImageView)findViewById(R.id.d2);
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c12.setVisibility(View.VISIBLE);
            }
        });


        fn1=(ImageView)findViewById(R.id.fn1);
        fn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Map2.this, InteractiveMap.class);
                finish();
                startActivity(i);
            }
        });
        fn1=(ImageView)findViewById(R.id.fn1);
        fn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Map2.this, InteractiveMap.class);
                finish();
                startActivity(i);
            }
        });
        fn2=(ImageView)findViewById(R.id.fn2);
        fn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Map2.this, Map3.class);
                finish();
                startActivity(i);
            }
        });


    }




}