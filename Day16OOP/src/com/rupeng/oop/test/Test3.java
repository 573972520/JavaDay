package com.rupeng.oop.test;

public class Test3
{

	public static void main(String[] args)
	{
		final int i = Integer.parseInt("142323");
		final String s = "haha";
		final int j;
		j = 6;
		//j = 8;//final����ֻ�ܸ�ֵһ��
		
		// TODO Auto-generated method stub
		earthMan d1 = new earthMan()
		{
			@Override
			public void speak()
			{
				// TODO Auto-generated method stub
				System.out.println("����������"+i+s); //�����ڲ����з����ⲿ�����еľֲ�������ʱ���Ǹ��ֲ�������������final
				//����JDK8��ʼ�Ͳ��ü�final��
			}
		};
		d1.welcome();
	}
}		
				/*
				 * //�����������֪����ʵԭ�����������������������з����˾ֲ������������������ж����˳�Ա�������вι��캯�����ֲ��������Ե��ù��캯���Ĳ�������ʽ���ݵ�
				class Test3$1 extends earthMan
				{
					int val$i;
					String val$s;
					public Test3$1(int paramInt, String paramString)
					{
						// TODO Auto-generated constructor stub
						this.val$i = paramInt;
						this.val$s = paramString;
					}
					public void Speak()
					{
						System.out.println("����������"+this.val$i+this.val$s);
					}
				}
				earthMan d1 = new Test3$1(i,s)
				*/
			
		
		
	
		
	

