import java.util.Scanner;

public class Operator4 {
	/*
	 * 		관계연산자(비교연산자)
	 * 			>  <   >=	<=	==	!=
	 */
	public static void main(String[] args) {
		//숫자 두개 입력 받아서 저장
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("첫번째 숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		n2 = sc.nextInt();
		
		System.out.println(n1 > n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 < n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
	}

}




