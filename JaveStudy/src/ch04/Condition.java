package ch04;

public class Condition {
	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;

		dice1 = (int) (Math.random() * 6) + 1; // 0.0 <= X < 1.0 (랜덤)
		dice2 = (int) (Math.random() * 6) + 1; // 1~6까지 나타냄. 
		System.out.println(dice1 + "," + dice2);
		
		if(dice1 == dice2) { System.out.println("한번 더 던지세요.");
		
		// 조건식은 true 또는 false로
		char gender = 'M';
		if (gender == 'M') {
			System.out.println("남자");
			System.out.println("여자 아님");
			} else { System.out.println("여자"); 
		
			if (true) {

		}

	}
	}
}
}