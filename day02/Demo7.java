package day02;

public class Demo7 {
	public static void main(String[] args)
	{
		int num=1;
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
				num++;
				continue;
			}
			
		}
		System.out.println("num:"+num);
	}

}
