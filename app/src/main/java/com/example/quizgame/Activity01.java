package com.example.quizgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Activity01 extends Activity {


    private final int SPLASH_DISPLAY_LENGTH = 5050;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_01);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Activity01.this,LoginActivity.class);
                Activity01.this.startActivity(mainIntent);
                Activity01.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
