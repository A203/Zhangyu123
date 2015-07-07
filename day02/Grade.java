package day02;

import java.util.Random;

public class Grade {
	public  static void main(String[] args)
	{
		int[] grade[]=new  int[20][5];
		Random r=new Random();
		for(int i=0;i<20;i++)
			for(int j=0;j<5;j++)
				grade[i][j]=r.nextInt(100);
		for(int i=0;i<20;i++)
			for(int j=0;j<5;j++)
				System.out.print(grade[i][j]+"   ");
	}
}
