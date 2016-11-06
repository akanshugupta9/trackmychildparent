package com.example.kanchicoder.trackmychildparent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.*;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by kanchicoder on 11/6/2016.
 */

public class SplashScreen extends AppCompatActivity {
    private ImageView logo;
    private TextView appname;
    private static int TIME_OUT = 800;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        //setting the animation in splash
        logo = (ImageView) findViewById(R.id.splash_logo_imageview);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        logo.startAnimation(animation);
        appname = (TextView) findViewById(R.id.splash_app_name_textView);
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        appname.startAnimation(animation2);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(getApplicationContext(), WelcomeActivity.class));
                        finish();
                    }
                }, TIME_OUT);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

}
