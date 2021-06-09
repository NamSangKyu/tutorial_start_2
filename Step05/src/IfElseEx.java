import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력 > ");
		int n = sc.nextInt();
		if(n % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수 입니다.");
		}else {//위에 있는 조건들이 거짓일때 실행되는 영역
			System.out.println("입력하신 숫자는 홀수 입니다.");
		}
		
	}

}
