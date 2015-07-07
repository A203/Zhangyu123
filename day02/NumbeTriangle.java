package day02;

import java.util.Scanner;

public class NumbeTriangle {
	public static void main(String[] args) {
		System.out.println("请输入行号：");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			if(i<=9){
			// 输入空格
			for (int j = 1; j <= num - i; j++)
				System.out.print(" ");
			// 输入符号
			for (int k = 1; k <= 2 * i - 1; k++)
				System.out.print(i);
			System.out.println();
			}
			else if(i>9){
				// 输入空格
				for (int j = 1; j <= num - i; j++)
					System.out.print(" ");
				// 输入符号
				for (int k = 1; k <= 2 * i - 1; k++)
					System.out.print((char)(i+55));
				System.out.println();
				}
		}
	}
}
