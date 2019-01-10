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

public class XueshuActivity extends Activity {
	ListView listView;
	String[] titles={"���������о�Э��","�������Э��","��������Э��","��ѧ�о���","��������̸��Э��","���������о���",
			"��óѧ��","HR�о�Э��","��Ҷ���ʹ�ϵѧ��","����ѧ���о���","����о�Э��","��ɫ���ڹ����о�Э��",
			"ǧ����ѧ��","�����о�Э��","���Ǵ��¾��ֲ�","����Ӣ����","������Э��","��Ṥ��Э��","Ӣ��Э��",
			"˰���о���","eѧ��","֤ȯ�о�Э��"};
	int[] resIds={R.drawable.baoxian,R.drawable.dianfen,R.drawable.dianshang,R.drawable.faxue,R.drawable.tanpan,R.drawable.gongyan,
			R.drawable.guomao,R.drawable.hryanjiu,R.drawable.molian,R.drawable.jinyan,R.drawable.kuaiyan,R.drawable.lvjin,R.drawable.shuxue,
			R.drawable.riyan,R.drawable.rongzhi,R.drawable.becs,R.drawable.shediao,R.drawable.shegong,R.drawable.yingxie,
			R.drawable.shuiyan,R.drawable.eshe,R.drawable.zhengquan};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xingqu);
		this.setTitle("ѧ��������");
		listView=(ListView) this.findViewById(R.id.lvshetuan);
		listView.setAdapter(new ListViewAdapter(titles,resIds)); 
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(XueshuActivity.this,JieShaoActivity3.class);
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
	      LayoutInflater inflater = (LayoutInflater)XueshuActivity.this
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
	     
	        return itemViews[position]; 
	    
	    } 
	  } 
	
}
