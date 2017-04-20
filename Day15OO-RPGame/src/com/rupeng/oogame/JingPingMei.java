package com.rupeng.oogame;

import com.rupeng.game.GameCore;

public class JingPingMei implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		GameSprite mario = new GameSprite("mario");
		mario.setFlipX();
		mario.setPosition(0, 300);
		mario.playAnimate("walk");
		
		GameSprite girl = new GameSprite("girl");
		girl.setPosition(300, 300);
		girl.playAnimate("walk");
		
		String[] words = {"��һ��","�������۹���Ʈ����","<<<=========","���������Ϻ���ף����úϣ�"};
		GameText[] text = new GameText[words.length];//��һ�̣�һ��GameText����û�У�ֻ��5�����ӡ���5��null
		
		for (int i = 0; i < 270; i++)
		{
			mario.moveRight();
		}
		for (int i = 0; i < words.length; i++)
		{
			GameText text2 = new GameText(words[i]);
			text2.setPosition(600+i*50, 100*i);
			text[i] = text2;//�Ѵ����Ķ��������Ŀ���
		}
		
		for (int i = 0; i < 650; i++)
		{
			/*
			for (int j = 0; j < text.length; j++)
			{
				GameText txt = text[j];
				txt.moveLeft();
			}
			*/
			for (GameText text3 : text) //��ǿforѭ��
			{
				text3.moveLeft();
			}
		}
		for (int i = 0; i < 500; i++)
		{
			mario.moveRight();
			girl.moveRight();
		}
		GameCore.pause(34);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		GameCore.start(new JingPingMei());
	}

}
