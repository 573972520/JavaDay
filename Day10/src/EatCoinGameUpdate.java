import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
import com.rupeng.game.GameCore;

public class EatCoinGameUpdate implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int SpritesNum = 500;//mario���
		int[] nums = {10,20,30,40,50,60,70,80}; //��ұ��
//		int[] xData = {120,500,632,798,146,200,456,1000};
//		int[] yData = {146,598,254,694,123,156,755,198};
		int[] xData = new int[10];
		int[] yData = new int[10];
//		for (int i = 0; i < yData.length; i++) {
//			int randX = GameCore.rand(2, 1000);
//			int randY = GameCore.rand(3, 500);
//		}
		//����Ƿ����ˣ�ʹ��boolean����
		boolean[] coinIsData = new boolean[8];//boolean����ÿ��Ԫ�ص�Ĭ��ֵ��false
		
		GameCore.loadBgView("2.jpg");
		GameCore.setGameSize(1280, 800);
		GameCore.createSprite(SpritesNum, "mario");
		GameCore.setSpritePosition(SpritesNum, 10, 10);
		GameCore.playSpriteAnimate(SpritesNum, "walk", true);
		//��ȡ��Ϸ���ڴ�С
		Dimension gameSize = GameCore.getGameSize();
		int gameWidth = gameSize.width;
		int gameHeiht = gameSize.height;
		//��ȡmario�Ĵ�С
		Dimension spriteSize = GameCore.getSpriteSize(SpritesNum);
		int spriteWidth = spriteSize.width;
		int spriteHeight = spriteSize.height;
		
		int coinImgNum = 2;//����ͼƬ���
		GameCore.createImage(coinImgNum, "0.png");
		GameCore.setImagePosition(coinImgNum, 1100, 50);
		int scoreNum = 0;//�����ı����
		GameCore.createText(scoreNum, "X0");
		GameCore.setTextFontSize(scoreNum, 30);
		GameCore.setTextColor(scoreNum, Color.BLACK);
		GameCore.setTextPosition(scoreNum, 1150, 50);
		int[] bombPosX = {200,500,400};//ը��X��
		int[] bombPosY = {300,333,409};//ը��Y��
		int[] bombNum = {34,56,89};//ը�����
		int leftTimeNum = 33;//ʣ��ʱ���ʱ��
		GameCore.createText(leftTimeNum, "��ʣ40��");
		GameCore.setTextPosition(leftTimeNum, 900, 20);
		GameCore.setTextFontSize(leftTimeNum, 30);
		GameCore.setTextColor(leftTimeNum, Color.red);
		int gameOverTextNum = 3;
		
		long startMS = System.currentTimeMillis();//�õ���Ϸ��ʼǰ�ĺ�����
		//8ö��ҵ�λ��
		for (int i = 0; i < nums.length; i++) {
			int randX = GameCore.rand(2, 1000);
			int randY = GameCore.rand(3, 500);
			int coinNum = nums[i];
			GameCore.createSprite(coinNum, "coin");
			GameCore.setSpritePosition(coinNum, randX, randY);
			GameCore.playSpriteAnimate(coinNum, "rotate", true);
		}
		
		//ը��λ��
		for (int i = 0; i < bombNum.length; i++) {
			int x = bombPosX[i];
			int y = bombPosY[i];
			GameCore.createSprite(bombNum[i], "bomb");
			GameCore.setSpritePosition(bombNum[i], x, y);
			GameCore.playSpriteAnimate(bombNum[i], "laser", true);
		}
	
		//����mario�ƶ�
		for(;;){
			int kc = GameCore.getPressedKeyCode();
			Point pos = GameCore.getSpritePosition(SpritesNum);
			if (kc == KeyEvent.VK_RIGHT) {
				if (pos.x < gameWidth-spriteWidth) {
					GameCore.setSpriteFlipX(SpritesNum, true);
					GameCore.setSpritePosition(SpritesNum, pos.x+1, pos.y);
				}
			}
			else if (kc == KeyEvent.VK_LEFT) {
				if (pos.x > 0) {
					GameCore.setSpriteFlipX(SpritesNum, false);
					GameCore.setSpritePosition(SpritesNum, pos.x-1, pos.y);
				}
				
			}
			else if (kc == KeyEvent.VK_UP) {
				if (pos.y > 0) {
					GameCore.setSpritePosition(SpritesNum, pos.x, pos.y-1);
				}
			}
			else if (kc == KeyEvent.VK_DOWN) {
				if (pos.y < gameHeiht-spriteHeight-30) {
					GameCore.setSpritePosition(SpritesNum, pos.x, pos.y+1);
				}
			}
			
			for (int i = 0; i < nums.length; i++) {
				int coinNum = nums[i];   
				boolean coinIsDead = coinIsData[i];//������ж���ʲô���壬ɾ����δ�����Ϸ���ǻ��������У�
				if (coinIsDead) {                  //������ж���ʲô���壬ɾ����δ�����Ϸ���ǻ��������У�
					continue;//�������Ѿ����Ե��ˣ��������ж���       
				}                                      
				Dimension coinSize = GameCore.getSpriteSize(coinNum);
				int coinWidth = coinSize.width;
				int coinHeight = coinSize.height;
				int coinX = xData[i];
				int coinY = yData[i];
				//���������ĵ�����
				int coinCenterX = coinX+coinWidth/2;
				int coinCenterY = coinY+coinHeight/2;
				//������������ĵ�����
				int marioCenterX = pos.x+spriteWidth/2;
				int marioCenterY = pos.y+spriteHeight/2;
				double distanceCoinMario = Math.pow((marioCenterX-coinCenterX)*(marioCenterX-coinCenterX)+(marioCenterY-coinCenterY)*(marioCenterY-coinCenterY), 0.5);
				if (distanceCoinMario < 15) {
					GameCore.hideSprite(coinNum);
					coinIsData[i] = true;//����������������Ӧ�ı�Ϊtrue
					//��һ�£��Ѿ����˶��ٽ����
					int eatCoinCount = 0;//���Ե��Ľ�ҵļ�����
					for (int j = 0; j < coinIsData.length; j++) {
						//��һ���ж��ٽ�ұ�����
						if (coinIsData[j] == true) {
							eatCoinCount++;
						}
					}
					GameCore.setText(scoreNum, "X"+eatCoinCount);
				}
			}
			
			for (int i = 0; i < bombNum.length; i++) {
				                                  
				Dimension bombSize = GameCore.getSpriteSize(bombNum[i]);
				int bombWidth = bombSize.width;
				int bombHeight = bombSize.height;
				int bombX = bombPosX[i];
				int bombY = bombPosY[i];
				//����������ĵ�����
				int bombCenterX = bombX+bombWidth/2;
				int bombCenterY = bombY+bombHeight/2;
				//������������ĵ�����
				int marioCenterX = pos.x+spriteWidth/2;
				int marioCenterY = pos.y+spriteHeight/2;
				double distanceCoinMario = Math.pow((marioCenterX-bombCenterX)*(marioCenterX-bombCenterX)+(marioCenterY-bombCenterY)*(marioCenterY-bombCenterY), 0.5);
				if (distanceCoinMario < 15) {
					GameCore.createText(bombNum[i], "Game Over");
					GameCore.setTextFontSize(bombNum[i], 60);
					GameCore.setTextPosition(bombNum[i], 600, 350);
					GameCore.setTextColor(bombNum[i], Color.YELLOW);
					GameCore.pause(10000);
			 
			}
			
			long currentMS = System.currentTimeMillis();
			long leftSeconds = 12-(currentMS-startMS)/1000;
			GameCore.setText(leftTimeNum, "��ʣ"+leftSeconds+"��");
			if (leftSeconds > 0&&leftSeconds <=10) {
				GameCore.setTextColor(leftTimeNum, leftSeconds%2==0?Color.RED:Color.black);
				}
			else if (leftSeconds <= 0) {
				GameCore.createText(gameOverTextNum, "Game Over");
				GameCore.setTextFontSize(gameOverTextNum, 60);
				GameCore.setTextColor(gameOverTextNum, Color.YELLOW);
				GameCore.setTextPosition(gameOverTextNum, 550, 300);
				GameCore.pause(5000);
				GameCore.exit();
			}
			
			GameCore.pause(0);
		
				}
			}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new EatCoinGameUpdate());
	}

}

