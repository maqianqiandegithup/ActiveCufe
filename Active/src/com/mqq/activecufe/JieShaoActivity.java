package com.mqq.activecufe;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class JieShaoActivity extends Activity {
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
			JieShaoActivity.this.setTitle("��ܿ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/okSC6yk_aYcNJWfQalDe-w");
			break;
		case 1:
			JieShaoActivity.this.setTitle("�ǻ�ũ�巢չ�ٽ���");
			webview.loadUrl("http://mp.weixin.qq.com/s/LZJg-oFqVRZlyBJF4UOhSg");
			break;
		case 2:
			JieShaoActivity.this.setTitle("�t����");
			webview.loadUrl("http://mp.weixin.qq.com/s/hi8EZrPFg9s6l6fvAerKsg");
			break;
		case 3:
			JieShaoActivity.this.setTitle("���˼�����ж���");
			webview.loadUrl("http://mp.weixin.qq.com/s/kfdlPZ3hckh9Y-bI74LURg");
			break;
		case 4:
			JieShaoActivity.this.setTitle("׺˼��");
			webview.loadUrl("http://mp.weixin.qq.com/s/dJrBMY8wWdgWGXf3OwdMmQ");
			break;
			
			
		}
		
		

	}

}
