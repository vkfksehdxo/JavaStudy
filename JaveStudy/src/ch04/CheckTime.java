package ch04;

import java.util.Calendar;

public class CheckTime {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.get(Calendar.HOUR_OF_DAY);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("hour");
		if(hour >= 12) {
		System.out.println("����");
} 		else { 
			System.out.println("����");
}
	
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);

}
}
