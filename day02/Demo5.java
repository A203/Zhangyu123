package day02;



public class Demo5 { 
	
	public static void main(String[] args)
	{
		//while循环
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("跳出循环语句后i的值："+i);
		int j=1;
		//do...while循环
		do
		{
			System.out.println(j++);
		}while(j<=15);
		//for循环
		for(int k=1;k<=20;k++)
		{
			System.out.println(k);
	}
		//for ...each循环
		int[] in={1,2,3,4};
		for(int p:in)
		{
			System.out.println(p);
		}
	}
}
