package com.mqq.activecufe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Huanying extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void serch(View v){
		Intent intent=new Intent(this,KindActivity.class);
        startActivity(intent);
	}
	public void tuijian(View v){
		Intent intent=new Intent(this,TuijianActivity.class);
        startActivity(intent);
	}
	public void shiyong(View v){
		Intent intent=new Intent(this,ShiyongActivity.class);
        startActivity(intent);
	}
	public void shetuan(View v){
		Intent intent=new Intent(this,ShetuanActivity.class);
        startActivity(intent);
	}
	public void pengyou(View v){
		Intent intent=new Intent(this,JiaoyouActivity.class);
        startActivity(intent);
	}
	public void women(View v){
		Intent intent=new Intent(this,WomenActivity.class);
        startActivity(intent);
	}
	
}
