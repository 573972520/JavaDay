import com.rupeng.game.GameCore;

public class Main5 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*
		//��ϰ������18����ʾһ��ͼƬ������
		int age = Integer.parseInt(GameCore.input("","��������")); //ע��Ŷ��������Ҫת����int���͵�
		int picNum = 0;
		GameCore.createImage(picNum);
		GameCore.setImagePosition(picNum, 100, 100);
		GameCore.setImageSource(picNum, age>=18?"1.jpg":"2.jpg");
		GameCore.playSound(age>=18?"1.mp3":"2.mp3", true);
		GameCore.pause(50000);
		*/
		//��ϰ��С��10����ʾ5ͼƬ�����ڵ���10��С��18����ʾ2ͼƬ�����ڵ���18��С��80����ʾ4ͼƬ�����ڵ���80����ʾ3ͼƬ 
		int age = Integer.parseInt(GameCore.input("","��������"));
		int picNum = 0;
		GameCore.createImage(picNum);
		GameCore.setImagePosition(picNum, 100, 100);
		GameCore.setImageSource(picNum, age>=18?(age>=80?"3.png":"4.png"):(age>=10)?"2.jpg":"5.jpg");
		GameCore.pause(50000);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new Main5()); 
	}

}
