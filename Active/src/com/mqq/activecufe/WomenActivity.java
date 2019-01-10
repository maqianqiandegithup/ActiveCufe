package com.mqq.activecufe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WomenActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_women);
	}
	
	public void lianxi(View v){
		Intent intent=new Intent(this,GuanyuActivity.class);
        startActivity(intent);
	}
	public void yijian(View v){
		Intent intent=new Intent(this,YijianActivity.class);
        startActivity(intent);
	}

}
