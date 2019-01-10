package com.mqq.activecufe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KindActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kind);
	}
	
	public void hobby(View v){
		Intent intent=new Intent(KindActivity.this,XingquActivity.class);
        startActivity(intent);
	}
	public void xueshu(View v){
		Intent intent=new Intent(KindActivity.this,XueshuActivity.class);
        startActivity(intent);
	}
	public void lilun(View v){
		Intent intent=new Intent(KindActivity.this,LilunActivity.class);
        startActivity(intent);
	}
}
