package study.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 키보드 두 수 입력
		int a, b;
		System.out.println("두 수를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();

		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);

		// 화면에 합 출력
		System.out.printf("%d, %d 두 수의 합은 %d 입니다", a, b, a+b);
		sc.close();
	}
}
