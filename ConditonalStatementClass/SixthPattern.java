package ConditonalStatementClass;

public class SixthPattern {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {  // to add number of rows you want
			char a = 'a';
			int b = 1;
			for (int j = 4; j > i; j--) { // to add spaces
				System.out.print(" ");
			}
			if (i % 2 == 0) {   //  to check whether it is a number or alphabet
				for (int k = 0; k <= i; k++) {
					System.out.print(a++ + " ");
				}
			} else {
				for (int k = 0; k <= i; k++) {
					System.out.print(b++ + " ");
				}
			}
			System.out.println();
		}

		
		
	}

}
