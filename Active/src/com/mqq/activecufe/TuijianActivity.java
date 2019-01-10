package com.mqq.activecufe;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class TuijianActivity extends Activity {
	Spinner hobby;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acitivity_tuijian);
		hobby=(Spinner) findViewById(R.id.Hlist);
	}
	public void tijiao(View v){
		String[] hobbys=getResources().getStringArray(R.array.hobby);
		int index=hobby.getSelectedItemPosition();
		String factor=hobbys[index];
			Intent intent=new Intent(this,ResultActivity.class);
			intent.putExtra("factor", factor);
			startActivity(intent);
		
	}

}
