import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
import com.rupeng.game.GameCore;

public class EatCoinGame implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int SpritesNum = 500;//mario编号
		int[] nums = {10,20,30,40,50,60,70,80};
		int[] xData = {120,500,632,798,146,200,456,1000};
		int[] yData = {146,598,254,694,123,156,755,198};
		//金币是否死了，使用boolean数组
		boolean[] coinIsData = new boolean[8];//boolean数组每个元素的默认值是false
		
		GameCore.loadBgView("2.jpg");
		GameCore.setGameSize(1280, 800);
		GameCore.createSprite(SpritesNum, "mario");
		GameCore.setSpritePosition(SpritesNum, 10, 10);
		GameCore.playSpriteAnimate(SpritesNum, "walk", true);
		Dimension gameSize = GameCore.getGameSize();
		int gameWidth = gameSize.width;
		int gameHeiht = gameSize.height;
		Dimension spriteSize = GameCore.getSpriteSize(SpritesNum);
		int spriteWidth = spriteSize.width;
		int spriteHeight = spriteSize.height;
		
		int coinImgNum = 0;
		GameCore.createImage(coinImgNum);
		GameCore.createImage(coinImgNum, "0.png");
		GameCore.setImagePosition(coinImgNum, 1100, 100);
		int scoreNum = 0;
		GameCore.createText(scoreNum, "X");
		GameCore.setTextPosition(scoreNum, 1150, 100);
		//金币位置
		for (int i = 0; i < nums.length; i++) {
			int coinNum = nums[i];
			GameCore.createSprite(coinNum, "coin");
			GameCore.setSpritePosition(coinNum, xData[i], yData[i]);
			GameCore.playSpriteAnimate(coinNum, "rotate", true);
		}
		
		//控制mario移动
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
			for (int i = 0; i < coinIsData.length; i++) {
				Dimension coinSize = GameCore.getSpriteSize(i);
				int coinWidth = coinSize.width;
				int coinHeight = coinSize.height;
				double dis = Math.pow((spriteWidth-coinWidth)*(spriteWidth-coinWidth)+(spriteHeight-coinHeight)*(spriteHeight-coinHeight), 0.5);
				if (dis < 20) {
					coinIsData[i] = true;
					GameCore.hideSprite(nums[i]);
				}
				else {
					coinIsData[i] = false;
					GameCore.showSprite(nums[i]);
				}
			}
			GameCore.pause(10);
		
			}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new EatCoinGame());
	}

}
