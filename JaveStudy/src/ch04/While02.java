package ch04;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		System.out.println("����:0, ����:1, ��:2");
		Scanner s = new Scanner(System.in);
		
		boolean isContinue = true;
		
		while(true) {
		
		int player = s.nextInt();
		int com = (int)(Math.random() * 3);
		
		
		if ( (player + 1) % 3 == com) {
			System.out.println("���� ��");
		} else {
			if( player == com ) {
				System.out.println("���");
			} else {
				System.out.println("���� �̱�");
				isContinue = false;
			}
		}
	}
}
}

