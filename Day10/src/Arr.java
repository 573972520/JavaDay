import com.rupeng.game.GameCore;

public class Arr implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		//������ʾ�������������
		String[] str = {"rupeng","�ٶ�","����","tentent"};
		int i = 0;
		boolean isLeftToRight = true;
		while (true) {
			String name = str[i];
			GameCore.alert(name);
			if (isLeftToRight&&i==str.length-1) {
				isLeftToRight = false;
			}
			else if (!isLeftToRight&&i==0) {
				isLeftToRight =true;
			}
			
			if (isLeftToRight) {
				i++;
			}
			else {
				i--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCore.start(new Arr());
		/*
		int[] arr = new int[5]; //int����Ԫ�ص�Ĭ��ֵ����0
		arr[0] = 8;//��ֵ
		int i1 = arr[0];
		int i2 = arr[1];
		System.out.println(arr[0]);
		System.out.println(i1);
		System.out.println(i2);
		
		int[] arr2 = {1,2,3}; //��������Ϊ3��int����
		int i3 = arr2[0];
		System.out.println(i3);
		arr2[2] = 999;
		System.out.println(arr2[2]);
		*/
		/*
		String[] arr2 = {"ali","JD","JD","taobao",""} ;
		int arrLength = arr2.length;
		System.out.println(arrLength); //��ȡ���鳤��
		for ( i = 0; i < arr2.length; i++) {
			String s = arr2[i];
			System.out.println(s);
		}
		String[] arr = new String[2]; //String���͵������ʼ��Ϊnull
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			System.out.println(s);
		}
		*/
		/*
		int[] arr = new int[5]; //���ֳ�������֮�����ٸı�
		arr[6] = 0;            //�����������鳤�ȣ�����ȴ������java.lang.ArrayIndexOutOfBoundsException: 6��
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.println(j);
		}
		*/
		
		/*
		//��string���͵�����ת����int���͵�����(����ʦ�Ķ���)
		String[] strs = {"123","21","45","466"};
		int[] arr = new int[4]; //ע�⣺���õ�д�����Ը�Ϊint[] arr = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {  
			String s1 = strs[i];
			int intValue = Integer.parseInt(s1); //����ı�����Ҫ�����壨һ�㲻Ҫ��i,j,k,l,m,n,a,b����Щû����������֣�
			arr[i] = intValue;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//System.out.println(arr[2]); //���Ը�Ϊ�����Ĵ��루����int�������飩
		*/
		
	
		/*
		//���ŷָ����ַ���
		String[] strs = {"����","����","��Ѷ","��"};
		String s1 = "";
		for (int i = 0; i < strs.length-1; i++) {
			s1 += strs[i]+",";
		}
		for (int i = strs.length-1; i < strs.length; i++) {
			s1 += strs[i];
		}
		//s1 = s1+strs[strs.length-1]; //���һ������Ҫ��Ӷ��ţ�������ĵڶ���forѭ��һ����Ч����
		System.out.println(s1);
		*/
		
		
		/*
		//�����Ӧ���
		String[] name = {"����","С��","����"};
		boolean[] scores = {true,false,true};
		String[] results = new String[scores.length];
		for (int i = 0; i < name.length; i++) {
			boolean score = scores[i]; //λ����һһ��Ӧ�ģ�������ȡ��ǰ�����ֶ��ڳɼ�
			results[i] = name[i]+(score?"�ϸ�":"���ϸ�");
		}
		
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
		*/
		
		
		/*
		//�����������һ��������
		int[] num1 = {3,5,8};
		int[] num2 = {88,9,25,66,77};
		int[] newNum = new int[num1.length+num2.length];
		for (int i = 0; i < num1.length; i++) {
			int numValue = num1[i];
			newNum[i] = numValue;
		}
		for (int i = 0; i < num2.length; i++) {
			int numValue = num2[i];
			newNum[i+num1.length] = numValue; //ע��������Ҫ����ǰ���������ֵ
		}
		for (int i = 0; i < newNum.length; i++) {
			System.out.println(newNum[i]);
		}
		*/
		
		/*
		//ѭ���������������
		String[] str = {"rupeng","�ٶ�","����","tentent"};
		for(;;){
			for (int i = 0; i < str.length; i++) {
				String strValue = str[i];
				System.out.println(strValue);
			}
		}
		*/
		
	
		
	}

}
