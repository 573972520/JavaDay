package OOPTest5;

public class Test2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Person pKimi = new Person();
		pKimi.setName("kimi");
		pKimi.setAge(7);
		
		Person pLZY = new Person();
		pLZY.setName("��־ӱ");
		pLZY.setAge(37);
		
		pKimi.setFather(pLZY);
		System.out.println("����"+pKimi.getName()+"������"+pKimi.getFather().getName());
		
	}

}
