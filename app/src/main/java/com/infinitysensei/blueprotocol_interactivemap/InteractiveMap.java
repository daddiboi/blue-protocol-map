package com.infinitysensei.blueprotocol_interactivemap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ZoomControls;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class InteractiveMap extends AppCompatActivity {
    CardView cardview;

    ImageButton button1;


    ImageView info;

    CardView infoCard;
    ImageView parent;
    ImageView fn1;



    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;
    Switch switch5;
    Switch switch6;



    CardView c1;
    CardView c2;
    CardView c3;
    CardView c4;
    CardView c5;
    CardView c6;
    CardView c7;
    CardView c8;
    CardView c9;

    ImageView ii1;
    ImageView ii2;
    ImageView ii3;
    ImageView ii4;
    ImageView ms1;
    ImageView ms2;
    ImageView lm1;
    ImageView lm2;
    ImageView lm3;
    ImageView lm4;
    ImageView lm5;
    ImageView next;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactive_map);

        next=(ImageView)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InteractiveMap.this, Map2.class);
                finish();
                startActivity(i);
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
            }
        });



        //switch

        fn1=(ImageView)findViewById(R.id.fn1);
        switch1 = (Switch) findViewById(R.id.switch1);
        switch1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switch1.isChecked()) {

                    fn1.setVisibility(View.VISIBLE);
                } else {
                    fn1.setVisibility(View.INVISIBLE);


                }
            }
        });
        switch3 = (Switch) findViewById(R.id.switch3);
        switch3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switch3.isChecked()) {

                    lm1.setVisibility(View.VISIBLE);
                    lm2.setVisibility(View.VISIBLE);
                    lm3.setVisibility(View.VISIBLE);
                    lm4.setVisibility(View.VISIBLE);
                    lm5.setVisibility(View.VISIBLE);
                } else {
                    lm1.setVisibility(View.INVISIBLE);
                    lm2.setVisibility(View.INVISIBLE);
                    lm3.setVisibility(View.INVISIBLE);
                    lm4.setVisibility(View.INVISIBLE);
                    lm5.setVisibility(View.INVISIBLE);


                }
            }
        });

        ms1=(ImageView)findViewById(R.id.ms1);
        ms2=(ImageView)findViewById(R.id.ms2);

        switch4 = (Switch) findViewById(R.id.switch4);
        switch4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switch4.isChecked()) {

                    ms1.setVisibility(View.VISIBLE);
                    ms2.setVisibility(View.VISIBLE);

                } else {
                    ms1.setVisibility(View.INVISIBLE);
                    ms2.setVisibility(View.INVISIBLE);



                }
            }
        });





        lm4=(ImageView)findViewById(R.id.lm4);
        lm5=(ImageView)findViewById(R.id.lm5);

        switch6 = (Switch) findViewById(R.id.switch6);
        switch6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switch6.isChecked()) {

                    ii1.setVisibility(View.VISIBLE);
                    ii2.setVisibility(View.VISIBLE);
                    ii3.setVisibility(View.VISIBLE);
                    ii4.setVisibility(View.VISIBLE);
                } else {
                    ii1.setVisibility(View.INVISIBLE);
                    ii2.setVisibility(View.INVISIBLE);
                    ii3.setVisibility(View.INVISIBLE);
                    ii4.setVisibility(View.INVISIBLE);


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

        
        ms1=(ImageView)findViewById(R.id.ms1);
        ms1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1.setVisibility(View.VISIBLE);
            }
        });
        ms2=(ImageView)findViewById(R.id.ms2);
        ms2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c8.setVisibility(View.VISIBLE);
            }
        });
        
        
        lm1=(ImageView)findViewById(R.id.lm1);
        lm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c2.setVisibility(View.VISIBLE);
            }
        });
       
        
        lm2=(ImageView)findViewById(R.id.lm2);
        lm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c3.setVisibility(View.VISIBLE);
            }
        });
        
       
       
        lm3=(ImageView)findViewById(R.id.lm3);
        lm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c4.setVisibility(View.VISIBLE);
            }
        });
        lm5=(ImageView)findViewById(R.id.lm5);
        lm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c9.setVisibility(View.VISIBLE);
            }
        });
        lm4=(ImageView)findViewById(R.id.lm4);
        lm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c9.setVisibility(View.VISIBLE);
            }
        });
       
       
        ii1=(ImageView)findViewById(R.id.ii1);
        ii1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c5.setVisibility(View.VISIBLE);
            }
        });
       
       
        ii2=(ImageView)findViewById(R.id.ii2);
        ii2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c6.setVisibility(View.VISIBLE);
            }
        });
       
        
        ii3=(ImageView)findViewById(R.id.ii3);
        ii3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c7.setVisibility(View.VISIBLE);
            }
        });
       
       
        ii4=(ImageView)findViewById(R.id.ii4);
        ii4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c8.setVisibility(View.VISIBLE);
            }
        });
        fn1=(ImageView)findViewById(R.id.fn1);
        fn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InteractiveMap.this, Map2.class);
                finish();
                startActivity(i);
            }
        });

       
    }
}