import java.awt.Color;

import com.rupeng.game.GameCore;

public class ArrayTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		/*
		//int����ת����String����
		int[] nums = {123,1456,878};
		String[] strs = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			String sValue = Integer.toString(nums[i]);
			strs[i] = sValue;
		}
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		*/
		
		/*
		//�����Ӧ���
		String[] names = {"������","С��","ɢ��"};
		int[] scores = {90,50,70};
		for (int i = 0; i < names.length; i++) {
			String result = names[i];
			System.out.println(result+(scores[i]>80?"��":(scores[i]<60?"������":"����")));
		}
		*/
		
		/*
		//��һ��������ȵ�int������λ��
		int[] num1 = {3,5,8};
		int[] num2 = {5,5,99};
		int[] result = new int[num2.length];
		for (int i = 0; i < num2.length; i++) {
			int num1Value = num1[i];
			int num2Value = num2[i];
			int sum = num1Value+num2Value;
			result[i] = sum;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		*/
		
		/*
		//����ѭ�����һ�������ֵ
		int[] nums = {3,1,9,7,5};
		//����һ
//		for(;;){
//			for (int i = 0; i < nums.length; i++) {
//				int j = nums[nums.length-1-i];
//				GameCore.alert(j);
//			}
//		}
		//������
		for(;;){
			for (int i = nums.length-1; i>=0; i--) {
				int j = nums[i];
				GameCore.alert(j);
			}
		}
		*/
		
		/*
		//�޺��Ч��������
		String[] names = {"12","sarf","df","asd"};
		for (int j = 0; j < names.length; j++) {
			String name = names[j];
			GameCore.createText(j, name);
			GameCore.setTextPosition(j, 200, j*100);
		}
		for (int i = 0; i < names.length; i++) {
			//�ѳ��˵�ǰ��Text֮���Txet��ɫ��ɺ�ɫ
			for (int j = 0; j < names.length; j++) {
				if (j != i) {
					GameCore.setTextColor(j, Color.BLACK);
				}
			}
			//�ѵ�ǰ��Text��ɺ�ɫ
			GameCore.setTextColor(i, Color.RED);
			if (i == names.length-1) { //���鳤�ȼ�ȥ1�����±�����ֵ 
				i = -1; //��ͷ��ʼ  ��������Ϊ-1����Ϊ���������forѭ����i���1������������ʹi����0���Ӷ�ʹ֮���¿�ʼ
			}
			GameCore.pause(500);
		}
		GameCore.pause(10000);
		*/
		
		
		//�޺��Ч��������
		String[] names = {"12","sarf","df","asd"};
		for (int j = 0; j < names.length; j++) {
			String name = names[j];
			GameCore.createText(j, name);
			GameCore.setTextPosition(j, 200, j*100);
		}
		for (int i = names.length-1; i >= 0; i--) {
			//�ѳ��˵�ǰ��Text֮���Txet��ɫ��ɺ�ɫ
			for (int j = 0; j < names.length; j++) {
				if (j != i) {
					GameCore.setTextColor(j, Color.BLACK);
				}
			}
			//�ѵ�ǰ��Text��ɺ�ɫ
			GameCore.setTextColor(i, Color.RED);
			if (i == 0) {
				i = names.length; //��ͷ��ʼ��ʹiֵΪ���鳤�ȣ�Ȼ����������forѭ���м�ȥ1��ʹ֮����±�����ֵ
			}
			GameCore.pause(500);
		}
		GameCore.pause(10000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new ArrayTest());
		
	}

}
