package test;

import com.rupeng.game.GameCore;

public class Sprites implements Runnable {

	//�����Ա�ѡ��ͼƬ�����ַ�����
	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*
		boolean b =GameCore.confirm("sex");
		int marioNum = 1; //ͳһ����
		System.out.println(b);
		if (b == true) {
			GameCore.createSprite(marioNum, "guizi");
			GameCore.playSpriteAnimate(marioNum, "jump", true);
			GameCore.pause(2000);
			//System.out.println("11");
		}else {
			GameCore.createSprite(marioNum, "bomb");
			GameCore.playSpriteAnimate(marioNum, "fire", true);
			GameCore.pause(2000);
			//GameCore.alert("223");
		}
		*/
		
		
		String s = GameCore.input("", "are you sex?");
		int marioNum = 1;
		System.out.println(s);
		if (s.equals("man")) {     //�ر�ע���ж�String����Ҫʹ��equals() !!!
			GameCore.createSprite(marioNum, "guizi");
			GameCore.playSpriteAnimate(marioNum, "jump", true);
			GameCore.pause(2000);
		}else {
			GameCore.createSprite(marioNum, "bomb");
			GameCore.playSpriteAnimate(marioNum, "fire", true);
			GameCore.pause(2000);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new Sprites());
	}

}
