package com.mqq.activecufe;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class JieShaoActivity3 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);
		WebView webview=(WebView) findViewById(R.id.webview);
		webview.getSettings().setJavaScriptEnabled(true);
		Intent intent=getIntent(); //获取开启此activity的意图对象
		//[3]获取那么和sex的值 小技巧：传递的是什么数据类型，这边是什么数据
		int position=intent.getIntExtra("position", 0);
		switch(position){
		case 0:
			JieShaoActivity3.this.setTitle("保险理论研究协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/K1QFouJY7FBjQ9ab0K6OTg");
			break;
		case 1:
			JieShaoActivity3.this.setTitle("调查分析协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/12V-8EJi2_xvmQZfOAczBg");
			break;
		case 2:
			JieShaoActivity3.this.setTitle("电子商务协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/7n4QDgIzKw5dnXYwR_Yhfg");
			break;
		case 3:
			JieShaoActivity3.this.setTitle("法学研究会");
			webview.loadUrl("http://mp.weixin.qq.com/s/lvPfSq_xtDTz9JZroud8KA");
			break;
		case 4:
			JieShaoActivity3.this.setTitle("国际商务谈判协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/o4vNYaLg-TBGcBvwdkhdRA");
			break;
		case 5:
			JieShaoActivity3.this.setTitle("公共管理研究会");
			webview.loadUrl("http://mp.weixin.qq.com/s/5Y9JqhUWwcNahn7atJJSgg");
			break;
		case 6:
			JieShaoActivity3.this.setTitle("国贸学社");
			webview.loadUrl("http://mp.weixin.qq.com/s/vywdlv2nA33O_3FWg-enWQ");
			break;
		case 7:
			JieShaoActivity3.this.setTitle("HR研究协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/WQaRCnOi8Yo_6qbIOAXJMg");
			break;
		case 8:
			JieShaoActivity3.this.setTitle("红叶国际关系学会（中财模联）");
			webview.loadUrl("http://mp.weixin.qq.com/s/YbGjXHprb8WotRgW1e60Ew");
			break;
		case 9:
			JieShaoActivity3.this.setTitle("金融学术研究会");
			webview.loadUrl("http://mp.weixin.qq.com/s/KEpH_6YWJ8wr-jlitpW37Q");
			break;
		case 10:
			JieShaoActivity3.this.setTitle("会计研究协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/zLaVyhZjb-cx97KWEib5Ow");
			break;
		case 11:
			JieShaoActivity3.this.setTitle("绿色金融国际研究协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/fr_qAngdl2MrSZl2SenVxA");
			break;
		case 12:
			JieShaoActivity3.this.setTitle("千帆数学社");
			webview.loadUrl("http://mp.weixin.qq.com/s/Olkv6zCB73cmYr96IWQZuA");
			break;
		case 13:
			JieShaoActivity3.this.setTitle("日语研究协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/GBHp3wuGyaP3JnUwRCLLvA");
			break;
		case 14:
			JieShaoActivity3.this.setTitle("融智创新俱乐部");
			webview.loadUrl("http://mp.weixin.qq.com/s/prGkIH5aMKyP26nelTgmfg");
			break;
		case 15:
			JieShaoActivity3.this.setTitle("商务英语社");
			webview.loadUrl("http://mp.weixin.qq.com/s/ceUjrKnXIzW4wovsgazOwA");
			break;
		case 16:
			JieShaoActivity3.this.setTitle("社会调查协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/WrgkBx9_OBXrpOzOUYuAZQ");
			break;
		case 17:
			JieShaoActivity3.this.setTitle("社会工作协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/ORU-DWaXwRCLko589s8wnQ");
			break;
		case 18:
			JieShaoActivity3.this.setTitle("英语协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/vc-tk3QIwa36c80lc8ZxlA");
			break;
		case 19:
			JieShaoActivity3.this.setTitle("税务研究会");
			webview.loadUrl("http://mp.weixin.qq.com/s/S8uQo-e19_PSMMn7n6ffgA");
			break;
		case 20:
			JieShaoActivity3.this.setTitle("e学社");
			webview.loadUrl("http://mp.weixin.qq.com/s/IsSDM13pvEX0Nv8ntQICzQ");
			
			break;
		case 21:
			JieShaoActivity3.this.setTitle("证券研究协会");
			webview.loadUrl("http://mp.weixin.qq.com/s/N3fyDF0rz9HoyaRnaQ7_Ag");
			break;	
		}
		
		

	}

}
