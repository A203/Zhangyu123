package day02;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args)
		{
			Scanner scanner=new Scanner(System.in);
			int score=scanner.nextInt();
			if (score>100||score<0)
			{
				System.out.println("输入错误");
			}
			else
			{
				if(score>=60)
				{
					System.out.println("成绩合格");
				}
				else {
				System.out.println("成绩不合格");
				}
			}
		}
}
