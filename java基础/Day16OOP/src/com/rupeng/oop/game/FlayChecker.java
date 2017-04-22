package com.rupeng.oop.game;

public class FlayChecker implements Flyable
{
	private Flyable dest;
	public FlayChecker (Flyable dest)
	{
		this.dest = dest;
	}
	@Override
	public void fly()
	{
		// TODO Auto-generated method stub
		System.out.println("����ǰ����Ƿ�OK");
		if (System.currentTimeMillis()%2 == 0)
		{
			this.dest.fly();
		}
		else {
			System.out.println("���������������");
		}
	}

}
