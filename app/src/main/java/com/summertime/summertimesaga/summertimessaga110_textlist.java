package com.summertime.summertimesaga;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

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


public class summertimessaga110_textlist extends AppCompatActivity {
    LinearLayout t1, t2, t3, t4, t5, t6;
    ImageView Ad1, Ad2, Ad3, Ad4, Ad5, Ad6;
    CardView A1;
    TextView A2, A3, A4, A6;
    FrameLayout A5;
    ScrollView SV1, SV2;
    ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5;
    FrameLayout frameLayout;
    
    NativeBannerAd nativeBannerAd;
    FrameLayout nativeBannerContainer;
    private SharedPreferences sharedPreferences;
    LinearLayout adView1;
    FrameLayout nativeAdContainer;
    NativeAd nativeAd1;
    InterstitialAd interstitialAd;
    public String TAG = String.valueOf(getClass());


    
    ProgressDialog progressDialog;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summertimessaga110_activity_textlist);

        imageView = findViewById(R.id.youtube_player_view);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail1.class);
                summertimessaga110_textlist.this.startActivity(intent);
            }


        });
        imageView1 = findViewById(R.id.youtube_player_view_1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail2.class);
                summertimessaga110_textlist.this.startActivity(intent);
            }


        });
        imageView2 = findViewById(R.id.youtube_player_view_2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail3.class);
                summertimessaga110_textlist.this.startActivity(intent);
            }


        });
        imageView3 = findViewById(R.id.youtube_player_view_3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail4.class);
                summertimessaga110_textlist.this.startActivity(intent);
            }


        });
        imageView4 = findViewById(R.id.youtube_player_view_4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail5.class);
                summertimessaga110_textlist.this.startActivity(intent);
            }


        });
        imageView5 = findViewById(R.id.youtube_player_view_5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail6.class);
                summertimessaga110_textlist.this.startActivity(intent);
            }


        });
        



        loadfbNativeAd();
        showfbNativeBanner();
        showfbNativeBanner1();
        showfbNativeBanner2();
        showfbNativeBanner3();
        showfbNativeBanner4();
        showfbNativeBanner5();

        ShowFullAds();

        findViewById(R.id.fl_adplaceholder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url_passing(summertimessaga110_textlist.this);

            }
        });

        findViewById(R.id.fl_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url_passing(summertimessaga110_textlist.this);

            }
        });






        t1 = findViewById(R.id.img1);
        t1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail1.class);
                summertimessaga110_textlist.this.startActivity(intent);
            }


        });
        t2 = findViewById(R.id.img2);
        t2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail2.class);
                summertimessaga110_textlist.this.startActivity(intent);
            }


        });
        t3 = findViewById(R.id.img3);
        t3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail3.class);

                summertimessaga110_textlist.this.startActivity(intent);
            }

        });
        t4 = findViewById(R.id.img4);
        t4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail4.class);

                summertimessaga110_textlist.this.startActivity(intent);
            }

        });
        t5 = findViewById(R.id.img5);
        t5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail5.class);

                summertimessaga110_textlist.this.startActivity(intent);
            }

        });

        t6 = findViewById(R.id.img6);
        t6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                Intent intent = new Intent(summertimessaga110_textlist.this.getApplicationContext(), summertimessaga110_detail6.class);

                summertimessaga110_textlist.this.startActivity(intent);
            }
        });

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        ShowFullAds();
    }




    public void loadfbNativeAd() {
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String nativeid = sharedPreferences.getString("nativeid", null);

        Log.e(TAG, "fbnative1 " + nativeid);
        nativeAdContainer = findViewById(R.id.fl_adplaceholder);
        LayoutInflater inflater = this.getLayoutInflater();
        adView1 = (LinearLayout) inflater.inflate(R.layout.summertimessaga110_native_ad_layout3, nativeAdContainer, false);
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

    public void showfbNativeBanner1() {

        View adView = NativeBannerAdView.render(this, summertimessaga110_splesh.nativeBannerAd, NativeBannerAdView.Type.HEIGHT_100);
        nativeBannerContainer = (FrameLayout) findViewById(R.id.fl_b1);
        // Add the Native Banner Ad View to your ad container
        nativeBannerContainer.addView(adView);
    }

    public void showfbNativeBanner2() {

        View adView = NativeBannerAdView.render(this, summertimessaga110_splesh.nativeBannerAd, NativeBannerAdView.Type.HEIGHT_100);
        nativeBannerContainer = (FrameLayout) findViewById(R.id.fl_b2);
        // Add the Native Banner Ad View to your ad container
        nativeBannerContainer.addView(adView);
    }

    public void showfbNativeBanner3() {

        View adView = NativeBannerAdView.render(this, summertimessaga110_splesh.nativeBannerAd, NativeBannerAdView.Type.HEIGHT_100);
        nativeBannerContainer = (FrameLayout) findViewById(R.id.fl_b3);
        // Add the Native Banner Ad View to your ad container
        nativeBannerContainer.addView(adView);
    }

    public void showfbNativeBanner4() {

        View adView = NativeBannerAdView.render(this, summertimessaga110_splesh.nativeBannerAd, NativeBannerAdView.Type.HEIGHT_100);
        nativeBannerContainer = (FrameLayout) findViewById(R.id.fl_b4);
        // Add the Native Banner Ad View to your ad container
        nativeBannerContainer.addView(adView);
    }

    public void showfbNativeBanner5() {

        View adView = NativeBannerAdView.render(this, summertimessaga110_splesh.nativeBannerAd, NativeBannerAdView.Type.HEIGHT_100);
        nativeBannerContainer = (FrameLayout) findViewById(R.id.fl_b5);
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
}






















