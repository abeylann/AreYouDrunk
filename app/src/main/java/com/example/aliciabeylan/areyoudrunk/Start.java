package com.example.aliciabeylan.areyoudrunk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.LogRecord;

/**
 * Created by AliciaBeylan on 31/01/2016.
 */
public class Start extends Activity {
    @Override
    public void onBackPressed() {
        // do nothing.
    }

    private final static String tag = Start.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);


        Log.i(tag, "Splash");
        setContentView(R.layout.activity_start);

        TimerTask task = new TimerTask() {

            @Override
            public void run() {

                Intent intent = new Intent(Start.this, menu.class);
                startActivity(intent);
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 3000);
    }

}
