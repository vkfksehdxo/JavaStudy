package ch03;

import java.util.Scanner;

public class Operation6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����ڸ� �Է����ּ���.");
		String txt = s.next();
		System.out.println(txt);
		// ������ ù��° ���ڸ� char�� ��������
		char txt2 = txt.charAt(0);
		// �Էµ� ���ڰ� ��� �´��� �˻�
		boolean isCorrect = false;
		isCorrect = txt2 >= 'a' && txt2 <= 'z';
		isCorrect = txt2 >= 'A' && txt2 <= 'Z';
		// ���
		System.out.println(isCorrect);
		
	}
}
