
public class TwoDimensionalArray implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//��ά�����������������
		int[][] nums = new int[5][3];  //������ά���飬5��3��
		nums[0][0] = 3;
		nums[3][2] = 5;
		nums[1][2] = 6;
		nums[4][1] = 8;
		for (int i = 0; i < nums.length; i++) {            //һ���ж�����
			for (int j = 0; j < nums[i].length; j++) {    //��һ���ж�����
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		int[][] num = {{1,5,9},{5,6,7,100,0},{11,55,99,78,624,12,32,56}}; // ÿһ�е��������Բ�һ��
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
