package ch04;

public class Forexam2 {
	public static void main(String[] args) {
		// 1000������ �ڿ��� �߿��� 2�� ����̸鼭  7�� ����� ���ڸ� ���	��µ� ���ڵ��� ���� ���ϴ� �ڵ� �ۼ�	
		int total = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 ==0 && i % 7 ==0)
				total += i;
				System.out.println(i);
		}
			System.out.println("�� ���ڵ��� �� :" + total);
				
	}
}
