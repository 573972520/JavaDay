package com.rupeng.test.static1;

public class GodTest1
{
	public static void main(String[] args)
	{
		God.getGod().ZhaoYaoDaDi();
		God g1 = God.getGod();
		God g2 = God.getGod();
		System.out.println(g1 == g2); //true ���������Ƿ�ָ��ͬһ������
		
//		God g3 = new God();  //���û����God�м�private God(){} ��ô���ǿ����½�����һ������//

//		System.out.println(g3 == g1); //false
		
		/*
		����ģʽ��
		Ŀ�ģ�ϵͳ������ֻ��������һ������
		���裺
		1������һ����̬����  private static God instance = new God();
		2���ṩһ������������������static����
		public static God getGod()
		{
			return instance;
		}
		3��Ϊ�˱���������new����Ķ��󣬰���Ĺ��캯���ĳ�private
		private God() //���ã�������������newһ������
		{
			
		}
		������ֻ��ʹ��God.getGod()�õ����Ψһ�Ķ���
		*/
		
	}
}
