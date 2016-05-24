package mwpccom.example.barebones;

import java.util.Set;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.view.View;

public class Selectr extends Main {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hosts);
        ListView Index = (ListView)findViewById(R.id.HOSTS);
		String Names[]= new String[9];
		String MACarray[]= new String[9];
		BluetoothAdapter fa01 = BluetoothAdapter.getDefaultAdapter();
		Set<BluetoothDevice> BondedDevices = fa01.getBondedDevices();
		if (BondedDevices.size() > 0) {
		    for (BluetoothDevice device : BondedDevices) {
		    	int c=9;
		    	for(int i=0;i<c;i++){//does this work like this?
		    	Names[i]=device.getName();
		        MACarray[i]=device.getAddress();
		    	}
		protected override void OnListItemClick(ListView l, View v, int position, long id){//propagate list with MAC.
			var t = Names[position];
		    Android.Widget.Toast.MakeText(this, t, Android.Widget.ToastLength.Short).Show();
		    }
		    }
		}
	}
}
