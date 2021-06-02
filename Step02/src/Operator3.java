
public class Operator3 {
	/*
	 * 		증감연산자 -   ++		--
	 * 			변수에 있는 내용을 1씩 증가하거나 감소 시키는 연산자.
	 * 			= 이 없이 계산한 결과가 자동으로 저장
	 * 		예>	후위형		전위형
	 * 			num++;		++num;		
	 * 			num--;		--num;		
	 * 
	 */
	public static void main(String[] args) {
		int num = 10;
		num++;
		System.out.println(num);
		--num;
		System.out.println(num);
		System.out.println("-------------");
		int n1 = 10, n2 = 10;
		System.out.println(n1);//10
		System.out.println(n1++);//10
		System.out.println(n1);//11

		System.out.println(n2);//10
		System.out.println(++n2);//11
		System.out.println(n2);//11
		System.out.println("--------------");
		int n3 = 10;
		int result = n3++ * 2 + ++n3;
		System.out.println(result);//32
		
	}

}







