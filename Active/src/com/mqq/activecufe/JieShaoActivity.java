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
		Intent intent=getIntent(); //获取开启此activity的意图对象
		//[3]获取那么和sex的值 小技巧：传递的是什么数据类型，这边是什么数据
		int position=intent.getIntExtra("position", 0);
		switch(position){
		case 0:
			JieShaoActivity.this.setTitle("财芸社");
			webview.loadUrl("http://mp.weixin.qq.com/s/okSC6yk_aYcNJWfQalDe-w");
			break;
		case 1:
			JieShaoActivity.this.setTitle("星火农村发展促进会");
			webview.loadUrl("http://mp.weixin.qq.com/s/LZJg-oFqVRZlyBJF4UOhSg");
			break;
		case 2:
			JieShaoActivity.this.setTitle("瞭望社");
			webview.loadUrl("http://mp.weixin.qq.com/s/hi8EZrPFg9s6l6fvAerKsg");
			break;
		case 3:
			JieShaoActivity.this.setTitle("马克思主义研读社");
			webview.loadUrl("http://mp.weixin.qq.com/s/kfdlPZ3hckh9Y-bI74LURg");
			break;
		case 4:
			JieShaoActivity.this.setTitle("缀思社");
			webview.loadUrl("http://mp.weixin.qq.com/s/dJrBMY8wWdgWGXf3OwdMmQ");
			break;
			
			
		}
		
		

	}

}
