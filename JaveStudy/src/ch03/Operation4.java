package ch03;

public class Operation4 {
	public static void main(String[] args) {
		int num = 2324;  //첫번째 4숫자 뜯어내기
		int n1 = num % 10; 
		num = num / 10; 
		int n2 = num % 10; 
		num = num / 10;
		int n3 = num % 10;
		num = num / 10;
		int n4 = num % 10;
		num = num / 10;
		System.out.println(n1+n2+n3+n4);
		
	}
}
