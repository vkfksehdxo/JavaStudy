package ch02;

public class Variable2 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a�� ����? " + a);

		int b = 11;
		System.out.println("b�� ����? " + b);

		// a�� ���� b�� �Է�
		// ���� a�� ���� 10�� �����
		a = b;
		System.out.println("a�� ����? " + a);
	}
}
