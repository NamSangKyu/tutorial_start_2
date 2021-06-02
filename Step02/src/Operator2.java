import java.util.Scanner;

public class Operator2 {
	/*
	 * 		복합대입연산자 : 오른쪽에 연산 결과를 왼쪽의 변수에 결과를 계산해서 누적
	 * 			+= 	-=	 *=	 /=	 %=
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수형 변수 2개 선언 후
		int n1, n2;
		// 정수 2개를 입력 받음
		System.out.println("숫자 입력 ");
		n1 = sc.nextInt();
		System.out.println("숫자 입력 ");
		n2 = sc.nextInt();
		
		n1 %= n2;//n1 = n1 + n2;
		System.out.println(n1);
		
	}

}
