package com.jimmel.feelsafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class homepage extends AppCompatActivity {
    //private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        //button = findViewById(R.id.distressBTN);

    }
    public void viewOptions(){
        Intent intent = new Intent(getApplicationContext(),Options.class );
        startActivity(intent);
    }
}
