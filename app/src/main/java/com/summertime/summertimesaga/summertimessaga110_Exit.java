package com.summertime.summertimesaga;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import static com.summertime.summertimesaga.summertimessaga110_splesh.inflateAd;
import static com.summertime.summertimesaga.summertimessaga110_splesh.url_passing;

import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;

public class summertimessaga110_Exit extends AppCompatActivity {
    private Button btn_no, Q_1, Q_2;
    private Button exitapp;


    
    NativeBannerAd nativeBannerAd;
    FrameLayout nativeBannerContainer;
    private SharedPreferences sharedPreferences;
    LinearLayout adView1,L1,L2;
    FrameLayout nativeAdContainer;
    CardView A1;
    FrameLayout A2;
    FrameLayout frameLayout;
    NativeAd nativeAd1;
    InterstitialAd interstitialAd;
    ProgressDialog progressDialog;
    public String TAG = String.valueOf(getClass());

    
    
    



    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.summertimessaga110_back_activity);





        loadfbNativeAd();
        showfbNativeBanner();
        ShowFullAds();

                            



        findViewById(R.id.fl_adplaceholder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                url_passing(summertimessaga110_Exit.this);

            }
        });
        findViewById(R.id.fl_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                url_passing(summertimessaga110_Exit.this);

            }
        });

        Button button = (Button) findViewById(R.id.exitapp);
        this.exitapp = button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                summertimessaga110_Exit.this.startActivity(new Intent(summertimessaga110_Exit.this, summertimessaga110_Thank_you.class));

            }
        });
        Button button1 = (Button) findViewById(R.id.btn_no);
        this.btn_no = button1;
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                summertimessaga110_Exit.this.startActivity(new Intent(summertimessaga110_Exit.this, summertimessaga110_startpage.class));
            }
        });
    }

    

     public void loadfbNativeAd() {
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String nativeid = sharedPreferences.getString("nativeid", null);

        Log.e(TAG, "fbnative1 " + nativeid);
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        adView1 = (LinearLayout) inflater.inflate(R.layout.summertimessaga110_native_ad_layout4, nativeAdContainer, false);
        nativeAdContainer.addView(adView1);
        nativeAd1 = new NativeAd(getApplicationContext(), nativeid);
        NativeAdListener nativeAdListener = new NativeAdListener() {
            @Override
            public void onMediaDownloaded(Ad ad) {
                Log.e("fbnative1==>", "onMediaDownloaded: ");

            }

            @Override
            public void onError(Ad ad, AdError adError) {
                //  nativeAdContainer.setVisibility(View.GONE);
                Log.e("fbnative1==>", adError.getErrorMessage());

            }

            @Override
            public void onAdLoaded(Ad ad) {
                Log.e("fbnative1==>", "onAdLoaded: ");
                if (nativeAd1 == null || nativeAd1 != ad) {

                    return;
                }


                ImageView qreka = findViewById(R.id.qreka);
                qreka.setVisibility(View.GONE);
                inflateAd(nativeAd1, adView1, getApplicationContext());
            }

            @Override
            public void onAdClicked(Ad ad) {
                Log.e("fbnative1==>", "onAdClicked: ");


            }

            @Override
            public void onLoggingImpression(Ad ad) {
                Log.e("fbnative1==>", "onLoggingImpression: ");

            }
        };

        nativeAd1.loadAd(
                nativeAd1.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());


    }

    public void showfbNativeBanner() {

        View adView = NativeBannerAdView.render(this, summertimessaga110_splesh.nativeBannerAd, NativeBannerAdView.Type.HEIGHT_100);
        nativeBannerContainer = (FrameLayout) findViewById(R.id.fl_b);
        // Add the Native Banner Ad View to your ad container
        nativeBannerContainer.addView(adView);
    }

    public void ShowFullAds() {
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String full = sharedPreferences.getString("full", null);
        Log.e(TAG, "fbfull2 " + full);
        try {
            if (summertimessaga110_splesh.interstitialAd1 != null && summertimessaga110_splesh.interstitialAd1.isAdLoaded()) {
                summertimessaga110_splesh.interstitialAd1.show();

            } else if (summertimessaga110_splesh.interstitialAd2 != null && summertimessaga110_splesh.interstitialAd2.isAdLoaded()) {
                summertimessaga110_splesh.interstitialAd2.show();
                summertimessaga110_splesh.interstitialAd1.loadAd();
            } else {

                summertimessaga110_splesh.interstitialAd1.loadAd();
                summertimessaga110_splesh.interstitialAd2.loadAd();
                interstitialAd = new InterstitialAd(this, full);
                InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {


                    @Override
                    public void onInterstitialDisplayed(Ad ad) {

                    }

                    @Override
                    public void onInterstitialDismissed(Ad ad) {
                        // Interstitial dismissed callback
                        Log.e(TAG, "fbfull2 " + "Interstitial ad dismissed.");
                    }

                    @Override
                    public void onError(Ad ad, AdError adError) {
                        // Ad error callback
                        Log.e(TAG, "fbfull2" + adError.getErrorMessage());

                    }

                    @Override
                    public void onAdLoaded(Ad ad) {
                        Log.d(TAG, "fbfull2 " + "Interstitial ad is loaded and ready to be diSplash_screenlayed!");
                        if (interstitialAd != null && interstitialAd.isAdLoaded())
                            interstitialAd.show();
                    }

                    @Override
                    public void onAdClicked(Ad ad) {
                        // Ad clicked callback
                        Log.d(TAG, "fbfull2 " + "Interstitial ad clicked!");
                    }

                    @Override
                    public void onLoggingImpression(Ad ad) {
                        // Ad impression logged callback
                        Log.d(TAG, "fbfull2 " + "Interstitial ad impression logged!");
                    }
                };

                interstitialAd.loadAd(
                        interstitialAd.buildLoadAdConfig()
                                .withAdListener(interstitialAdListener)
                                .build());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        url_passing(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        ShowFullAds();

    }
}