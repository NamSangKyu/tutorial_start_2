import java.util.Scanner;

public class InputNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		System.out.print("숫자 하나 입력>");
		n1 = sc.nextInt();
		
		//숫자 하나더 입력 받아서 입력받은 숫자들의 사칙연산 결과를 출력
		int n2;
		System.out.print("숫자 하나 입력>");
		n2 = sc.nextInt();
		
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		System.out.println(n1%n2);
	}

}




