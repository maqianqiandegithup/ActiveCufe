package com.mqq.activecufe;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Pingjia extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);
		WebView webview=(WebView) findViewById(R.id.webview);
		webview.getSettings().setJavaScriptEnabled(true);
		this.setTitle("…ÁÕ≈Ã˘∞…");
		webview.loadUrl("http://form.mikecrm.com/eRaDU3");
		
	}

}
