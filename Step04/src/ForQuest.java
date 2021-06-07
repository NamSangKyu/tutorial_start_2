import java.util.Scanner;

public class ForQuest {

	public static void main(String[] args) {
		int num= -1;
		int total = 0;
		Scanner sc = new Scanner(System.in);

		//숫자 0을 입력할때까지 숫자를 입력을 받고
		for(;num != 0;) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			total += num;
		}
		//숫자 0을 입력을 하면 입력한 숫자들의 총합을 출력
		System.out.println(total);
	}

}
