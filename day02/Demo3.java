package day02;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args)
		{
			Scanner scanner=new Scanner(System.in);
			int score=scanner.nextInt();
			if (score>100||score<0)
			{
				System.out.println("�������");
			}
			else
			{
				if(score>=60)
				{
					System.out.println("�ɼ��ϸ�");
				}
				else {
				System.out.println("�ɼ����ϸ�");
				}
			}
		}
}
