package test;

import com.rupeng.game.GameCore;

public class Switch implements Runnable {

	@Override
	
	public void run() {
		// TODO Auto-generated method stub
		/*
		int i = 1;
		switch (i) { //�����iΪ���ʽ�����ʽ�����Ϳ�����byte��short��int��char��JDK5֮�󻹿�����ö�����ͣ�JDK7֮�󻹿�����string
		case 6:
			System.out.println("F");
			break; //  case������дһ��break
			
		case 2:
			System.out.println("E");
			break;
			
		default:
			System.out.println("Error");
			break;
		}
		*/
	
		int i = 5;
		switch (i) {
		case 3:
		case 4:
		case 5:
			System.out.println("����");
			break;    //��û��дbreak����ô�����һֱִ�е����е�case֮�󣬻���������һ��break
					 //break���������case�����ж��ˡ�
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
			
		case 10:
		case 9:
		case 11:
			System.out.println("����");
			break;
			
		case 12:
		case 1:
		case 2:
			System.out.println("����");
			break;
			
		default:
			System.out.println("Error");
			break;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new Switch());
	}

}
