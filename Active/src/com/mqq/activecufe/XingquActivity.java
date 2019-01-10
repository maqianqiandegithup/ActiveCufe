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

public class XingquActivity extends Activity {
	ListView listView;
	String[] titles={"515交谊舞社","安可歌唱社","辩论协会","博弈社","BGC桌悦桌游社","北六环摇滚阵线","逗你玩相声社","风尚社","光影动漫社","国乐社",
			"国球社","翰墨书画社","和平鸽协会","吉他社","经济人社团","劲博武道社","KAB创业俱乐部","酷飞篮球社","科学幻想协会","绿岩环保协会","轮滑社","木木合气道社",
			"MC魔术社","our广告社","青春红丝带","Silence读书社","Shine-me模特社","台球社","摄影社","TR网球社","未知心理社","维他户外运动社","未央舞社",
			"校友工作志愿者协会","玄默汉服社","新起点足球社","新长城自强社","艺社","羽毛球协会","映画电影协会","昭明文学社","中财idea精英汇"};
	int[] resIds={R.drawable.jiaoyiwu,R.drawable.anke,R.drawable.bianlun,R.drawable.boyishe,R.drawable.zhuoyou,R.drawable.yaogun,
			R.drawable.xiangsheng,R.drawable.fengshang,R.drawable.dongman,R.drawable.diyunxiao,R.drawable.guoqiu,R.drawable.shuhua,
			R.drawable.hepingge,R.drawable.jitashe,R.drawable.jingjiren,R.drawable.jingbo,R.drawable.kab,R.drawable.lanqiu,R.drawable.kexue,
			R.drawable.huanbao,R.drawable.lunhua,R.drawable.mumuheqi,R.drawable.moshu,R.drawable.wenhao,R.drawable.hongsi,R.drawable.dushushe,
			R.drawable.mote,R.drawable.zhuoqiu,R.drawable.sheying,R.drawable.wangqiu,R.drawable.xnli,R.drawable.weita,R.drawable.weiyang,
			R.drawable.xiaoyou,R.drawable.hanfu,R.drawable.zuqiu,R.drawable.ziqiangshe,R.drawable.yishe,R.drawable.yumaoqiu,R.drawable.yinghua,R.drawable.zhaoming,
			R.drawable.ideo};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xingqu);
		this.setTitle("兴趣类社团");
		listView=(ListView) this.findViewById(R.id.lvshetuan);
		listView.setAdapter(new ListViewAdapter(titles,resIds)); 
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(XingquActivity.this,JieShaoActivity2.class);
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
	      LayoutInflater inflater = (LayoutInflater)XingquActivity.this
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
