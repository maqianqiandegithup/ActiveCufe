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
		db.execSQL("insert into info('factor','name1')values('��洴��','our�����')");

        db.execSQL("insert into info('factor','name1')values('����','δ֪������')");
        db.execSQL("insert into info('factor','name1')values('��Ӣ','�в�idea��Ӣ��')");
        db.execSQL("insert into info('factor','name1')values('����','BGC����������')");
        db.execSQL("insert into info('factor','name1')values('���Ļ�','��Ĭ������')");
		db.execSQL("insert into info('factor','name1')values('ʱ���ȵ�','�t����')");
		db.execSQL("insert into info('factor','name1')values('˫ѧλ','eѧ��')");
		db.execSQL("insert into info('factor','name1')values('ģ��','Shine-meģ����')");
		db.execSQL("insert into info('factor','name1')values('ħ��','MCħ����')");
		db.execSQL("insert into info('factor','name1')values('ƹ����','������')");
		db.execSQL("insert into info('factor','name1')values('��Ӱ','ӳ����ӰЭ��')");
		db.execSQL("insert into info('factor','name1')values('�ֶ�','������ҡ������')");
		db.execSQL("insert into info('factor','name1','name2')values('ʵϰ','֤ȯ�о�Э��','����ѧ���о���')");
		db.execSQL("insert into info('factor','name1')values('��Ʊ֤ȯ','֤ȯ�о�Э��')");
		db.execSQL("insert into info('factor','name1')values('ͳ�Ʒ���','�������Э��')");
		db.execSQL("insert into info('factor','name1','name2')values('��ѧ','ǧ����ѧ��','�������Э��')");
		db.execSQL("insert into info('factor','name1')values('˰��','˰���о���')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('ʵ��','��Ṥ��Э��','֤ȯ�о�Э��','������Э��')");
		db.execSQL("insert into info('factor','name1')values('����','����ѧ���о���')");
		db.execSQL("insert into info('factor','name1')values('���','����о�Э��')");
		db.execSQL("insert into info('factor','name1')values('ģ��','��Ҷ���ʹ�ϵѧ��')");
		db.execSQL("insert into info('factor','name1','name2')values('����','��óѧ��','Ӣ��Э��')");
		db.execSQL("insert into info('factor','name1')values('��ѧ','��ѧ�о���')");
		db.execSQL("insert into info('factor','name1')values('����','��������Э��')");
		db.execSQL("insert into info('factor','name1')values('������','ľľ��������')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('����','���������о�Э��','��Ҷ���ʹ�ϵѧ��','��������̸��Э��')");
		db.execSQL("insert into info('factor','name1')values('��̳','������Э��')");
		db.execSQL("insert into info('factor','name1','name2')values('������','������Э��','��Ṥ��Э��')");
		db.execSQL("insert into info('factor','name1','name2')values('���´�ҵ','���Ǵ��¾��ֲ�','KAB��ҵ���ֲ�')");
		db.execSQL("insert into info('factor','name1')values('���Ļ�','�����о�Э��')");
		db.execSQL("insert into info('factor','name1')values('̸��','��������̸��Э��')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('����','��������̸��Э��','��������Э��','����Ӣ����')");
		db.execSQL("insert into info('factor','name1')values('�ƾ�����','��ܿ��')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('����','���ɸ質��','������ҡ������','������')");
		db.execSQL("insert into info('factor','name1','name2')values('��Ӱ','Our�����','��Ӱ��')");
		db.execSQL("insert into info('factor','name1')values('����','HR�о�Э��')");
		db.execSQL("insert into info('factor','name1')values('�ֹ�','����')");
		db.execSQL("insert into info('factor','name1','name2')values('����','��Ӱ������','�����о�Э��')");
		db.execSQL("insert into info('factor','name1')values('����','������')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('�鷨�滭','��ī�黭��','������','��Ĭ������')");
		db.execSQL("insert into info('factor','name1')values('���顢С˵','Silence������')");
		db.execSQL("insert into info('factor','name1')values('����','����������')");
		db.execSQL("insert into info('factor','name1')values('����','������')");
		db.execSQL("insert into info('factor','name1','name2','name3')values('ʱ��','������','δ������','Shine-meģ����')");
		db.execSQL("insert into info('factor','name1','name2','name3','name4','name5','name6')values('����־Ը','�ഺ��˿��',"
				+ "'���һ���Э��','У�ѹ���־Ը��Э��','��ƽ��Э��','��Ṥ��Э��','�³�����ǿ��')");
		db.execSQL("insert into info('factor','name1')values('У��','У�ѹ���־Ը��Э��')");
		db.execSQL("insert into info('factor','name1')values('����','������������')");
		db.execSQL("insert into info('factor','name1')values('����','���һ���Э��')");
		db.execSQL("insert into info('factor','name1')values('��Ϸ','BGC����������')");
		db.execSQL("insert into info('factor','name1')values('��ѧ','������ѧ��')");
		db.execSQL("insert into info('factor','name1','name2')values('�赸','δ������','515��������')");
		db.execSQL("insert into info('factor','name1')values('����','������')");
		db.execSQL("insert into info('factor','name1','name2')values('Ӣ��','Ӣ��Э��','����Ӣ����')");
		db.execSQL("insert into info('factor','name1','name2')values('���','��ѧ����Э��','δ֪������')");
		db.execSQL("insert into info('factor','name1','name2','name3','name4','name5','name6','name7','name8')values('�˶�','TR������','�����������',"
				+ "'ά�������˶���','��ë��Э��','�ֻ���','���������','̨����','������')");
		db.execSQL("insert into info('factor','name1','name2')values('����','���������','ľľ��������')");
		

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
