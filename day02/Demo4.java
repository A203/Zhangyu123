package day02;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int day=scanner.nextInt();
		String daystring="";
		switch(day)
		{		
		case 1:daystring="Monday";break;
		case 2:daystring="Tuesday";break;
		case 3:daystring="Wednesday";break;
		case 4:daystring="Thursday";break;
		case 5:daystring="Friday";break;
		case 6:daystring="Saturday";break;
		case 7:daystring="Sunday";break;
		}
		System.out.println(daystring);
	}

}
