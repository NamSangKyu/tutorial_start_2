import java.util.Scanner;

public class ElseIfEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수(0~100) 하나 입력 > ");
		int n = sc.nextInt();
		
		if(n >= 90) {
			System.out.println("성적 등급 A");
		}else if(n >= 80) {//이전 조건 부분이 거짓이면 실행되는 조건
			System.out.println("성적 등급 B");
		}else if(n >= 70) {
			System.out.println("성적 등급 C");
		}else if(n >= 50) {
			System.out.println("성적 등급 D");
		}else {
			System.out.println("성적 등급 F");
		}
	}

}





