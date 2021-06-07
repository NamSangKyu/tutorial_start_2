import java.util.Scanner;

public class DoWhileQuest {

	public static void main(String[] args) {
		int num= 0;
		int total = 0;
		Scanner sc = new Scanner(System.in);

		//숫자 0을 입력할때까지 숫자를 입력을 받고
		do{
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			total += num;
		}while(num != 0);
		//숫자 0을 입력을 하면 입력한 숫자들의 총합을 출력
		System.out.println(total);
	}

}
