package ch04;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class Baseball {public static void main(String[] args) {
	Number n = new Number();
	int number = n.get();
	
	int baseball3 = number % 10;
	int baseball2 = (number / 10) % 10;
	int baseball1 = (number / 10 / 10) % 10;
	System.out.println("baseball1");
	System.out.println("baseball2");
	System.out.println("baseball3");
	
	Scanner s = new Scanner(System.in);
	int inputNumber1 = s.nextInt(1);
	int inputNumber2 = s.nextInt(2);
	int inputNumber3 = s.nextInt(3);
	
	int strike = 0; // ��Ʈ����ũ�� ������ ������ ����
	int ball = 0; // ���� ������ ������ ����
	
	/* �ڵ� �ۼ�
	   ��Ʈ����ũ�� �� �˻� ���ǹ� �ۼ� 
	*/
	if(strike == 0 && ball ==0) 
	
	
	System.out.println("��Ʈ����ũ => " + strike);
	System.out.println("�� => " + ball);
}
}
class Number {
	public int get() {
		int number = 0;
		try {
			URL url = new URL("http://ggoreb.com/kopo/baseball.txt");
			URLConnection urlConnection = url.openConnection();
			InputStream in = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			StringBuffer response = new StringBuffer();
			String data = null;
			while ((data = reader.readLine()) != null) {
				response.append(data);
			}
			number = Integer.parseInt(response.toString());
			reader.close();
			isr.close();
			in.close();
		} catch (Exception e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		}
		return number;
	}
}