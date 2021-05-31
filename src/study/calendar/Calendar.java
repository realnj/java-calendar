package study.calendar;

import java.util.Scanner;

public class Calendar {
	// 최대일 가져오기
	private static final int[] MAX_DAYS ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	
	public void printSampleCalendar() {
		System.out.println(" 월   화   수   목   금  토  일");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
	
		// 숫자 입력받아 해당월의 최대일수 출력
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		//System.out.print("원하는 월을 입력하세요 : ");
		System.out.print("반복횟수를 입력하세요 : ");
		int repeat = sc.nextInt();
		
		for (int i=0; i<repeat; i++) {
			System.out.print("원하는 월을 입력하세요 : ");
			int month = sc.nextInt();
			System.out.printf("%d 월은 %d 일 까지 있습니다!\n", month, cal.getMaxDaysOfMonth(month));	
		}
		
		System.out.println("Bye~");		
		//cal.printSampleCalendar();	
		sc.close();
		
	}
}
