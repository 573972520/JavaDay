
public class MethodTest4
{
	//�������ĺ�
	static int add(int i1,int i2)
	{
		int sum = i1+i2;
		return sum;
	}
	//�����е���Сֵ
	static int min(int[] nums)
	{
		int min = nums[0];
		for (int i = 0; i < nums.length; i++)
		{
			int j = nums[i];
			if (min > j)
			{
				min = j;
			}
		}
		return min;
	}
	//����String�����е�Ԫ�غϳ�һ���ַ���
	static String combineToString(String[] str1,String[] str2)
	{
		String f = "";
		String[] combineStr = new String[str1.length+str2.length];
		for (int i = 0; i < str1.length; i++)
		{
			String s = str1[i];
			combineStr[i] = s;
		}
		for (int i = 0; i < str2.length; i++)
		{
			String s = str2[i];
			combineStr[i+str1.length] = s;
		}
		for (int i = 0; i < combineStr.length; i++)
		{
			f += combineStr[i];
		}
		return f;
	}
	//����String�����е�Ԫ�غϳ�һ���µ�String����
	static String[] combineToArray(String[] str1,String[] str2)
	{
		String[] combineStr = new String[str1.length+str2.length];
		for (int i = 0; i < str1.length; i++)
		{
			String s = str1[i];
			combineStr[i] = s;
		}
		for (int i = 0; i < str2.length; i++)
		{
			String s = str2[i];
			combineStr[i+str1.length] = s;
		}
		return combineStr;
	}
	//����Ԫ��֮��
	static int arraySum (int[] nums)
	{
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
		{
			sum += nums[i];
		}
		return sum;
	}
	//����i*s���ַ���
	static String newString (String s,int i)
	{
		String z = "";
		for (int j = 0; j < i; j++)
		{
			z = s+z;
		}
		return z;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		int i = 5;
//		int sum = add(i, 9);
//		System.out.println(sum);
//		int[] nums = {5,6,99,1,0,2};
//		System.out.println(min(nums));
//		String[] str1 = {"45","df","545556"};
//		String[] str2 = {"fg","5525"};
//		String c = combineToString(str1, str2);
//		System.out.println(c);
//		String[] a = combineToArray(str1, str2);
//		for (int j = 0; j < a.length; j++)
//		{
//			System.out.println(a[j]);
//		}
		int[] nums = {1,5,6,9,10};
		int sum = arraySum(nums);
		System.out.println(sum);
		String s ="abc";
		System.out.println(newString(s, 3));
		
		//�ѷ����ķ���ֵ������Ϊ��������
		String s1 = newString("ali", arraySum(new int[] {1,2,3}));
		System.out.println(s1);
		
		System.out.println(newString("bab", arraySum(new int[] {1,2,5})));
	}

}
