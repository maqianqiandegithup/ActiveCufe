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
	String[] titles={"515��������","���ɸ質��","����Э��","������","BGC����������","������ҡ������","������������","������","��Ӱ������","������",
			"������","��ī�黭��","��ƽ��Э��","������","����������","���������","KAB��ҵ���ֲ�","���������","��ѧ����Э��","���һ���Э��","�ֻ���","ľľ��������",
			"MCħ����","our�����","�ഺ��˿��","Silence������","Shine-meģ����","̨����","��Ӱ��","TR������","δ֪������","ά�������˶���","δ������",
			"У�ѹ���־Ը��Э��","��Ĭ������","�����������","�³�����ǿ��","����","��ë��Э��","ӳ����ӰЭ��","������ѧ��","�в�idea��Ӣ��"};
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
		this.setTitle("��Ȥ������");
		listView=(ListView) this.findViewById(R.id.lvshetuan);
		listView.setAdapter(new ListViewAdapter(titles,resIds)); 
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(XingquActivity.this,JieShaoActivity2.class);
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
	      LayoutInflater inflater = (LayoutInflater)XingquActivity.this
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
