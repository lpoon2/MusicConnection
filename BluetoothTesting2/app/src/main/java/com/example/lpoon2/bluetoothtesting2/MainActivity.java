package com.example.lpoon2.bluetoothtesting2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.bluetooth.R;


public class  MainActivity extends Activity {

    private Button bluetooth;
    private Button music;

    public void getBluetooth(View view) {
        bluetooth  = (Button)findViewById(R.id.button);
        Intent intent = new Intent(MainActivity.this, BluetoothTesting.class);
        startActivity(intent);
    }

    public void getMusic(View view){
        music = (Button)findViewById(R.id.button4);
        Intent intent = new Intent (MainActivity.this, MusicPlayer.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }







}



