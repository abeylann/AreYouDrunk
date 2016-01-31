package com.example.aliciabeylan.areyoudrunk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.LogRecord;

/**
 * Created by AliciaBeylan on 31/01/2016.
 */
public class Start extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Intent intent = new Intent (this, menu.class);
        startActivity(intent);
        finish();
    }



//    TimerTask task = new TimerTask(){
//
//        public void run(){
//        Intent mainIntent = new Intent(Start.this, menu.class);
//        startActivity(mainIntent);
//        finish();
//    }
//    };
//    Timer timer = new Timer();
//    timer.schedule(task,3000);


}
