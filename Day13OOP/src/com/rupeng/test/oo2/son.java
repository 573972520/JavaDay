package com.rupeng.test.oo2;

public class son extends father
{
	private String name;

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void sayHelloSon()
	{
		this.setAge(888);
		
		System.out.println("����,����"+this.name+"��"+this.getAge()+"����");
		AA++;
		System.out.println("son AA is"+AA);
	}
}
