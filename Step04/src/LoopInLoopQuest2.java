
public class LoopInLoopQuest2 {

	public static void main(String[] args) {
		/*						줄번호		별개수	공백개수
		 * 			    *		1			1		4
		 * 			   **		2			2		3
		 * 			  ***		3			3		2
		 * 			 ****		4			4		1
		 * 			*****		5			5		0
		 */
		for(int i=0;i<5;i++) {
			for(int j=0;j<5 - 1 - i;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}


}
