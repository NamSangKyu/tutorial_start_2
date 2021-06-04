
public class Operator5 {
	/*
	 * 논리 연산자 : 두개 이상의 조건식을 판단하기 위함
	 * 		&& : AND 연산 --> 양쪽의 조건식이 둘다 true일때만 true가 되는 연산자
	 * 		|| : OR 연산 --> 여러개 조건식 중 하나라도 조건식이 true면 true가 되는 연산자
	 * 				        양쪽이 false면 false가 되는 연산자
	 * 		!  : NOT 연산 --> true --> false, false --> true
	 */
	public static void main(String[] args) {
		int n = 10;
		//System.out.println(5 < n < 20);
		System.out.println(n > 5 && n < 20);
		System.out.println(n < 10 || n == 20);
		System.out.println(!(n > 5));
		
	}

}
