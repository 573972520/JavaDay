package test;


import com.rupeng.game.GameCore;

public class ForTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//�����������о��飬ÿ������80��X�ᣬ��8������
//		for (int i = 0; i < 600; i+=80) {
//				GameCore.createSprite(i, "mario"); //������Ҫע�⾫��ı�Ų��̶ܹ�����Ϊһ����Ź̶����������ľ���Ͳ�����ʾ������
//												  //��Ϊ��һ������ı����ǰ��һ������ı���ظ��ˡ�
//				GameCore.setSpritePosition(i, i, 200); //����������ʹ�ñ���i
//				GameCore.setSpriteFlipX(i, true);
//				GameCore.playSpriteAnimate(i, "jump", true);
//				GameCore.pause(100);
//		}
		//�����������о��飬ÿ������77��Y�ᣬ������ӵ�500
//		for (int i = 0; i <= 500; i+=77) {
//			GameCore.createSprite(i, "mario");
//			GameCore.setSpritePosition(i, 100, i); 
//			GameCore.setSpriteFlipX(i, true);
//			GameCore.playSpriteAnimate(i, "jump", true);
//			GameCore.pause(100);
//		}
		//��ԭ����500,500����9������
//		for (int i = 0; i <= 500; i+=55.4) {
//			GameCore.createSprite(i, "mario");
//			GameCore.setSpritePosition(i, i, i); 
//			GameCore.setSpriteFlipX(i, true);
//			GameCore.playSpriteAnimate(i, "jump", true);
//			GameCore.pause(100);
//		}
		//����������
//		int spritesNum = 0;
//		GameCore.setGameSize(900, 800);
//		GameCore.createSprite(spritesNum, "mario");
//		GameCore.setSpritePosition(spritesNum, 100, 0); 
//		GameCore.setSpriteFlipX(spritesNum, true);
//		GameCore.playSpriteAnimate(spritesNum, "walk", true);
//		for (int i = 0; i <= 500; i+=1) {
//			GameCore.setSpritePosition(spritesNum, 100, i); 
//			GameCore.pause(20);
//		}
//		GameCore.pause(50200);
		//����������
//		int spritesNum = 0;
//		GameCore.setGameSize(900, 800);
//		GameCore.createSprite(spritesNum, "mario");
//		GameCore.setSpritePosition(spritesNum, 500, 100); 
//		GameCore.playSpriteAnimate(spritesNum, "walk", true);
//		for (int i = 500; i > 0; i-=1) {
//			GameCore.setSpritePosition(spritesNum, i, 100); 
//			GameCore.pause(20);
//		}
		//��������
//		int spritesNum = 0;
//		GameCore.setGameSize(900, 800);
//		GameCore.createSprite(spritesNum, "mario");
//		GameCore.setSpritePosition(spritesNum, 100, 0); 
//		GameCore.setSpriteFlipX(spritesNum, true);
//		GameCore.playSpriteAnimate(spritesNum, "walk", true);
//		for (int i = 0; i <= 200; i++) {
//			GameCore.setSpritePosition(spritesNum, i, 0); 
//			GameCore.pause(10);
//		}
//		for (int i = 0; i <= 200; i++) {
//			GameCore.setSpritePosition(spritesNum, 200, i); 
//			GameCore.pause(10);
//		}
//		GameCore.setSpriteFlipY(spritesNum, true);
//		for (int i = 200; i > 0; i--) {
//			GameCore.setSpritePosition(spritesNum, i, 200); 
//			GameCore.pause(10);
//		}
//		for (int i = 200; i > 0; i--) {
//			GameCore.setSpritePosition(spritesNum, 0, i); 
//			GameCore.pause(10);
//		}
		
		//�������֣�Ȼ��ִ�ж���
		int inputNum =Integer.parseInt(GameCore.input("", "����һ��������"));
			if (inputNum > 0) {
				int spritesNum = 0;
				GameCore.createSprite(spritesNum, "mario");
				GameCore.setSpritePosition(spritesNum, 0, 10);
				GameCore.playSpriteAnimate(spritesNum, "walk", true);
					for (int i = 0; i <= inputNum; i++) {
						GameCore.setSpritePosition(spritesNum, i, 10);
						GameCore.pause(10);
					}
			}
			else {
				GameCore.alert("Error");
			}
		GameCore.pause(10000);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new ForTest());
	}

}
