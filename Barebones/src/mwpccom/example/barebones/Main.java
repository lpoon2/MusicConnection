package mwpccom.example.barebones;
//Mwpc
import java.util.*;
import android.bluetooth.*;
import android.R.array;
import android.app.Activity;
import android.os.Bundle;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.widget.PopupWindow;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		String Names[]= new String[9];
//		String MACarray[]= new String[9];
        Button list = (Button) findViewById(R.id.list);
		BluetoothAdapter fa01 = BluetoothAdapter.getDefaultAdapter();
		if (fa01 == null) {
			//errorprompt();
			/**TODO:errorpromps**/
			}
		else if (!fa01.isEnabled()) {
		    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
		    startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
			}
//		Set<BluetoothDevice> BondedDevices = fa01.getBondedDevices();
//		if (BondedDevices.size() > 0) {
//		    for (BluetoothDevice device : BondedDevices) {
//		    	int c=9;
//		    	for(int i=0;i<c;i++){//does this work like this?
//		    	Names[i]=device.getName();
//		        MACarray[i]=device.getAddress();
//		    	}
//		    }
		    /**TODO:Discovery of new devices**/
		 while(fa01.isEnabled()){
			 
		 }
		 /**TODO:EnableIntents**/
	    list.setOnClickListener(new View.OnClickListener() {//what?
		 public void onClick(View v){
			 Intent intent = new Intent(Main.this,Selectr.class);
			 startActivity(intent);
		}});
		}
	}
}
