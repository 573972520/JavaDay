package test;

import com.rupeng.game.GameCore;

public class For implements Runnable {

	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		int marioNum = 0;
		GameCore.createSprite(marioNum, "mario");
		GameCore.setSpritePosition(marioNum, 0, 0);
		GameCore.setSpriteFlipX(marioNum, true);
		GameCore.playSpriteAnimate(marioNum, "walk", true);
		for (int i = 0; i < 50; i++) {
			GameCore.setSpritePosition(marioNum, i, 0);
			System.out.println(i);
			GameCore.pause(50);
		}
		GameCore.pause(1000);
		GameCore.setSpriteFlipY(marioNum, true);
		for (int i = 0; i < 50; i++) {
			GameCore.setSpritePosition(marioNum, 49, i);
			System.out.println(i);
			GameCore.pause(50);
		}
		GameCore.pause(1000);
		
		/*
		//����1��10�ĺ�
		int j = 0;
		for (int i = 1; i <= 10; i++) {
			j = i+j;
		}
		System.out.println(j);
		 //����һ������N������1��N�ĺ�
		int n = Integer.parseInt(GameCore.input("", "input a number"));
		int b = n*(n+1)/2; //ʹ����ѧ��ʽ����1��100�ĺͱ�ʹ��forѭ��Ҫ��
//		for (int i = 0; i <= n; i++) {
//			b+=i;
//		}
		System.out.println(b);
		//��������ʱ
		int txtNum = 0;
		GameCore.createText(txtNum, "");
		GameCore.setTextPosition(txtNum, 100, 100);
		for (int i = 10; i >= 0; i--) {
			GameCore.setText(txtNum, String.valueOf(i));
			GameCore.pause(500);
		}
		*/
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new For());
	}

}
