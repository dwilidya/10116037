package com.example.asusa455l.a10116037;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class splashActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(6000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(splashActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
