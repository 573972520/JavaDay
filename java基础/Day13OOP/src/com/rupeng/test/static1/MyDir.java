package com.rupeng.test.static1;

public class MyDir
{
	private MyDir()
	{
		
	}
	//�޶��������ֻ�������ĸ�����
	//����Ϊfinal��Ϊ�˱���ʹ�����ṩMyDir.Up = null�ķ�ʽ�ͷŶ���
	public static final MyDir Up = new MyDir();
	public static final MyDir Down = new MyDir();
	public static final MyDir Left = new MyDir();
	public static final MyDir Right = new MyDir();
}
