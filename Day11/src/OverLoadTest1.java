import javax.print.DocFlavor.STRING;

public class OverLoadTest1 implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub

	}

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		String s1 =getMax( new String[] {"12","gfhfg","gh"});
		System.out.println(s1);
		String[] s2 = {"1465462","gfhfg","gh","1465462"};
		System.out.println(getMax(s2));
		int i1 = getMax(new int[] {5,6,99,99,1});
		System.out.println(i1);
		
		System.out.println(getMax(7,8));
		System.out.println(getMax(3.44444422f, 16.3443f)); //float���ͼǵ��ں������f
		System.out.println(getMax("3asa2", "4das4"));
		
	}

//���أ�OverLoad������ͬһ���У��������һ�����ϵ�ͬ��������ֻҪ������������߲������Ͳ�ͬ���ɡ�
//����ֵ��һ������������һ����������û�й�ϵ
	
//	static int getMax (String[] str)
//	{
//		return 1;
//	}
	//����ķ���������ķ������ڷ���ֵ���Ͳ�һ�������ַ����ǲ������ص�
	static String getMax (String[] strs)
	{
		String max = strs[0];
		for (int i = 0; i < strs.length; i++)
		{
			String str = strs[i];
			if (str.length() > max.length())
			{
				max = str;
			}
		}
		return max ;
	}
	/**
	 * ȡ��һ��int�����е����ֵ
	 * @param nums ����
	 * @return ���ֵ
	 */
	static int getMax (int[] nums)
	{
		int max = nums[0];
		for (int i = 0; i < nums.length; i++)
		{
			if (max < nums[i])
			{
				max = nums[i];
			}
		}
		return max ;
	}
	
	static int getMax (int i1,int i2)
	{
		return i1>i2?i1:i2;
	}
	
	static float getMax (float f1,float f2)
	{
		return f1>f2?f1:f2;
	}
	
	static String getMax (String s1,String s2)
	{
		return s1.length()>s2.length()?s1:s2;
	}
}
