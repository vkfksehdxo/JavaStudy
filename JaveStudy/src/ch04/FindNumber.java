package ch04;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		int random =(int) (Math.random() * 100) +1; 
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int num = s.nextInt();
			if(random == num) {
				System.out.println("������");
				break;
			} else if(random > num) {
				System.out.println("�� ū���� �Է��ϼ���");
			} else{
				System.out.println("�� �������� �Է��ϼ���");
			}
		}
	}
}
