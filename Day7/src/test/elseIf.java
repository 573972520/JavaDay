package test;

import com.rupeng.game.GameCore;

public class elseIf implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		/*
		String name = GameCore.input("", "love who?");
		int nameNum = 2;
		if (name.equals("1")) {
			GameCore.createImage(nameNum);
			GameCore.setImageSource(nameNum, "1.jpg");
			
		}
		else if (name.equals("2")) {
			GameCore.createImage(nameNum);
			GameCore.setImageSource(nameNum, "2.jpg");
			
		}
		else if (name.equals("3")) {
			GameCore.createImage(nameNum);
			GameCore.setImageSource(nameNum, "3.png");
			
		}
		else if (name.equals("4")) {
			GameCore.createImage(nameNum);
			GameCore.setImageSource(nameNum, "4.png");
			
		}
		else{
			GameCore.createImage(nameNum);
			GameCore.setImageSource(nameNum, "5.jpg");
			
		}
		
		GameCore.pause(10400);
		*/
	
		
		/*
		String season = GameCore.input("", "�����·�");
		int mouth = Integer.parseInt(season);
		if (mouth==1||mouth==2||mouth==12) {
			GameCore.alert("����");
		}
		else if (mouth==3||mouth==4||mouth==5) {
			GameCore.alert("����");
		}
		else if (mouth==6||mouth==7||mouth==8) {
			GameCore.alert("����");
		}
		else if(mouth==9||mouth==10||mouth==11){
			GameCore.alert("����");
		}
		else if (mouth%3 == 0) {
			GameCore.alert("��3����"); //������9ʱ����ô������仹�ǲ���ִ�У���Ϊ���ƥ���������һ����������ô�����else if ������������Ҳ����ִ�У���ѭ�������󵽡�
		}
		else {
			GameCore.alert("error input!");
		}
		*/
		/*
		int i = 0;
		int  j = 900;
		
		if (i > 0) {
			if (j > 0) {
				GameCore.alert("i��������j������");
			}
			else{
				GameCore.alert("i��������j��������");
			}
		}
		else {
			if (j > 900) {
				GameCore.alert("i����������j���������Ҵ���900");
			}
			else {
				GameCore.alert("i����������j����������С�ڵ���900");
			}
		}
		*/
		
		/*
		int age = 0;
		if (age > 18) {
			System.out.println("������");
		}
		else{
			System.out.println("δ������");
		}
		System.out.println(age>18?"������":"δ������");
		*/
		
		/*
		int age = Integer.parseInt(GameCore.input("", "��������"));
		int imgNum = 0;
		GameCore.createImage(imgNum);
		GameCore.setImageSource(imgNum, age>18?"1.jpg":"2.jpg"); //�������if���һ����Ч��
		
//		if (age > 18) {
//			GameCore.createImage(imgNum);
//			GameCore.setImageSource(imgNum, "1.jpg");
//		}
//		else {
//			GameCore.createImage(imgNum);
//			GameCore.setImageSource(imgNum, "2.jpg");
//		}
		
		GameCore.pause(5000);
		*/
		
		
		
		
		
	}

	public static void main(String[] args) {
		// DO Auto-generated method stub
		GameCore.start(new elseIf());
	}

}
