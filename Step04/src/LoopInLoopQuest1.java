
public class LoopInLoopQuest1 {

	public static void main(String[] args) {
		/*						줄번호		별개수
		 * 			*			1			1
		 * 			**			2			2
		 * 			***			3			3
		 * 			****		4			4
		 * 			*****		5			5
		 */
		for(int i=0;i<5;i++) {
			//한줄 출력하는 반복문
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
