package com.mqq.activecufe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class TuijianJieActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webview);
		ConnectivityManager nw = (ConnectivityManager)this.getSystemService(Context.CONNECTIVITY_SERVICE);
	    NetworkInfo netinfo = nw.getActiveNetworkInfo();
	  WebView webview=(WebView) findViewById(R.id.webview);
		webview.getSettings().setJavaScriptEnabled(true);
		Intent intent=getIntent(); //��ȡ������activity����ͼ����
		//[3]��ȡ��ô��sex��ֵ С���ɣ����ݵ���ʲô�������ͣ������ʲô����
		  String wenzi=intent.getStringExtra("wenzi");
		if(wenzi.equals("our�����")){
			  TuijianJieActivity.this.setTitle("our�����");
			  webview.loadUrl("http://mp.weixin.qq.com/s/ksu3psmITlauIa17xOlnSQ");  
		  }
		if(wenzi.equals("515��������")){
			TuijianJieActivity.this.setTitle("515��������");
			webview.loadUrl("http://mp.weixin.qq.com/s/mBUvtL-gW8zTbh4_pYSDzQ");
			  }
		if(wenzi.equals("���ɸ質��")){
			TuijianJieActivity.this.setTitle("���ɸ質��");
			webview.loadUrl("http://mp.weixin.qq.com/s/nxyNWqPvGYZwDcqbNipXbQ");
			 }
		if(wenzi.equals("������")){
			TuijianJieActivity.this.setTitle("������");
			webview.loadUrl("http://mp.weixin.qq.com/s/NCH8sNxSdYUAme_jeNTECw");
			 }
		if(wenzi.equals("BGC����������")){
			TuijianJieActivity.this.setTitle("BGC����������");
			webview.loadUrl("http://mp.weixin.qq.com/s/NekeDDPIsCJXZXL9dFJxng");
			 }
		if(wenzi.equals("������ҡ������")){
			TuijianJieActivity.this.setTitle("������ҡ������");
			webview.loadUrl("http://mp.weixin.qq.com/s/NClWNfbUg50evtbkMEy0Cw");
			  }
		if(wenzi.equals("������������")){
			TuijianJieActivity.this.setTitle("������������");
			webview.loadUrl("http://mp.weixin.qq.com/s/GLnpMsJh-zPtOLu02M1gpQ");
			 }
		if(wenzi.equals("������")){
			TuijianJieActivity.this.setTitle("������");
			webview.loadUrl("http://mp.weixin.qq.com/s/fYsBNiVefpOe5-X9m3tQrA");
			  }
		if(wenzi.equals("��Ӱ������")){
			TuijianJieActivity.this.setTitle("��Ӱ������");
			webview.loadUrl("http://mp.weixin.qq.com/s/9TRVxLwww7J0FsEiogQEZw");
			  }
		if(wenzi.equals("������")){
			TuijianJieActivity.this.setTitle("������");
			webview.loadUrl("http://mp.weixin.qq.com/s/KGquIurK0qEnnpT4Lrsq2Q");
			  }
		if(wenzi.equals("������")){
			TuijianJieActivity.this.setTitle("������");
			webview.loadUrl("http://mp.weixin.qq.com/s/qDqKo9eWZJvLBnA25FS9hw");
			  }
		if(wenzi.equals("��ī�黭��")){
			TuijianJieActivity.this.setTitle("��ī�黭��");
			webview.loadUrl("http://mp.weixin.qq.com/s/NwmKhxixk0bmYeFYFnPO0Q");
				  }
		if(wenzi.equals("��ƽ��Э��")){
			TuijianJieActivity.this.setTitle("��ƽ��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/Z9I-cxKu3gnDVn4C_nDe4g");
			  }
		if(wenzi.equals("������")){
			TuijianJieActivity.this.setTitle("������");
			webview.loadUrl("http://mp.weixin.qq.com/s/lGEUV6BGDC16I18_TwtHVA");
		 }
		if(wenzi.equals("����������")){
			TuijianJieActivity.this.setTitle("����������");
			webview.loadUrl("http://mp.weixin.qq.com/s/6qRfMK_HvVao2_-prcIsvw");
			}
		if(wenzi.equals("���������")){
			TuijianJieActivity.this.setTitle("���������");
			webview.loadUrl("http://mp.weixin.qq.com/s/EEIiYPYcayRjh7LpS38Q9g");
		 }
		if(wenzi.equals("KAB��ҵ���ֲ�")){
			TuijianJieActivity.this.setTitle("KAB��ҵ���ֲ�");
			webview.loadUrl("http://mp.weixin.qq.com/s/5-dVZ7iXChdc1jQaI4WH6A");
			 }
		if(wenzi.equals("���������")){
			TuijianJieActivity.this.setTitle("���������");
			webview.loadUrl("http://mp.weixin.qq.com/s/RheldGOiilYQAgw8tbDVQg");
			}
		if(wenzi.equals("��ѧ����Э��")){
			TuijianJieActivity.this.setTitle("��ѧ����Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/8MAbBLVUmU9RNcvpKK87Mg");
			 }
		if(wenzi.equals("���һ���Э��")){
			TuijianJieActivity.this.setTitle("���һ���Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/ze7QNVgdERamzVYnPwputA");
		 }
		if(wenzi.equals("�ֻ���")){
			TuijianJieActivity.this.setTitle("�ֻ���");
			webview.loadUrl("http://mp.weixin.qq.com/s/EjSgK1kC-c3rQWJmSCPSRQ");
			  }
		if(wenzi.equals("ľľ��������")){
			TuijianJieActivity.this.setTitle("ľľ��������");
			webview.loadUrl("http://mp.weixin.qq.com/s/qXef8gSSXGAkC-2nRIxZbQ");
			 }
		if(wenzi.equals("MCħ����")){
			TuijianJieActivity.this.setTitle("MCħ����");
			webview.loadUrl("http://mp.weixin.qq.com/s/rePuHv0Opx9qiR09x6LzoA");
			  }
		if(wenzi.equals("�ഺ��˿��")){
			TuijianJieActivity.this.setTitle("�ഺ��˿��");
			webview.loadUrl("http://mp.weixin.qq.com/s/BCGDJ-8XX_r2xQXb7wzcEw");
			  }
		if(wenzi.equals("Silence������")){
			TuijianJieActivity.this.setTitle("Silence������");
			webview.loadUrl("http://mp.weixin.qq.com/s/kjFVX5SFQQysE-HviDj9_Q");
			  }
		if(wenzi.equals("Shine-meģ����")){
			TuijianJieActivity.this.setTitle("Shine-meģ����");
			webview.loadUrl("http://mp.weixin.qq.com/s/GbasDTaVdlAvCWxEPfDu8Q");
			  }
		if(wenzi.equals("̨����")){
			TuijianJieActivity.this.setTitle("̨����");
			webview.loadUrl("http://mp.weixin.qq.com/s/n1QycZ24VJ38lWdT97A-pg");
			  }
		if(wenzi.equals("��Ӱ��")){
			TuijianJieActivity.this.setTitle("��Ӱ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/UV_pup5A7w2if4bow4tH3w");
			  }
		if(wenzi.equals("TR������")){
			TuijianJieActivity.this.setTitle("TR������");
			webview.loadUrl("http://mp.weixin.qq.com/s/nVNc2L-BHTHMFk4ObrxjkA");
			  }
		if(wenzi.equals("δ֪������")){
			TuijianJieActivity.this.setTitle("δ֪������");
			webview.loadUrl("http://mp.weixin.qq.com/s/URMceVUKrU58mkXwMlTXVQ");
			  }
		if(wenzi.equals("ά�������˶���")){
			TuijianJieActivity.this.setTitle("ά�������˶���");
			webview.loadUrl("http://mp.weixin.qq.com/s/ugGFDU4ShCGVX9-XUtyLxw");
			  }
		if(wenzi.equals("δ������")){
			TuijianJieActivity.this.setTitle("δ������");
			webview.loadUrl("http://mp.weixin.qq.com/s/UZDtWleEHocvAbcfAw0Lew");
			  }
		if(wenzi.equals("У�ѹ���־Ը��Э��")){
			TuijianJieActivity.this.setTitle("У�ѹ���־Ը��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/SKamLlhEkovuHoPRxYNw0g");
			  }
		if(wenzi.equals("��Ĭ������")){
			TuijianJieActivity.this.setTitle("��Ĭ������");
			webview.loadUrl("http://mp.weixin.qq.com/s/3HG41FbtdKgD_gliWd1NvA");
			  }
		if(wenzi.equals("�³�����ǿ��")){
			TuijianJieActivity.this.setTitle("�³�����ǿ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/owXsfXzeiPWfR3hj3XTp_w");
			  }
		if(wenzi.equals("�����������")){
			TuijianJieActivity.this.setTitle("�����������");
			webview.loadUrl("http://mp.weixin.qq.com/s/L-jy5_pM68CLgxsLLl85qA");
				  }
		if(wenzi.equals("����")){
			TuijianJieActivity.this.setTitle("����");
			webview.loadUrl("http://mp.weixin.qq.com/s/XLGzFuIcVy5JSR0vN5f6Og");
			  }
		if(wenzi.equals("��ë��Э��")){
			TuijianJieActivity.this.setTitle("��ë��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/63JJ105ZinH5c-EqJlMQ5Q");
			  }
		if(wenzi.equals("ӳ����ӰЭ��")){
			TuijianJieActivity.this.setTitle("ӳ����ӰЭ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/1zEcUp09QTfmX4VkhBYWpg");
			  }
		if(wenzi.equals("������ѧ��")){
			TuijianJieActivity.this.setTitle("������ѧ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/bhEu_WeP9FLAK8KOaBP8Tg");
			  }
		if(wenzi.equals("�в�idea��Ӣ��")){
			TuijianJieActivity.this.setTitle("�в�idea��Ӣ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/nvGpPVI500317XGaVgh5eA");
			  }
		if(wenzi.equals("��ܿ��")){
			TuijianJieActivity.this.setTitle("��ܿ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/okSC6yk_aYcNJWfQalDe-w");
			  }
		if(wenzi.equals("eѧ��")){
			TuijianJieActivity.this.setTitle("eѧ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/IsSDM13pvEX0Nv8ntQICzQ");
			  }
		if(wenzi.equals("�t����")){
			TuijianJieActivity.this.setTitle("�t����");
			webview.loadUrl("http://mp.weixin.qq.com/s/hi8EZrPFg9s6l6fvAerKsg");
			  }
		if(wenzi.equals("����˼�����ж���")){
			TuijianJieActivity.this.setTitle("����˼�����ж���");
			webview.loadUrl("http://mp.weixin.qq.com/s/kfdlPZ3hckh9Y-bI74LURg");
		  }
		if(wenzi.equals("׺˼��")){
			TuijianJieActivity.this.setTitle("׺˼��");
			webview.loadUrl("http://mp.weixin.qq.com/s/dJrBMY8wWdgWGXf3OwdMmQ");
			  }
		if(wenzi.equals("���������о�Э��")){
			TuijianJieActivity.this.setTitle("���������о�Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/K1QFouJY7FBjQ9ab0K6OTg");
			  }
		if(wenzi.equals("�������Э��")){
			TuijianJieActivity.this.setTitle("�������Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/12V-8EJi2_xvmQZfOAczBg");
		  }
		if(wenzi.equals("��������Э��")){
			TuijianJieActivity.this.setTitle("��������Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/7n4QDgIzKw5dnXYwR_Yhfg");
			  }
		if(wenzi.equals("��ѧ�о���")){
			TuijianJieActivity.this.setTitle("��ѧ�о���");
			webview.loadUrl("http://mp.weixin.qq.com/s/lvPfSq_xtDTz9JZroud8KA");
			  }
		if(wenzi.equals("��������̸��Э��")){
			TuijianJieActivity.this.setTitle("��������̸��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/o4vNYaLg-TBGcBvwdkhdRA");
			  }
		if(wenzi.equals("���������о���")){
			TuijianJieActivity.this.setTitle("���������о���");
			webview.loadUrl("http://mp.weixin.qq.com/s/5Y9JqhUWwcNahn7atJJSgg");
			  }
		if(wenzi.equals("��óѧ��")){
			TuijianJieActivity.this.setTitle("��óѧ��");
			webview.loadUrl("http://mp.weixin.qq.com/s/vywdlv2nA33O_3FWg-enWQ");
			  }
		if(wenzi.equals("HR�о�Э��")){
			TuijianJieActivity.this.setTitle("HR�о�Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/WQaRCnOi8Yo_6qbIOAXJMg");
			  }
		if(wenzi.equals("��Ҷ���ʹ�ϵѧ��")){
			TuijianJieActivity.this.setTitle("��Ҷ���ʹ�ϵѧ�ᣨ�в�ģ����");
			webview.loadUrl("http://mp.weixin.qq.com/s/YbGjXHprb8WotRgW1e60Ew");
			  }
		if(wenzi.equals("����ѧ���о���")){
			TuijianJieActivity.this.setTitle("����ѧ���о���");
			webview.loadUrl("http://mp.weixin.qq.com/s/KEpH_6YWJ8wr-jlitpW37Q");
			  }
		if(wenzi.equals("����о�Э��")){
			TuijianJieActivity.this.setTitle("����о�Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/zLaVyhZjb-cx97KWEib5Ow");
			  }
		if(wenzi.equals("��ɫ���ڹ����о�Э��")){
			TuijianJieActivity.this.setTitle("��ɫ���ڹ����о�Э��");
				webview.loadUrl("http://mp.weixin.qq.com/s/fr_qAngdl2MrSZl2SenVxA");
			  }
		if(wenzi.equals("ǧ����ѧ��")){
					TuijianJieActivity.this.setTitle("ǧ����ѧ��");
					webview.loadUrl("http://mp.weixin.qq.com/s/Olkv6zCB73cmYr96IWQZuA");
					  }
		if(wenzi.equals("�����о�Э��")){
			TuijianJieActivity.this.setTitle("�����о�Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/GBHp3wuGyaP3JnUwRCLLvA");
			  }
		if(wenzi.equals("���Ǵ��¾��ֲ�")){
			TuijianJieActivity.this.setTitle("���Ǵ��¾��ֲ�");
			webview.loadUrl("http://mp.weixin.qq.com/s/prGkIH5aMKyP26nelTgmfg");
			  }
		if(wenzi.equals("����Ӣ����")){
			TuijianJieActivity.this.setTitle("����Ӣ����");
			webview.loadUrl("http://mp.weixin.qq.com/s/ceUjrKnXIzW4wovsgazOwA");
				  }
		if(wenzi.equals("������Э��")){
			TuijianJieActivity.this.setTitle("������Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/WrgkBx9_OBXrpOzOUYuAZQ");
				  }
		if(wenzi.equals("��Ṥ��Э��")){
			TuijianJieActivity.this.setTitle("��Ṥ��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/ORU-DWaXwRCLko589s8wnQ");
				  }
		if(wenzi.equals("Ӣ��Э��")){
			TuijianJieActivity.this.setTitle("Ӣ��Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/vc-tk3QIwa36c80lc8ZxlA");
				  }
		if(wenzi.equals("˰���о���")){
			TuijianJieActivity.this.setTitle("˰���о���");
			webview.loadUrl("http://mp.weixin.qq.com/s/S8uQo-e19_PSMMn7n6ffgA");
			  }
		if(wenzi.equals("�ǻ�ũ�巢չ�ٽ���")){
			TuijianJieActivity.this.setTitle("�ǻ�ũ�巢չ�ٽ���");
			webview.loadUrl("http://mp.weixin.qq.com/s/LZJg-oFqVRZlyBJF4UOhSg");
				  }
		if(wenzi.equals("֤ȯ�о�Э��")){
			TuijianJieActivity.this.setTitle("֤ȯ�о�Э��");
			webview.loadUrl("http://mp.weixin.qq.com/s/N3fyDF0rz9HoyaRnaQ7_Ag");
				  }
		 

		
			
	}
	

}