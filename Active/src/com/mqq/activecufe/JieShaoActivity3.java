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
		Intent intent=getIntent(); //��ȡ������activity����ͼ����
		//[3]��ȡ��ô��sex��ֵ С���ɣ����ݵ���ʲô�������ͣ������ʲô����
		int position=intent.getIntExtra("position", 0);
		switch(position){
		case 0:
			JieShaoActivity3.this.setTitle("���������о�Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/K1QFouJY7FBjQ9ab0K6OTg");
			break;
		case 1:
			JieShaoActivity3.this.setTitle("�������Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/12V-8EJi2_xvmQZfOAczBg");
			break;
		case 2:
			JieShaoActivity3.this.setTitle("��������Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/7n4QDgIzKw5dnXYwR_Yhfg");
			break;
		case 3:
			JieShaoActivity3.this.setTitle("��ѧ�о���");
			webview.loadUrl("http://mp.weixin.qq.com/s/lvPfSq_xtDTz9JZroud8KA");
			break;
		case 4:
			JieShaoActivity3.this.setTitle("��������̸��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/o4vNYaLg-TBGcBvwdkhdRA");
			break;
		case 5:
			JieShaoActivity3.this.setTitle("���������о���");
			webview.loadUrl("http://mp.weixin.qq.com/s/5Y9JqhUWwcNahn7atJJSgg");
			break;
		case 6:
			JieShaoActivity3.this.setTitle("��óѧ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/vywdlv2nA33O_3FWg-enWQ");
			break;
		case 7:
			JieShaoActivity3.this.setTitle("HR�о�Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/WQaRCnOi8Yo_6qbIOAXJMg");
			break;
		case 8:
			JieShaoActivity3.this.setTitle("��Ҷ���ʹ�ϵѧ�ᣨ�в�ģ����");
			webview.loadUrl("http://mp.weixin.qq.com/s/YbGjXHprb8WotRgW1e60Ew");
			break;
		case 9:
			JieShaoActivity3.this.setTitle("����ѧ���о���");
			webview.loadUrl("http://mp.weixin.qq.com/s/KEpH_6YWJ8wr-jlitpW37Q");
			break;
		case 10:
			JieShaoActivity3.this.setTitle("����о�Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/zLaVyhZjb-cx97KWEib5Ow");
			break;
		case 11:
			JieShaoActivity3.this.setTitle("��ɫ���ڹ����о�Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/fr_qAngdl2MrSZl2SenVxA");
			break;
		case 12:
			JieShaoActivity3.this.setTitle("ǧ����ѧ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/Olkv6zCB73cmYr96IWQZuA");
			break;
		case 13:
			JieShaoActivity3.this.setTitle("�����о�Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/GBHp3wuGyaP3JnUwRCLLvA");
			break;
		case 14:
			JieShaoActivity3.this.setTitle("���Ǵ��¾��ֲ�");
			webview.loadUrl("http://mp.weixin.qq.com/s/prGkIH5aMKyP26nelTgmfg");
			break;
		case 15:
			JieShaoActivity3.this.setTitle("����Ӣ����");
			webview.loadUrl("http://mp.weixin.qq.com/s/ceUjrKnXIzW4wovsgazOwA");
			break;
		case 16:
			JieShaoActivity3.this.setTitle("������Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/WrgkBx9_OBXrpOzOUYuAZQ");
			break;
		case 17:
			JieShaoActivity3.this.setTitle("��Ṥ��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/ORU-DWaXwRCLko589s8wnQ");
			break;
		case 18:
			JieShaoActivity3.this.setTitle("Ӣ��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/vc-tk3QIwa36c80lc8ZxlA");
			break;
		case 19:
			JieShaoActivity3.this.setTitle("˰���о���");
			webview.loadUrl("http://mp.weixin.qq.com/s/S8uQo-e19_PSMMn7n6ffgA");
			break;
		case 20:
			JieShaoActivity3.this.setTitle("eѧ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/IsSDM13pvEX0Nv8ntQICzQ");
			
			break;
		case 21:
			JieShaoActivity3.this.setTitle("֤ȯ�о�Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/N3fyDF0rz9HoyaRnaQ7_Ag");
			break;	
		}
		
		

	}

}
