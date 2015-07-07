package day02;

import java.util.Scanner;

public class Demo6 {

	public enum day {
		Monday, Tuerday, wednesday, Thursday, Friday, Saturday, Sunday
	};

	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		final String dayString = sc.nextLine();
		int day = 0;
		switch (dayString.toLowerCase()) {
		case "monday":
			day = 1;
			break;
		case "tuesday":
			day = 2;
			break;
		case "wednesday":
			day = 3;
			break;
		case "thursday":
			day = 4;
			break;
		case "friday":
			day = 5;
			break;
		case "saturday":
			day = 6;
			break;
		case "sunday":
			day = 7;
			break;
		default:
			day = 0;
		}
		if(day==0){
			System.out.println("输入无效");
		}
		else{
			System.out.println("day="+day);
		}
	}

}
