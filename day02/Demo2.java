package day02;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();
		if(score>=90)
		{
			System.out.println("等级为A");
		}
		else if(score>=80)
		{
			System.out.println("等级为B");
		}
		else if(score>=70)
		{
			System.out.println("等级为C");
		}
		else if(score>=60)
		{
			System.out.println("等级为D");
		}
		else 
		{
			System.out.println("等级为E");
		}
	}

}
