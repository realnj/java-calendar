package study.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
	
		System.out.println(" 월   화   수   목   금  토  일");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		// 숫자 입력받아 해당월의 최대일수 출력
		System.out.print("원하는 월을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		System.out.println(month);
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d 월은 %d 일 까지 있습니다! \n", month, maxDays[month-1]);
		
		sc.close();
		
	}
}
