package ch04;

public class Condition {
	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;

		dice1 = (int) (Math.random() * 6) + 1; // 0.0 <= X < 1.0 (����)
		dice2 = (int) (Math.random() * 6) + 1; // 1~6���� ��Ÿ��. 
		System.out.println(dice1 + "," + dice2);
		
		if(dice1 == dice2) { System.out.println("�ѹ� �� ��������.");
		
		// ���ǽ��� true �Ǵ� false��
		char gender = 'M';
		if (gender == 'M') {
			System.out.println("����");
			System.out.println("���� �ƴ�");
			} else { System.out.println("����"); 
		
			if (true) {

		}

	}
	}
}
}