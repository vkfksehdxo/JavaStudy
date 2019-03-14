package ch03;

import java.util.Scanner;

public class Operation2 {
	public static void main(String[] args) {
// 한줄 삭제: Ctrl + D   ,   줄복사 : Ctrl + Alt + 방향키 
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean 배수 = num % 3 == 0;
		System.out.println(배수);
		s.close();	
	}
}
