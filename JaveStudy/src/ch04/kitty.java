package ch04;

public class kitty {
	public static void main(String[] args) {
		for(int i =0; i<3; i++) {
			for(int k =0; k<3; k++) {
				if(k==1) continue;
				System.out.println("i="+i+",k="+k);
			}
		}
	}
}
