import java.awt.Point;

import com.rupeng.game.GameCore;

public class OverLoadTest2 implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		int marioNum = 0;
		GameCore.createSprite(marioNum, "mario");
		GameCore.setSpritePosition(marioNum, 100, 100);
		GameCore.playSpriteAnimate(marioNum, "walk", true);
		moveSpriteRight(marioNum, 50);
		while (true)
		{
			GameCore.pause(0);
		}
	}
	/**
	 * �Ѿ��������ƶ�
	 * @param spritesNum Ҫ�ƶ��ľ���ı��
	 * @param stepCount Ҫ�ƶ��Ĳ���
	 */
	static void moveSpriteRight (int spritesNum,int stepCount)
	{
		Point pos = GameCore.getSpritePosition(spritesNum);
		int x = pos.x;
		int y = pos.y;
		for (int i = 0; i < stepCount; i++)
		{
			GameCore.setSpriteFlipX(spritesNum, true);
			x++;
			GameCore.setSpritePosition(spritesNum, x, y);
			GameCore.pause(20);
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		GameCore.start(new OverLoadTest2());
	}

}
