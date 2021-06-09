import java.util.Scanner;

public class IfEx1 {
	/*
	 * 분기문 : 데이터에 따라서 하는 일을 다양하게 구현
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println("입력하신 숫자는 양수 입니다.");
		}
		if(n == 0) {
			System.out.println("입력하신 숫자는 0 입니다.");
		}
		if(n < 0) {
			System.out.println("입력하신 숫자는 음수 입니다.");
		}
	}

}





