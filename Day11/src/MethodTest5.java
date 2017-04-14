import java.awt.Point;

import com.rupeng.game.GameCore;

public class MethodTest5 implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		int marioNum = 0;
		GameCore.createSprite(marioNum, "mario");
		GameCore.setSpritePosition(marioNum, 100, 200);
		GameCore.playSpriteAnimate(marioNum, "walk", true);
		int girlNum = 1;
		GameCore.createSprite(girlNum, "girl");
		GameCore.setSpritePosition(girlNum, 200, 100);
		GameCore.playSpriteAnimate(girlNum, "walk", true);
		loading(marioNum, 300,true);
		moveSpritesRectangle(marioNum, 100, 200,true);
		moveSpritesRectangle(girlNum, 200, 200,false);
		for (int i = 0; i < 100; i++)
		{
			moveSpritesAnyDirection(marioNum, 1, 2);
			moveSpritesAnyDirection(marioNum, 4, 2);
			GameCore.pause(10);
		}
		for (int i = 0; i < 100; i++)
		{
			moveSpritesAnyDirection(marioNum, 3, 2);
			GameCore.pause(10);
		}
		
		while (true)
		{
			GameCore.pause(1);
		}
	}

//������һ����������ε��á��������ˡ����ô��롱������
//���ڵ�������˵��Ҳ���ù��ķ����ڲ�����ô��ʵ�ֵģ�������װ���ڲ���ϸ��
	// ���������ƶ�һ������
	static void moveSpritesRight(int spritesNum)
	{
		Point pos = GameCore.getSpritePosition(spritesNum);
		int x = pos.x;
		int y = pos.y;
		x++;
		GameCore.setSpriteFlipX(spritesNum, true);
		GameCore.setSpritePosition(spritesNum, x, y);
	}

	// ѭ�������������ƶ����飨����ָ���ƶ�����
	static void moveSprites(int spritesNum)
	{
		Point pos = GameCore.getSpritePosition(spritesNum);
		int x = pos.x;
		int y = pos.y;

		for (int i = 0; i < 200; i++)
		{
			GameCore.setSpriteFlipX(spritesNum, true);
			GameCore.setSpritePosition(spritesNum, x, y);
			x = x+2 ;
		}
		for (int i = 0; i < 200; i++)
		{
			GameCore.setSpritePosition(spritesNum, x, y);
			y++;
		}
		for (int i = 0; i < 200; i++)
		{
			GameCore.setSpriteFlipX(spritesNum, false);
			GameCore.setSpritePosition(spritesNum, x, y);
			x= x-2;
		}
		for (int i = 0; i < 200; i++)
		{
			GameCore.setSpritePosition(spritesNum, x, y);
			y--;
		}
	}

	// ָ��������ƶ�����
	static void moveSpritesAnyDirection(int spritesNum, int direction, int nPixel)
	//�����������ֱ��Ǿ���ı�ţ�ָ���ƶ��ķ������ƶ��ľ���
	{
		Point pos = GameCore.getSpritePosition(spritesNum);
		int x = pos.x;
		int y = pos.y;
		if (direction == 1) // ����
		{
			y -= nPixel;
			GameCore.setSpritePosition(spritesNum, x, y);
		} else if (direction == 2)// ����
		{
			y += nPixel;
			GameCore.setSpritePosition(spritesNum, x, y);
		} else if (direction == 3)// ����
		{
			x -= nPixel;
			GameCore.setSpritePosition(spritesNum, x, y);
		} else if (direction == 4)// ����
		{
			x += nPixel;
			GameCore.setSpritePosition(spritesNum, x, y);
		} else
		{
			System.err.println("direction is error!");
		}
	}
	
	//ʹ�����߾���(Ƕ����moveSpritesAnyDirection���������)
	static void moveSpritesRectangle(int spritesNum,int width,int height,boolean isFlipX)
	//����Ϊ�������ţ�X�����ߵľ��룬Y�����ߵľ���
	{
		//RIGHT
		for (int i = 0; i < width; i++)
		{
			GameCore.setSpriteFlipX(spritesNum, isFlipX);
			moveSpritesAnyDirection(spritesNum, 4, 1);
			GameCore.pause(10);
		}
		//DOWN
		for (int i = 0; i < height; i++)
		{
			moveSpritesAnyDirection(spritesNum, 2, 1);
			GameCore.pause(10);
		}
		//LEFT
		for (int i = 0; i < width; i++)
		{
			GameCore.setSpriteFlipX(spritesNum, !isFlipX);
			moveSpritesAnyDirection(spritesNum, 3, 1);
			GameCore.pause(10);
		}
		//UP
		for(int i=0;i < height;i++)
		{
			moveSpritesAnyDirection(spritesNum, 1, 1);
			GameCore.pause(10);
		}
	}

	//����ѭ��������
	static void loading (int spritesNum,int loadingWidth,boolean isFlipX)
	{
		while (true)
		{
			for (int i = 0; i < loadingWidth; i++)
			{
				GameCore.setSpriteFlipX(spritesNum, isFlipX);
				moveSpritesAnyDirection(spritesNum, 4, 1);
			}
			for (int i = 0; i < loadingWidth; i++)
			{
				GameCore.setSpriteFlipX(spritesNum, !isFlipX);
				moveSpritesAnyDirection(spritesNum, 3, 1);
			}
		}
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		GameCore.start(new MethodTest5());
	}

}
