package com.infinitysensei.blueprotocol_interactivemap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

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

public class MainActivity extends AppCompatActivity {
    CardView button1;
    CardView button2;
    CardView button3;
    CardView button4;

    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(CardView)findViewById(R.id.button1);
        button2=(CardView)findViewById(R.id.button2);
        button3=(CardView)findViewById(R.id.button3);
        button4=(CardView)findViewById(R.id.button4);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(MainActivity.this,PrivacyPolicy.class);
                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd != null) {
                    save_id(button2.getId());
                    mInterstitialAd.show(MainActivity.this);
                } else {
                    Intent intent2=new Intent(MainActivity.this,InteractiveMap.class);
                    startActivity(intent2);}
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,Feedback.class);
                startActivity(intent3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 =new Intent(MainActivity.this,ReleaseInfo.class);
                startActivity(intent4);

            }
        });

    }
    private void save_id(int id){
        SharedPreferences preferences =getSharedPreferences("SAVING",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("mID",id);
        editor.apply();

    }
    private int load_id(){
        SharedPreferences preferences =getSharedPreferences("SAVING",MODE_PRIVATE);
        return preferences.getInt("mID",0);


    }
    @Override
    protected void onStart() {
        super.onStart();
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                AdRequest adRequest = new AdRequest.Builder().build();

                InterstitialAd.load(MainActivity.this,"ca-app-pub-3399959546059150/6888595642", adRequest,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;
                                Log.i(TAG, "onAdLoaded");
                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        // Called when fullscreen content is dismissed.
                                        Log.d("TAG", "The ad was dismissed.");
                                        Intent intent;
                                        switch (load_id()){

                                            case R.id.button2:
                                                intent =new Intent(MainActivity.this,InteractiveMap.class);
                                                break;

                                            default:
                                                return;

                                        }
                                        startActivity(intent);

                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                                        // Called when fullscreen content failed to show.
                                        Log.d("TAG", "The ad failed to show.");
                                    }

                                    @Override
                                    public void onAdShowedFullScreenContent() {
                                        // Called when fullscreen content is shown.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        mInterstitialAd = null;
                                        Log.d("TAG", "The ad was shown.");
                                    }
                                });
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                Log.i(TAG, loadAdError.getMessage());
                                mInterstitialAd = null;
                            }
                        });
            }
        });

    }
}