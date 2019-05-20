package com.don.mapsgooglenearby;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by gideon on 20,May,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */
@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {
    public void toast(String message){
        Toast.makeText(this, "Current location:\n" + message, Toast.LENGTH_LONG).show();
    }
}
