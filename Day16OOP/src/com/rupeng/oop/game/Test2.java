package com.rupeng.oop.game;

public class Test2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		earthMan d1 = new Chinese();
		d1.welcome();
		
		earthMan d2 = new earthMan()
		{
			
			@Override
			public void speak()
			{
				// TODO Auto-generated method stub
				System.out.println("我是匿名人");
			}
		};
		d2.welcome();
		
	}

}

abstract class earthMan
{
	public abstract void speak();
	public void dance()
	{
		System.out.println("dance!!");
	}
	public void welcome()
	{
		speak();
		dance();
		speak();
	}
}

class Chinese extends earthMan
{
	@Override
	public void speak()
	{
		// TODO Auto-generated method stub
		System.out.println("我是中国人");
	}
}