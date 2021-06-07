import java.util.Scanner;

public class ForQuest2 {

	public static void main(String[] args) {
		//숫자 하나를 입력 받아, 해당 숫자의 구구단을 출력
		int dan;
		Scanner sc = new Scanner(System.in);
		//1. 숫자 입력
		System.out.print("출력할 구구단 단을 입력하세요>");
		dan = sc.nextInt();
		//2. 입력한 숫자에다가 1~9까지 곱하고 출력하는 반복문을 작성
		//		5 * 1 = 5
		//		5 * 2 = 10
		//      ...
		//		5 * 9 = 45
		for(int i=1;i<10;i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}

}





