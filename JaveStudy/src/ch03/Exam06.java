package ch03;

import java.util.Scanner;
public class Exam06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2�ڸ��� �����Է�(10~99)>>");
		int n = scanner.nextInt();
		
		int ten = 0; // 10�� �ڸ� ���� ������ ����
		ten = n /10;
		
		int one = 0; // 1�� �ڸ� ���� ������ ����
		one = n % 10;
		
		boolean isMatch = false; // �� �ڸ� �� �� ���� ������ ����
		isMatch = ten == one;
		System.out.println(isMatch);
		scanner.close();
		
	}
}
