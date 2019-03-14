package ch03;

import java.util.Scanner;
public class Exam06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2자리수 정수입력(10~99)>>");
		int n = scanner.nextInt();
		
		int ten = 0; // 10의 자리 수를 저장할 변수
		ten = n /10;
		
		int one = 0; // 1의 자리 수를 저장할 변수
		one = n % 10;
		
		boolean isMatch = false; // 두 자리 수 비교 값을 저장할 변수
		isMatch = ten == one;
		System.out.println(isMatch);
		scanner.close();
		
	}
}
