package ch04;

public class While01 {
	public static void main(String[] args) {
		int num = 1324123780;
		
		while(num > 0 ) {
			int n = num % 10 ;
			System.out.println(n);
			num = num / 10;
		
			
			
//		// ù��° 4 ���� ����
//		int n1 = num % 10; // 4
//		
//		// �ι�° 2 ���� ����
//		num = num / 10; // 232		
//		int n2 = num % 10; // 2
//
//		// ����° 3 ���� ����
//		num = num / 10; // 23
//		int n3 = num % 10; // 3
//		
//		// �׹�° 2 ���� ����
//		num = num / 10; // 2
//		int n4 = num % 10; // 2
//		
//		System.out.println(n1+n2+n3+n4);
	}
}

}
