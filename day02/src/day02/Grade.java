package day02;

import java.util.Random;

public class Grade {
	public static void main(String[] args) {
		int[] grade[] = new int[20][5];
		Random r = new Random();
		for (int i = 0; i < 20; i++)
			for (int j = 0; j < 5; j++)
				grade[i][j] = r.nextInt(100);
		    int[] p=sum(grade);
			show(grade,p);
			average(grade);
			System.out.println();
//			System.out.println("每个学生成绩和：");
//			for(int i=0;i<20;i++)
//			{
//				System.out.println(p[i]);
//			}
	}

	public static void show(int[][] grade,int[] s)
	{
		System.out.print("学生编号\t"+"core C++"+"\t"+"coreJava"+"      \t"+"Servlet"+"\t\t"+"JSP"+"\t\t"+"EJB"+"      \t"+"总成绩"+"\n");
		for(int i=0;i<20;i++){
			System.out.printf("第%2d个同学\t",i+1);
			for(int j=0;j<5;j++){
				System.out.print(grade[i][j]+"\t\t");
			}
			System.out.println(s[i]);
			System.out.println();
		}
	}

	public static void average(int[][] grade)
	{ 
		double sum[]=new double[5];
		for(int i=0;i<5;i++){
			for(int j=0;j<20;j++){
				sum[i]=sum[i]+grade[j][i];
			}
			sum[i]=(double)sum[i]/20;
		}
		System.out.print("平均分 \t");
		for(int k=0;k<5;k++){
			System.out.print(sum[k]+"\t\t");
		}	
	}
	public static int[] sum(int[][] grade){
		int [] s=new int[20];
		for(int i=0;i<20;i++)
			for(int j=0;j<5;j++)
				s[i]=s[i]+grade[i][j];
		return s;
	}
}

