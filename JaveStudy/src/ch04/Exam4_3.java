package ch04;

import java.util.Scanner;

public class Exam4_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("���� 3�� �Է�>>");
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 int c = scanner.nextInt();

		 /* 1. a�� b���� ũ�ų� ���� a�� c���� ���ų� ���� ��� */
		 /* �Ǵ� a�� c���� ũ�ų� ���� a�� b���� ���ų� ���� ��� */
		 /* �߰� ���� a */
		 if(a >= b && a <= c || a >=c && a <= b) {
			 System.out.println("�߰����� a");
		} else if(b >= a && b <=c || b >=c && b <= a) {
			 System.out.println("�߰����� b");
	    } else {System.out.println("�߰����� c");
	    }
		 
		 /* 2. b�� a���� ũ�ų� ���� b�� c���� ���ų� ���� ��� */
		 /* �Ǵ� b�� c���� ũ�ų� ���� b�� a���� ���ų� ���� ��� */
		 /* �߰� ���� b */
		 /* 3. �� �̿��� ��� */
		 /* �߰� ���� c */
            scanner.close();
		 }	
	}
