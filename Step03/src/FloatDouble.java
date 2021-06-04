import java.util.Scanner;

public class FloatDouble {

	public static void main(String[] args) {
		float f1 = 3.1415f;
		double d1 = 3.1415;
		System.out.println(f1);
		System.out.println(d1);
		//정수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 하나 입력>");
		int r = sc.nextInt();
		
		System.out.println(r*r*d1);
		
	}

}



