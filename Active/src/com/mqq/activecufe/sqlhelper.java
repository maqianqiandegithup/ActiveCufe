package com.mqq.activecufe;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class sqlhelper extends SQLiteOpenHelper {

	public sqlhelper(Context context) {
		super(context, "shetuan.db", null, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("create table info(_id integer primary key autoincrement,factor varchar(20),name1 varchar(20),name2 varchar(20),"
				+ "name3 varchar(20),name4 varchar(20),name5 varchar(20),name6 varchar(20),name7 varchar(20),name8 varchar(20),name9 varchar(20))");
		db.execSQL("insert into info('factor','name1')values('广告创意','our广告社')");

        db.execSQL("insert into info('factor','name1')values('心理','未知心理社')");
        db.execSQL("insert into info('factor','name1')values('精英','中财idea精英汇')");
        db.execSQL("insert into info('factor','name1')values('桌游','BGC桌悦桌游社')");
        db.execSQL("insert into info('factor','name1')values('汉文化','玄默汉服社')");
		db.execSQL("insert into info('factor','name1')values('时事热点','瞭望社')");
		db.execSQL("insert into info('factor','name1')values('双学位','e学社')");
		db.execSQL("insert into info('factor','name1')values('模特','Shine-me模特社')");
		db.execSQL("insert into info('factor','name1')values('魔术','MC魔术社')");
		db.execSQL("insert into info('factor','name1')values('乒乓球','国球社')");
		db.execSQL("insert into info('factor','name1')values('电影','映画电影协会')");
		db.execSQL("insert into info('factor','name1')values('乐队','北六环摇滚阵线')");
		db.execSQL("insert into info('factor','name1','name2')values('实习','证券研究协会','金融学术研究会')");
		db.execSQL("insert into info('factor','name1')values('股票证券','证券研究协会')");
		db.execSQL("insert into info('factor','name1')values('统计分析','调查分析协会')");
		db.execSQL("insert into info('factor','name1','name2')values('数学','千帆数学社','调查分析协会')");
		db.execSQL("insert into info('factor','name1')values('税务','税务研究会')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('实践','社会工作协会','证券研究协会','社会调查协会')");
		db.execSQL("insert into info('factor','name1')values('金融','金融学术研究会')");
		db.execSQL("insert into info('factor','name1')values('会计','会计研究协会')");
		db.execSQL("insert into info('factor','name1')values('模联','红叶国际关系学会')");
		db.execSQL("insert into info('factor','name1','name2')values('交流','国贸学社','英语协会')");
		db.execSQL("insert into info('factor','name1')values('法学','法学研究会')");
		db.execSQL("insert into info('factor','name1')values('电商','电子商务协会')");
		db.execSQL("insert into info('factor','name1')values('合气道','木木合气道社')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('国际','保险理论研究协会','红叶国际关系学会','国际商务谈判协会')");
		db.execSQL("insert into info('factor','name1')values('论坛','社会调查协会')");
		db.execSQL("insert into info('factor','name1','name2')values('社会调查','社会调查协会','社会工作协会')");
		db.execSQL("insert into info('factor','name1','name2')values('创新创业','融智创新俱乐部','KAB创业俱乐部')");
		db.execSQL("insert into info('factor','name1')values('日文化','日语研究协会')");
		db.execSQL("insert into info('factor','name1')values('谈判','国际商务谈判协会')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('商务','国际商务谈判协会','电子商务协会','商务英语社')");
		db.execSQL("insert into info('factor','name1')values('财经洞察','财芸社')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('音乐','安可歌唱社','北六环摇滚阵线','国乐社')");
		db.execSQL("insert into info('factor','name1','name2')values('摄影','Our广告社','摄影社')");
		db.execSQL("insert into info('factor','name1')values('管理','HR研究协会')");
		db.execSQL("insert into info('factor','name1')values('手工','艺社')");
		db.execSQL("insert into info('factor','name1','name2')values('动漫','光影动漫社','日语研究协会')");
		db.execSQL("insert into info('factor','name1')values('乐器','国乐社')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('书法绘画','翰墨书画社','国乐社','玄默汉服社')");
		db.execSQL("insert into info('factor','name1')values('读书、小说','Silence读书社')");
		db.execSQL("insert into info('factor','name1')values('经济','经济人社团')");
		db.execSQL("insert into info('factor','name1')values('礼仪','风尚社')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('时尚','风尚社','未央舞社','Shine-me模特社')");
		db.execSQL("insert into info('factor','name1','name2','name3','name4','name5','name6')values('公益志愿','青春红丝带',"
				+ "'绿岩环保协会','校友工作志愿者协会','和平鸽协会','社会工作协会','新长城自强社')");
		db.execSQL("insert into info('factor','name1')values('校友','校友工作志愿者协会')");
		db.execSQL("insert into info('factor','name1')values('相声','逗你玩相声社')");
		db.execSQL("insert into info('factor','name1')values('环保','绿岩环保协会')");
		db.execSQL("insert into info('factor','name1')values('游戏','BGC桌悦桌游社')");
		db.execSQL("insert into info('factor','name1')values('文学','昭明文学社')");
		db.execSQL("insert into info('factor','name1','name2')values('舞蹈','未央舞社','515交谊舞社')");
		db.execSQL("insert into info('factor','name1')values('棋牌','博弈社')");
		db.execSQL("insert into info('factor','name1','name2')values('英语','英语协会','商务英语社')");
		db.execSQL("insert into info('factor','name1','name2')values('奇幻','科学幻想协会','未知心理社')");
		db.execSQL("insert into info('factor','name1','name2','name3','name4','name5','name6','name7','name8')values('运动','TR网球社','新起点足球社',"
				+ "'维他户外运动社','羽毛球协会','轮滑社','酷飞篮球社','台球社','国球社')");
		db.execSQL("insert into info('factor','name1','name2')values('武术','劲博武道社','木木合气道社')");
		

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
