import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		/*
		 * 	숫자 두개를 입력 받은 후
		 *  두수의 뺄셈 결과를 출력
		 *  단, 무조건 뺄셈의 결과는 양수가 나오게끔 계산하시오
		 */
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("숫자 입력 >");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 >");
		n2 = sc.nextInt();
		
		int result = n1 > n2 ? n1 - n2 : n2 - n1;
		System.out.println(result);
	}
}





