package com.mqq.activecufe;

import java.util.ArrayList;



import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class ResultActivity extends Activity {
	sqlhelper SqlHelper;
	ListView lv;
	ArrayList<String> names=new ArrayList<String>();
	int i;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tuijianresult);
		Intent intent=getIntent(); 
		String factor=intent.getStringExtra("factor");
        lv=(ListView) findViewById(R.id.result);
		SqlHelper=new sqlhelper(getApplicationContext());//接收上下文
		SQLiteDatabase db=SqlHelper.getWritableDatabase();
		Cursor cursor=db.query("info", null, "factor=?", new String[]{factor}, null, null, null);
	       if (cursor!=null&&cursor.getCount()>0){
	    	  
	    		while(cursor.moveToNext()){
	    			for(i=2;cursor.getString(i)!=null;i++){
	    				String Sname=cursor.getString(i);
	    				names.add(Sname);
	    			}
	    			
	    			lv.setAdapter(new MyAdapter());
	    		}
	       }
	       db.close();
	       lv.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
					// TODO Auto-generated method stub
					Intent intent=new Intent(ResultActivity.this,TuijianJieActivity.class);
					//传递姓名
					
					TextView txv=(TextView) view.findViewById(R.id.itemTitle);
					String wenzi=(String) txv.getText();
					intent.putExtra("wenzi",wenzi );
					startActivity(intent);				
				}
			}); 
		}
		//定义listview的数据适配器
		private class MyAdapter extends BaseAdapter{

			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return names.size();
			}

			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return 0;
			}
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				View view;
				if(convertView==null){
					view=View.inflate(getApplicationContext(), R.layout.item, null);
				}else{
					view=convertView;
				}
				TextView tv_name=(TextView) view.findViewById(R.id.itemTitle);
				tv_name.setText(names.get(position));
				
				return view;
			}
			
			
		}

		

}
