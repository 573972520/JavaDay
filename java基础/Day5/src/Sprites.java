import com.rupeng.game.GameCore;

public class Sprites implements Runnable
{

	@Override
	public void run()
	{
		// TODO �Զ����ɵķ������
		/*
		int marioNum = 0;
		GameCore.createSprite(marioNum, "mario");
		GameCore.setSpritePosition(marioNum, 100, 100);
		GameCore.playSpriteAnimate(marioNum, "idle", true);
		*/
		
		int marioNum = 0;
		int marioY = 200;
		int leftX = 110;
		GameCore.createSprite(marioNum, "mario");
		GameCore.setSpritePosition(marioNum, 100, 100);
		GameCore.setSpriteFlipX(marioNum, true);
		GameCore.playSpriteAnimate(marioNum, "walk", true);
		GameCore.pause(200);
	
		GameCore.setSpritePosition(marioNum, leftX, marioY);GameCore.pause(200);
		leftX+=10; marioY+=10;
		GameCore.setSpritePosition(marioNum, leftX, marioY);GameCore.pause(200);
		leftX+=10;marioY+=10;
		GameCore.setSpritePosition(marioNum, leftX, marioY);GameCore.pause(200);
		leftX+=10;marioY+=10;
		GameCore.setSpritePosition(marioNum, leftX, marioY);GameCore.pause(200);
		leftX+=10;marioY+=10;
		GameCore.setSpritePosition(marioNum, leftX, marioY);GameCore.pause(200);
		leftX+=10;marioY+=10;
		GameCore.setSpritePosition(marioNum, leftX, marioY);GameCore.pause(200);
		leftX+=10;marioY+=10;
		GameCore.setSpritePosition(marioNum, leftX, marioY);GameCore.pause(200);
		leftX+=10;marioY+=10;
		GameCore.setSpritePosition(marioNum, leftX, marioY);GameCore.pause(200);
		leftX+=10;marioY+=10;
		GameCore.setSpritePosition(marioNum, leftX, marioY);GameCore.pause(200);
		leftX+=10;marioY+=10;
		GameCore.setSpritePosition(marioNum, leftX, marioY);GameCore.pause(200);
		/*
		GameCore.alert("��X�᷽��");
		GameCore.setSpriteFlipX(marioNum, true);
		GameCore.alert("��Y�᷽��");
		GameCore.setSpriteFlipY(marioNum, true);
		
		GameCore.pause(10000);
		*/
		
	}

	public static void main(String[] args)
	{
		// TODO �Զ����ɵķ������
		GameCore.start(new Sprites());
	}

}
