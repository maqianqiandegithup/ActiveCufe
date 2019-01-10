package com.mqq.activecufe;

import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.huanying);	
	
		final Intent intent = new Intent(this, Huanying.class);  
		
		Timer timer = new Timer(); 

		TimerTask task = new TimerTask() {  

		    @Override  
		    public void run() {   
		         startActivity(intent);
		         finish();//÷¥––  
		     } 

		 };

		timer.schedule(task, 1000 * 3); //3√Î∫Û
	}
	
	
}
