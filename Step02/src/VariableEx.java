
public class VariableEx {
	/*
	 * 	변수 : 하나의 데이터를 저장할 수 있는 공간
	 *	 
	 *	변수 작성 방법
	 *		변수타입 변수명;
	 *	-2^7 ~ 2^7-1
	 *	변수 타입
	 *  	정수형 : byte(1) short(2) int(4) long(8) char(2)
	 *  	실수형 : float(4) double(8)
	 *  	논리형 : boolean(1)
	 *  
	 *  변수명 짓는 규칙
	 *  	1. 알파벳 대소문자, 숫자, _ $
	 *  	2. 동일한 변수명을 쓸수 없음
	 *  	3. 첫글자는 숫자를 사용할수 없음
	 *  	4. 키워드와 동일한 변수명을 쓸수 없음
	 */
	public static void main(String[] args) {
		//변수 작성
		int num;
		num = 10;
		num = 30;
		System.out.println(num);
		//정수형 변수 3개 작성, 값 저장한 후 화면에 출력
		int n1=10,n2=20,n3=30;//변수 선언 후 초기화
		//n1=10;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

	}

}





