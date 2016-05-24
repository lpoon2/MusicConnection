package com.lanceandroiddevelop.mybluetoothactivityjava;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by junyuzheng on 3/8/15.
 */
public class MyBluetoothActivity extends Activity {

    private Button bluetoothOn;
    private Button bluetoothOff;
    private Button bluetoothScan;
    private Button bluetoothPaired;
    private BluetoothAdapter myBluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bluetoothOn = (Button) findViewById(R.id.btnOn);
        bluetoothOff = (Button) findViewById(R.id.btnOff);


        bluetoothOn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (!myBluetoothAdapter.isEnabled()) {
                    Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivityForResult(turnOn, 0);
                    Toast.makeText(getApplicationContext(), "Turned on"
                            , Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Already on",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        bluetoothOff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                myBluetoothAdapter.disable();
                Toast.makeText(getApplicationContext(), "Turned off",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}