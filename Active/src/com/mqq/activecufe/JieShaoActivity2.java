package com.mqq.activecufe;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class JieShaoActivity2 extends Activity {
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
			JieShaoActivity2.this.setTitle("515��������");
			webview.loadUrl("http://mp.weixin.qq.com/s/mBUvtL-gW8zTbh4_pYSDzQ");
			break;
		case 1:
			JieShaoActivity2.this.setTitle("���ɸ質��");
			webview.loadUrl("http://mp.weixin.qq.com/s/nxyNWqPvGYZwDcqbNipXbQ");
			break;
		case 2:
			JieShaoActivity2.this.setTitle("����Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/B35TNkmUEzgxBHtBzxxS4Q");
			break;
		case 3:
			JieShaoActivity2.this.setTitle("������");
			webview.loadUrl("http://mp.weixin.qq.com/s/NCH8sNxSdYUAme_jeNTECw");
			break;
		case 4:
			JieShaoActivity2.this.setTitle("BGC����������");
			webview.loadUrl("http://mp.weixin.qq.com/s/NekeDDPIsCJXZXL9dFJxng");
			break;
		case 5:
			JieShaoActivity2.this.setTitle("������ҡ������");
			webview.loadUrl("http://mp.weixin.qq.com/s/NClWNfbUg50evtbkMEy0Cw");
			break;
		case 6:
			JieShaoActivity2.this.setTitle("������������");
			webview.loadUrl("http://mp.weixin.qq.com/s/GLnpMsJh-zPtOLu02M1gpQ");
			break;
		case 7:
			JieShaoActivity2.this.setTitle("������");
			webview.loadUrl("http://mp.weixin.qq.com/s/fYsBNiVefpOe5-X9m3tQrA");
			break;
		case 8:
			JieShaoActivity2.this.setTitle("��Ӱ������");
			webview.loadUrl("http://mp.weixin.qq.com/s/9TRVxLwww7J0FsEiogQEZw");
			break;
		case 9:
			JieShaoActivity2.this.setTitle("������");
			webview.loadUrl("http://mp.weixin.qq.com/s/KGquIurK0qEnnpT4Lrsq2Q");
			break;
		case 10:
			JieShaoActivity2.this.setTitle("������");
			webview.loadUrl("http://mp.weixin.qq.com/s/qDqKo9eWZJvLBnA25FS9hw");
			break;
		case 11:
			JieShaoActivity2.this.setTitle("��ī�黭��");
			webview.loadUrl("http://mp.weixin.qq.com/s/NwmKhxixk0bmYeFYFnPO0Q");
			break;
		case 12:
			JieShaoActivity2.this.setTitle("��ƽ��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/Z9I-cxKu3gnDVn4C_nDe4g");
			break;
		case 13:
			JieShaoActivity2.this.setTitle("������");
			webview.loadUrl("http://mp.weixin.qq.com/s/lGEUV6BGDC16I18_TwtHVA");
			break;
		case 14:
			JieShaoActivity2.this.setTitle("����������");
			webview.loadUrl("http://mp.weixin.qq.com/s/6qRfMK_HvVao2_-prcIsvw");
			break;
		case 15:
			JieShaoActivity2.this.setTitle("���������");
			webview.loadUrl("http://mp.weixin.qq.com/s/EEIiYPYcayRjh7LpS38Q9g");
			break;
		case 16:
			JieShaoActivity2.this.setTitle("KAB��ҵ���ֲ�");
			webview.loadUrl("http://mp.weixin.qq.com/s/5-dVZ7iXChdc1jQaI4WH6A");
			break;
		case 17:
			JieShaoActivity2.this.setTitle("���������");
			webview.loadUrl("http://mp.weixin.qq.com/s/RheldGOiilYQAgw8tbDVQg");
			break;
		case 18:
			JieShaoActivity2.this.setTitle("��ѧ����Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/8MAbBLVUmU9RNcvpKK87Mg");
			break;
		case 19:
			JieShaoActivity2.this.setTitle("���һ���Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/ze7QNVgdERamzVYnPwputA");
			break;
		case 20:
			JieShaoActivity2.this.setTitle("�ֻ���");
			webview.loadUrl("http://mp.weixin.qq.com/s/EjSgK1kC-c3rQWJmSCPSRQ");
			break;
		case 21:
			JieShaoActivity2.this.setTitle("ľľ��������");
			webview.loadUrl("http://mp.weixin.qq.com/s/qXef8gSSXGAkC-2nRIxZbQ");
			break;
			
		case 22:
			JieShaoActivity2.this.setTitle("MCħ����");
			webview.loadUrl("http://mp.weixin.qq.com/s/rePuHv0Opx9qiR09x6LzoA");
			break;
		case 23:
			JieShaoActivity2.this.setTitle("our�����");
			webview.loadUrl("http://mp.weixin.qq.com/s/ksu3psmITlauIa17xOlnSQ");
			break;
		case 24:
			JieShaoActivity2.this.setTitle("�ഺ��˿��");
			webview.loadUrl("http://mp.weixin.qq.com/s/BCGDJ-8XX_r2xQXb7wzcEw");
			break;
		case 25:
			JieShaoActivity2.this.setTitle("Silence������");
			webview.loadUrl("http://mp.weixin.qq.com/s/kjFVX5SFQQysE-HviDj9_Q");
			break;
		case 26:
			JieShaoActivity2.this.setTitle("Shine-meģ����");
			webview.loadUrl("http://mp.weixin.qq.com/s/GbasDTaVdlAvCWxEPfDu8Q");
			break;
		case 27:
			JieShaoActivity2.this.setTitle("̨����");
			webview.loadUrl("http://mp.weixin.qq.com/s/n1QycZ24VJ38lWdT97A-pg");
			break;
		case 28:
			JieShaoActivity2.this.setTitle("��Ӱ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/UV_pup5A7w2if4bow4tH3w");
			break;
		case 29:
			JieShaoActivity2.this.setTitle("TR������");
			webview.loadUrl("http://mp.weixin.qq.com/s/nVNc2L-BHTHMFk4ObrxjkA");
			break;
		case 30:
			JieShaoActivity2.this.setTitle("δ֪������");
			webview.loadUrl("http://mp.weixin.qq.com/s/URMceVUKrU58mkXwMlTXVQ");
			break;
		case 31:
			JieShaoActivity2.this.setTitle("ά�������˶���");
			webview.loadUrl("http://mp.weixin.qq.com/s/ugGFDU4ShCGVX9-XUtyLxw");
			break;
		case 32:
			JieShaoActivity2.this.setTitle("δ������");
			webview.loadUrl("http://mp.weixin.qq.com/s/UZDtWleEHocvAbcfAw0Lew");
			break;
		case 33:
			JieShaoActivity2.this.setTitle("У�ѹ���־Ը��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/SKamLlhEkovuHoPRxYNw0g");
			break;
		case 34:
			JieShaoActivity2.this.setTitle("��Ĭ������");
			webview.loadUrl("http://mp.weixin.qq.com/s/3HG41FbtdKgD_gliWd1NvA");
			break;
		case 35:
			JieShaoActivity2.this.setTitle("�����������");
			webview.loadUrl("http://mp.weixin.qq.com/s/L-jy5_pM68CLgxsLLl85qA");
			break;
		case 36:
			JieShaoActivity2.this.setTitle("�³�����ǿ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/owXsfXzeiPWfR3hj3XTp_w");
			break;
		case 37:
			JieShaoActivity2.this.setTitle("����");
			webview.loadUrl("http://mp.weixin.qq.com/s/XLGzFuIcVy5JSR0vN5f6Og");
			break;
		case 38:
			JieShaoActivity2.this.setTitle("��ë��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/63JJ105ZinH5c-EqJlMQ5Q");
			break;
		case 39:
			JieShaoActivity2.this.setTitle("ӳ����ӰЭ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/1zEcUp09QTfmX4VkhBYWpg");
			break;
		case 40:
			JieShaoActivity2.this.setTitle("������ѧ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/bhEu_WeP9FLAK8KOaBP8Tg");
			break;
		case 41:
			JieShaoActivity2.this.setTitle("�в�idea��Ӣ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/nvGpPVI500317XGaVgh5eA");
			break;
		
		}
		
		

	}

}
