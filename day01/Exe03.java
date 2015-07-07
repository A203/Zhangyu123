package day1;
import java.util.Scanner;
public class Exe03 {
	public static void main(String[] args)
	{
		System.out.println("输入两个数：");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		double  n = sc.nextDouble();
		Scanner sk=new Scanner(System.in);
		double  p = sk.nextDouble();
		System.out.println("加法"+add(n, p));
		System.out.println("减法："+minus(n, p));
		System.out.println("乘法"+multiply(n, p));
		System.out.println("除法"+division(n, p));
	}
	public static int add(int a,int b)
	{
		return (a+b);
	}
	public static double add(double a,double b)
	{
		return (a+b);
	}
	public static int minus(int a,int b)
	{
		return(a-b);
	}
	public static double minus(double a,double b)
	{
		return(a-b);
	}
	public static int multiply(int a,int b)
	{
		return(a*b);
	}
	public static double multiply(double a,double b)
	{
		return(a*b);
	}
	public static int division(int a,int b)
	{
		return(a/b);
	}
	public static double division(double a,double b)
	{
		return(a/b);
	}

}
