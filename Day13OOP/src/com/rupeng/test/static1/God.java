package com.rupeng.test.static1;

public class God
{	
	private static God instance = new God();
	public static God getGod()
	{
		return instance;
	}
	private God() //���ã�������������newһ������
	{
		
	}
	public void ZhaoYaoDaDi()
	{
		System.out.println("���ǻ��Ҹ��ģ�");
	}
}
