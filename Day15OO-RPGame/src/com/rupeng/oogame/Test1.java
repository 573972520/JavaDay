package com.rupeng.oogame;

import com.rupeng.game.GameCore;

public class Test1 implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		GameText txt1 = new GameText();
		txt1.setText("Hello");
		for (int i = 0; i < 300; i++)
		{
			txt1.moveRight();
			GameCore.pause(0);
		}
		
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		GameCore.start(new Test1());
	}

}
