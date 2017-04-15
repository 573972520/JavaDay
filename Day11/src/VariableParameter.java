
public class VariableParameter implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub

	}
	/**
	 * ����һ������ĺ�
	 * @param nums Ҫ����Ľ��
	 * @return ����ĺ�
	 */
	static int sum (int[] nums)
	{
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
		{
			sum = sum +nums[i];
		}
		return sum;
	}
	/**
	 * ���򵥵�����֮�ͷ����������������д��int...����ô�������Ὣ�����Ĳ����ϲ���һ�����鴫�ݸ�����
	 * @param nums �����int[] nums
	 * @return ����ĺ�
	 */
	
	//��sum1�ķ������ָĳ�sum�ǲ������صģ���Ϊ�������ƻ���һ����
	static int sum1 (int... nums) //int[] nums���������Ĳ�������һ�����飩
	{
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
		{
			sum = sum +nums[i];
		}
		return sum;
	}
	/**
	 * 
	 * @param age ����
	 * @param fatherName ���׵�����
	 * @param names �ɱ䳤�Ȳ���������������
	 */
	static void test (int age,String fatherName,String... names)//ע��ɱ䳤�Ȳ�����String... names������������
	{
		System.out.println("fatherName is:"+fatherName+",age is:"+age);
		for (int i = 0; i < names.length; i++)
		{
			System.out.println("��"+(i+1)+"�����ӵ�������:"+names[i]);
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int s1 = sum(new int[] {3,5,99});
		System.out.println(s1);
		//sum(3,5,88); //�����ǲ��е�
		int s2 = sum1(3,5,88,5);
		System.out.println(s2);
		test(66,"carl", "hh","gg","rr");
	}

}
