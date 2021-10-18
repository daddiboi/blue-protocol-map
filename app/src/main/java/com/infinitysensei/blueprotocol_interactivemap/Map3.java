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

public class Map3 extends AppCompatActivity {
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
  

    ImageView tp1;
    ImageView tp2;
    ImageView tp3;
    ImageView tp4;
    ImageView tp5;
    ImageView tp6;
    ImageView tp7;
    ImageView tp8;




    CardView c1;
    CardView c2;

    CardView c4;
    CardView c5;

    CardView c7;
    CardView c8;
    ImageView ii1;
    ImageView ii2;
    ImageView ii3;
    ImageView ii4;
    ImageView ii5;
    ImageView ii6;
    ImageView ii7;


    ImageView lm1;

    ImageView next;
    ImageView d1;


    ImageView parent;

    ImageView fn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map3);


        next=(ImageView)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Map3.this, InteractiveMap.class);
                finish();
                startActivity(i);
            }
        });
        parent=(ImageView)findViewById(R.id.parent);

        parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                infoCard.setVisibility(View.INVISIBLE);
                c1.setVisibility(View.INVISIBLE);
                c2.setVisibility(View.INVISIBLE);

                c4.setVisibility(View.INVISIBLE);
                c5.setVisibility(View.INVISIBLE);

                c7.setVisibility(View.INVISIBLE);
                c8.setVisibility(View.INVISIBLE);
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


// for tp



        tp1=(ImageView)findViewById(R.id.tp1);
        tp2=(ImageView)findViewById(R.id.tp2);
        tp3=(ImageView)findViewById(R.id.tp3);
        tp4=(ImageView)findViewById(R.id.tp4);
        tp5=(ImageView)findViewById(R.id.tp5);
        tp6=(ImageView)findViewById(R.id.tp6);
        tp7=(ImageView)findViewById(R.id.tp7);
        tp8=(ImageView)findViewById(R.id.tp8);

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

                } else {
                    tp1.setVisibility(View.INVISIBLE);
                    tp2.setVisibility(View.INVISIBLE);
                    tp3.setVisibility(View.INVISIBLE);
                    tp4.setVisibility(View.INVISIBLE);
                    tp5.setVisibility(View.INVISIBLE);
                    tp6.setVisibility(View.INVISIBLE);
                    tp7.setVisibility(View.INVISIBLE);
                    tp8.setVisibility(View.INVISIBLE);



                }
            }
        });





        lm1=(ImageView)findViewById(R.id.lm1);


        switch3 = (Switch) findViewById(R.id.switch3);
        switch3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switch3.isChecked()) {

                    lm1.setVisibility(View.VISIBLE);

                } else {
                    lm1.setVisibility(View.INVISIBLE);



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


                } else {
                    ii1.setVisibility(View.INVISIBLE);
                    ii2.setVisibility(View.INVISIBLE);
                    ii3.setVisibility(View.INVISIBLE);
                    ii4.setVisibility(View.INVISIBLE);
                    ii5.setVisibility(View.INVISIBLE);
                    ii6.setVisibility(View.INVISIBLE);
                    ii7.setVisibility(View.INVISIBLE);




                }
            }
        });
        d1=(ImageView)findViewById(R.id.d1);



        switch5 = (Switch) findViewById(R.id.switch5);
        switch5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switch5.isChecked()) {

                    d1.setVisibility(View.VISIBLE);


                } else {
                    d1.setVisibility(View.INVISIBLE);




                }
            }
        });
        c1=(CardView) findViewById(R.id.c1);
        c2=(CardView) findViewById(R.id.c2);

        c4=(CardView) findViewById(R.id.c4);
        c5=(CardView) findViewById(R.id.c5);

        c7=(CardView) findViewById(R.id.c7);
        c8=(CardView) findViewById(R.id.c8);
       


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

        fn1=(ImageView)findViewById(R.id.fn1);
        fn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Map3.this, InteractiveMap.class);
                finish();
                startActivity(i);
            }
        });


    }

}