package com.mqq.activecufe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShetuanActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shetuan);
	}
	public void allshetuan(View v){
		Intent intent=new Intent(this,HuizongActivyty.class);
        startActivity(intent);
	}
	public void pingji(View v){
		Intent intent=new Intent(this,PingjiActivity.class);
        startActivity(intent);
	}
	public void baituan(View v){
		Intent intent=new Intent(this,BaituanActivity.class);
        startActivity(intent);
	}
	public void pingjia(View v){
		Intent intent=new Intent(this,Pingjia.class);
        startActivity(intent);
	}

}
