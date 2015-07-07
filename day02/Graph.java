package day02;

//import java.io.InputStream;
import java.util.Scanner;

public class Graph {
	public static void main(String[] args){
		System.out.println("请输入行号：");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<=num;i++){
			//输入空格
			for(int j=1;j<=num-i;j++)
				System.out.print(" ");
			//输入*号
				for(int k=1;k<=2*i-1;k++)
					System.out.print("*");
				System.out.println();
			
		}
	}
}
/*              *
 *             ***
 *            *****
 *           *******
 *          *********
 *         ***********
 *        *************
 *     总行数：7 
 *    行号   空格数      星号        
 *    1      6      1
 *    2      5      3
 *    3      4      5
 *    4      3      7
 * 
 *    i      7-i     2*i-1
 */	

