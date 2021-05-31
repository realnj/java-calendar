package study.calendar;

import java.util.Scanner;

public class prompt {

	private final static String PROMPT = "cal> ";
	
	public static void runPrompt() {
		
		// 숫자 입력받아 해당월의 최대일수 출력

		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		//System.out.print("반복횟수를 입력하세요 : ");
		
		//int repeat = sc.nextInt();
		
		int month = 1;
	
		while (true) {
			System.out.println("원하는 월을 입력하세요 : ");
			System.out.print(PROMPT);
			month = sc.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			System.out.printf("%d 월은 %d 일 까지 있습니다!\n", month, cal.getMaxDaysOfMonth(month));
			
			cal.printCalendar(2017, month);
		}
		
		System.out.println("Bye~");		
		//cal.printSampleCalendar();	
		sc.close();
		
	}

	public static void main(String[] args) {
		prompt p = new prompt();
		p.runPrompt(); 
	}
	
}
