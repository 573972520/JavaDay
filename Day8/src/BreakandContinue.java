import java.util.Scanner;

import com.rupeng.game.GameCore;

public class BreakandContinue implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*
		for (int i = 0; i < 5; i++) {
			System.out.println("i="+i);
			if (i == 2) {
				break; //��ǰ�˳�forѭ��
			}
			System.out.println(i);
		}
		System.out.println("Over");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i="+i);
			if (i == 2) {
				continue; //�ڱ���forѭ���У�ѭ������֮��Ĵ��벻ִ�У��������System.out.println(i)��ִ����
			}
			System.out.println(i);
		}
		System.out.println("Over");
		*/
		
		//int inputNum = Integer.parseInt(GameCore.input("", "input number"));
		

		
		/*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 2) {
					//break; //j==2֮�������ȫ������ʾ
					continue;//ֻ�ǲ���ʾj==2
				}
				System.out.println("i="+i+",j="+j);
			}
		}
		*/
		
		//�����������֣�ֱ������OK��ʱ��ֹͣ���룬Ȼ�󷵻��ܺͣ���BreakandContinueTest��������һ�ַ�����
		int sum = 0;
		for(;;){
			String s = GameCore.input("", "input number");
			if (s.equals("ok")) {
				break;
			}
			else {
				int i = Integer.parseInt(s);
				if (i < 0) {
					continue;
				}
				sum += i;
			}
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new BreakandContinue());
		
		
	}

}
