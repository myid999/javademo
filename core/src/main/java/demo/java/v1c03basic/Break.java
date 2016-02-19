package demo.java.v1c03basic;

/**
 * break, continue, lable
 * @author zhou
 *
 */
public class Break {

	public Break() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	/*	ok:for (int i = 0; i < 10; i++) {
			System.out.println("begin i=" + i);
			 for (int j = 0; j < 10; j++) {
				System.out.println("i=" + i + ",j=" + j);
				if (j == 5)
					break ok;
			}
			System.out.println("end i=" + i);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("begin i=" + i);
			ok: for (int j = 0; j < 10; j++) {
				System.out.println("i=" + i + ",j=" + j);
				if (j == 5)
					break ok;
			}
			System.out.println("end i=" + i);
		}*/
		
		ok:for (int i = 0; i < 10; i++) {
			System.out.println("begin i=" + i);
			 for (int j = 0; j < 10; j++) {
				System.out.println("begin i=" + i + ",j=" + j);
				if (j == 5)
					continue ok;
				System.out.println("end i=" + i + ",j=" + j);
			}
			System.out.println("end i=" + i);
		}
		
	System.out.println("-------------------------------------------------------------------------------------------------------");
	
		for (int i = 0; i < 10; i++) {
			System.out.println("begin i=" + i);
			ok: for (int j = 0; j < 10; j++) {
				System.out.println("begin i=" + i + ",j=" + j);
				if (j == 5)
					continue ok;
				System.out.println("end i=" + i + ",j=" + j);
			}
			System.out.println("end i=" + i);
		}		

	}

}
