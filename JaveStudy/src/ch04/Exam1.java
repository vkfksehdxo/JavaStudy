package ch04;

public class Exam1 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
//			int space =5 -i;
			int space =i -1;
			for(int j = 1; j <= 5; j++) {
				if(j <= space) {
					System.out.println(" ");
				} else {
					System.out.println("¡Ú");
				}
			}
			System.out.println();
		} 
}
}