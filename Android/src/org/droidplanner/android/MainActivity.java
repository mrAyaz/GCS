package org.droidplanner.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import org.droidplanner.android.activities.FlightActivity;

/**
 * Created by Mamedli ayaz on 06.01.2016.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, FlightActivity.class);
                startActivity(i);
                finish();
            }
        }, 3 * 1000);
    }
}
