package day02;



public class Demo5 { 
	
	public static void main(String[] args)
	{
		//whileѭ��
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("����ѭ������i��ֵ��"+i);
		int j=1;
		//do...whileѭ��
		do
		{
			System.out.println(j++);
		}while(j<=15);
		//forѭ��
		for(int k=1;k<=20;k++)
		{
			System.out.println(k);
	}
		//for ...eachѭ��
		int[] in={1,2,3,4};
		for(int p:in)
		{
			System.out.println(p);
		}
	}
}
