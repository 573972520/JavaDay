
public class ArrayTest2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//�ߵ�����
		int[] nums = {1,2,5,7,8};
		for (int i = 0; i < nums.length/2; i++) {
			int temp = nums[i];
			int temp1 = nums[nums.length-i-1];//��i���͵�length-i-1������
			nums[i] = temp1;
			nums[nums.length-i-1] = temp;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		*/
		
		/*
		//�����е����ֵ
		int[] numMax = {5,6,99,1,10};
		int max = numMax[0];  //�����ʼ�����ֵΪ�����е�һ��Ԫ��
		for (int i = 1; i < numMax.length; i++) {  //ע������ı����ӱ��Ϊ1��Ԫ�ؿ�ʼ����
			int n = numMax[i];
			if (max < numMax[i]) {
				System.out.println("n="+n+"����max="+max+"����max��ֵΪn");
				max = numMax[i];  //�������ֵ
				System.out.println("max�����"+max);
			}
			else {
				System.out.println("n="+n+"������max="+max+"��max��ֵ����Ϊ"+max);
			}
		}
		System.out.println("���ֵΪ"+max);
		*/
		
		
		//�����е���Сֵ
		int[] numMin = {2,3,-8,1,0};
		int min = numMin[0];
		for (int i = 1; i < numMin.length; i++) {
			if (min > numMin[i]) {
				min = numMin[i];
			}
		}
		System.out.println("��СֵΪ"+min);
	}

}
