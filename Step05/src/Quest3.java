import java.util.Scanner;

public class Quest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		n2 = sc.nextInt();
		int result= n1 - n2;
		if(result < 0)
			result = -result;
		System.out.println(result);
	}

}
