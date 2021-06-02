
public class Operator1 {
	/*
	 * 		사칙연산자
	 * 			+	덧셈
	 * 			-	뺄셈
	 * 			*	곱셈
	 * 			/ 	나눗셈 - 몫
	 * 			%	나눗셈 - 나머지
	 */
	public static void main(String[] args) {
		//정수형 변수 2개 선언 각각 10, 7로 초기화
		int n1 = 10, n2 = 7;
		
		System.out.println(n1 + n2);
		
		int result;
		result = n1 - n2; //n1-n2의 결과를 result 변수에 저장
		System.out.println(result);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		System.out.println(n1%n2);
		
	}

}




