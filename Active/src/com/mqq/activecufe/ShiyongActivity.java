package com.mqq.activecufe;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ShiyongActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);
		WebView webview=(WebView) findViewById(R.id.webview);
		webview.getSettings().setJavaScriptEnabled(true);
		this.setTitle("APP使用指南");
		webview.loadUrl("http://mp.weixin.qq.com/s/-UK505eXubfeXkrWdsDpaQ");
		
		
	}

}
