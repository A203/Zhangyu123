package day02;

import java.util.Scanner;

public class Enum {
	public enum day {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	};

	public static void main(final String[] args) {
		 day day1 =day.Monday;
		 int theday;
		switch (day1) {
		case Monday:
			theday = 1;
			break;
		case Tuesday:
			theday = 2;
			break;
		case Wednesday:
			theday= 3;
			break;
		case Thursday:
			theday = 4;
			break;
		case Friday:
			theday = 5;
			break;
		case Saturday:
		   theday = 6;
			break;
		case Sunday:
			theday = 7;
			break;
		default:
			theday = 0;
		}
		if(theday==0){
			System.out.println("输入无效");
		}
		else{
			System.out.println("day="+theday);
		}
	}
}
