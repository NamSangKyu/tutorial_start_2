
public class IfQuest {

	public static void main(String[] args) {
		/*
		 * 1부터 100까지의 숫자 중 7의 배수 또는 8의 배수를 출력하는 코드를 작성
		 * 
		 */
		for(int i=1;i<=100;i++) {
			if(i%7==0 || i % 8 == 0)
				System.out.print(i + " ");
		}
	}

}
