package com.mqq.activecufe;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class JiaoyouActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);
		WebView webview=(WebView) findViewById(R.id.webview);
		webview.getSettings().setJavaScriptEnabled(true);
		this.setTitle("–À»§Ωª”—");
		webview.loadUrl("http://mp.weixin.qq.com/s/zIuHatKv-7BIk1BahN06Og");

	}

}
