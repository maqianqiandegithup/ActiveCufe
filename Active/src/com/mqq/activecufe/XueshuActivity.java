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
	String[] titles={"保险理论研究协会","调查分析协会","电子商务协会","法学研究会","国际商务谈判协会","公共管理研究会",
			"国贸学社","HR研究协会","红叶国际关系学会","金融学术研究会","会计研究协会","绿色金融国际研究协会",
			"千帆数学社","日语研究协会","融智创新俱乐部","商务英语社","社会调查协会","社会工作协会","英语协会",
			"税务研究会","e学社","证券研究协会"};
	int[] resIds={R.drawable.baoxian,R.drawable.dianfen,R.drawable.dianshang,R.drawable.faxue,R.drawable.tanpan,R.drawable.gongyan,
			R.drawable.guomao,R.drawable.hryanjiu,R.drawable.molian,R.drawable.jinyan,R.drawable.kuaiyan,R.drawable.lvjin,R.drawable.shuxue,
			R.drawable.riyan,R.drawable.rongzhi,R.drawable.becs,R.drawable.shediao,R.drawable.shegong,R.drawable.yingxie,
			R.drawable.shuiyan,R.drawable.eshe,R.drawable.zhengquan};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xingqu);
		this.setTitle("学术类社团");
		listView=(ListView) this.findViewById(R.id.lvshetuan);
		listView.setAdapter(new ListViewAdapter(titles,resIds)); 
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(XueshuActivity.this,JieShaoActivity3.class);
				//传递姓名
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
	        
	      // 使用View的对象itemView与R.layout.item关联 
	      View itemView = inflater.inflate(R.layout.item, null); 
	        
	      // 通过findViewById()方法实例R.layout.item内各组件 
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
