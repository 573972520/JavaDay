package com.rupeng.oop.Compare;

public class StringCompare
{
	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = "ABC";
		String s4 = "acd";
		System.out.println(s1.compareTo(s2)); 
		System.out.println(s2.compareTo(s1)); 
		System.out.println(s1.compareTo(s4));
		//�����ַ������������ȫ����򷵻�0
		//�����һ���ַ���anotherString�ĵ�һ���ַ�����ȣ��򷵻����ǵ�һ���ַ��Ĳthis-anotherString
		//�����һ���ַ���ȣ���ô��Ƚϵڶ����ַ������������򷵻صڶ����ַ��Ĳ�Դ����ƣ���һֱ�Ƚϵ������Ϊֹ��������һ������ȣ��򷵻�0
		
		String s5= "abc34";
		System.out.println(s1.compareTo(s5));
		//����Ƚ���һ��������һ���ַ�����ʣһ�㣬�򷵻�this.length()-anotherString.length()
		String s6 = "abc3";
		System.out.println(s5.compareTo(s6));
		
		
		//�����һ���ַ����ȵڶ����ַ�������������������
		//��1��s1�ڴ������ҵ�ĳ���ַ���s2�Ķ�Ӧ��λ���ַ���---�����һ���ַ���anotherString�ĵ�һ���ַ�����ȣ��򷵻����ǵ�һ���ַ��Ĳthis-anotherString,�����һ���ַ���ȣ���ô��Ƚϵڶ����ַ������������򷵻صڶ����ַ��Ĳ�Դ����ƣ���һֱ�Ƚϵ������Ϊֹ��������һ������ȣ��򷵻�0
		//��2��s1��s2��ÿһλ��һ��������s1��s2��,�򷵻�this.length()-anotherString.length()
		//������ظ���������s1��s2С
	}
}
