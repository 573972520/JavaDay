import java.lang.management.GarbageCollectorMXBean;

import org.ietf.jgss.GSSManager;

import com.rupeng.game.GameCore;

public class ForTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 /*
		//forѭ��Ƕ��
		for (int i = 0; i < 5; i++) {
			System.out.println("i="+i);
			for (int j = 0; j < 3 ;j++) {
				System.out.println("j="+j);
			}
		}
		*/
		
		/*
		int num = 0;
		for (int y = 0; y <= 900; y+=50) {
			for (int x = 0; x < 500; x+=50) {
				GameCore.createSprite(num, "mario");
				GameCore.setSpritePosition(num, x, y); //�ı�x��y��˳��������г��ֲ�ͬ��˳��
				GameCore.playSpriteAnimate(num, "walk", true);
//				GameCore.createImage(num,"1.jpg");
//				GameCore.setImagePosition(num, x, y);
				num++;
				GameCore.pause(10);
			}
		}
		for(;;){
			
		}
		*/
		
//		for (int fontSize = 5; fontSize < 60; fontSize++) {
//			GameCore.setTextFontSize(fontSize, fontSize);
//			GameCore.pause(20);
//		}
//		for (int fontSize = 0; fontSize >= 60; fontSize--) {
//			GameCore.setTextFontSize(fontSize, fontSize);
//			GameCore.pause(20);
//		}
		int txtNum = 0;
		GameCore.createText(txtNum, "55");
		GameCore.setTextPosition(txtNum, 100, 100);
//		for(;;){ //ʹ֮����ѭ������for����Ƕ��forѭ��
//			for (int fontSize = 10; fontSize <= 100; fontSize++) { //���ֱ��
//				GameCore.setTextFontSize(txtNum, fontSize);
//			}
//			for (int fontSize = 100; fontSize >= 0 ; fontSize--) {//���ֱ�С
//				GameCore.setTextFontSize(txtNum, fontSize);
//			}
//		}
		
		for(;;){
			//�����������ƶ������ƶ���forѭ���У�Ƕ���������С��forѭ��
			for (int moveRight = 100; moveRight <= 200; moveRight+=25) {
				for (int fontSize = 10; fontSize <= 100; fontSize++) {
					GameCore.setTextFontSize(txtNum, fontSize);
			}
				
				for (int fontSize = 100; fontSize >= 0 ; fontSize--) {
					GameCore.setTextFontSize(txtNum, fontSize);
			}
				GameCore.setTextPosition(txtNum, moveRight, 100);
			}
			//�����������ƶ������ƶ���forѭ���У�Ƕ���������С��forѭ��
			for (int moveLeft = 200; moveLeft >= 100; moveLeft-=25) {
				for (int fontSize = 10; fontSize <= 100; fontSize++) {
					GameCore.setTextFontSize(txtNum, fontSize);
			}
				
				for (int fontSize = 100; fontSize >= 0 ; fontSize--) {
					GameCore.setTextFontSize(txtNum, fontSize);
			}
				GameCore.setTextPosition(txtNum, moveLeft, 100);
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new ForTest());
	}

}
