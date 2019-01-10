package com.mqq.activecufe;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class LilunActivity extends Activity {
	ListView listView;
	String[] titles={"��ܿ��","�ǻ�ũ�巢չ�ٽ���","�t����","���˼�����ж���","׺˼��"};
	int[] resIds={R.drawable.caiyun,R.drawable.xinghuo,R.drawable.liaowang,R.drawable.makesi,R.drawable.zhuisi};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lilun);
		this.setTitle("����������");
		listView=(ListView) this.findViewById(R.id.lvshetuan);
		listView.setAdapter(new ListViewAdapter(titles,resIds)); 
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(LilunActivity.this,JieShaoActivity.class);
				//��������
				intent.putExtra("position",position );
				startActivity(intent);				
			}
		}); 
	  } 
	    
	  public class ListViewAdapter extends BaseAdapter{ 
	    View [] itemViews; 
	      
	    public ListViewAdapter(String [] itemTitles, 
	        int [] itemImageRes){ 
	      itemViews = new View[itemTitles.length]; 
	        
	      for (int i=0; i<itemViews.length; ++i){ 
	        itemViews[i] = makeItemView(itemTitles[i], 
	            itemImageRes[i]); 
	      } 
	    } 
	      
	    public int getCount()  { 
	      return itemViews.length; 
	    } 
	      
	    public View getItem(int position)  { 
	      return itemViews[position]; 
	    } 
	      
	    public long getItemId(int position) { 
	      return position; 
	    } 
	      
	    private View makeItemView(String strTitle, int resId) { 
	      LayoutInflater inflater = (LayoutInflater)LilunActivity.this
	          .getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
	        
	      // ʹ��View�Ķ���itemView��R.layout.item���� 
	      View itemView = inflater.inflate(R.layout.item, null); 
	        
	      // ͨ��findViewById()����ʵ��R.layout.item�ڸ���� 
	      TextView title = (TextView)itemView.findViewById(R.id.itemTitle); 
	      title.setText(strTitle); 
	      ImageView image = (ImageView)itemView.findViewById(R.id.itemImage); 
	      image.setImageResource(resId);   
	      return itemView; 
	    } 
	      
	    public View getView(int position, View convertView, ViewGroup parent) { 
	      if (convertView == null) 
	        return itemViews[position]; 
	      return convertView; 
	    } 
	  } 
	
}
