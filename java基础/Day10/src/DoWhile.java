
public class DoWhile implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int x = 0;
		do {
			System.out.println("45");
			x++;
		} while (x < 5);
		
		int j = 800;
		do {
			System.out.println("again"); //��ִ�У����ж�
			j++;
		} while (j < 5);
		*/
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			if (i == 3) {
			//	break;//��ֹѭ��
				continue; //���һֱ����3����Ϊ�����i++��ִ���ˡ����Ի�����ѭ��
			}
			i++;
		}
	}

}
