
public class MethodTest implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub

	}

	// ����ֵ����������ظ�ʹ�õĴ���ִ�н����󷵻ظ������ߵĽ��
	// ����������������ظ�ʹ�õĴ����ʱ��ʹ��ʲô����
	// �������������������ʱ����Ҫ���ݸ�����ε���Ϣ
	// �����壺�����ظ�ʹ�õĴ��룬����ʹ�ô��ݹ����Ĳ����������㣬���Ұ�����Ľ���Է���ֵ����ʽ����
	static int add(int i1, int i2)
	{
		if (i2 > i1)
		{
			return i2 - i1;
		} else
		{
			return i2 + i1;
		}
	}

	static int max(int[] nums)
	{
		int max = nums[0];
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] > max)
			{
				max = nums[i];
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int j1 = add(5, 6);// j1�͵õ�����ε���add�����ķ���ֵ
		int j2 = add(6, 5);// ������ִ�з����������õ�����ֵ
		//����Ĵ��� ���� ���ε���֮�䣬�ڲ������Ǹ����
		System.out.println(j1);
		System.out.println(j2);
		int i3 = 888;
		int i4 =add(i3, j1);
		System.out.println(i4);
		int i1 =6;
		int i2 = 5;
		int w = add(i2, i1);//add����������main�ⲿ��ֻ����main�С����á���a�������ܵ���b�����ڲ��ľֲ�������
		System.out.println(w); //�����1����Ϊ���������Ĳ����붨��ı���û�й�ϵ

		int[] nums1 ={ 4, 6, 9, 121, 52, 1 };
		int max = max(nums1);
		System.out.println(max);
	}

}
