import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자 하나 입력 > ");
		n = sc.nextInt();
		
		switch(n) {
		case 4:
			System.out.println("method - 1");
			break;
		case 3:
			System.out.println("method - 2");
			break;
		case 2:
			System.out.println("method - 3");
			break;
		case 1:
			System.out.println("method - 4");
			break;
		default:
			System.out.println("method - 5");
		}
	}

}
