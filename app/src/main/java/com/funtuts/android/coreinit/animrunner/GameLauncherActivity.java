package com.funtuts.android.coreinit.animrunner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class GameLauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_launcher);
    }

    public void startAnimation(View v) {
        Intent intent = new Intent(this, AnimRunnerActivity.class);
        startActivity(intent);
    }
}
