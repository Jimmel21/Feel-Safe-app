package com.jimmel.feelsafe;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Options extends AppCompatActivity {
    //private Button policeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        //policeBtn = findViewById(R.id.callPolice);
    }
    public void callPolice(){
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:00000000"));
        /*
        if(ActivityCompat.checkSelfPermission(homepage.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            return;*/

        startActivity(callIntent);
    }

}
