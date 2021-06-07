import java.util.Scanner;

public class ForQuest4 {

	public static void main(String[] args) {
		// 숫자 하나를 입력 받은 후
		// 입력한 숫자만큼 Hello World 출력 --> for문
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("출력할 개수 입력 : ");
		n = sc.nextInt();
		for (int i=0;i < n;i++) {
			System.out.println("Hello World");
		}

	}

}
