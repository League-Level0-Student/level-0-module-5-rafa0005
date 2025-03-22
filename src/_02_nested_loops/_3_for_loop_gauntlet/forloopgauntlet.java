package _02_nested_loops._3_for_loop_gauntlet;

public class forloopgauntlet {
	public static void main(String[] args) {
		for(int i = 0; i < 101; i++) {
			// System.out.println(i);
		}

		for(int i = 100; i > -1 ; i--) {
			// System.out.println(i);
		} 

		for(int i = 2; i < 101 ; i+=2) {
			// System.out.println(i);
		} 

		for(int i = 1; i < 100 ; i+=2) {
			// System.out.println(i);
		} 

		for(int i = 1; i < 501 ; i++) {

			if(i % 2 == 0) {
				// System.out.println(i + " is even");
			}
			if(i % 2 == 1) {
				// System.out.println(i + " is odd");
			}
		}
		for(int i = 7; i < 778 ; i+=7) {
			// System.out.println(i);
		} 
		for(int i = 2012; i < 2026 ; i++) {
			// System.out.println(" in " +i+ " I was " + (i - 2012) +" years old ");
		}

		for(int i = 0; i < 3; i++) {

			for(int j = 0; j < 3; j++) {
				// System.out.print(i + " "); 
				// System.out.println(j);
			}

		} 
		for(int i = 0; i < 3; i++) {

			for(int j = 1; j < 4; j++) {
				// System.out.print(j + i * 3);
			} 
			// System.out.println();
		}

		for(int i = 0; i < 10; i++) {
			for(int j = 1; j < 11; j++) {
				// System.out.print(j + i * 10 + " " );
			}
			// System.out.println();
		}
		
		for(int i = 1; i < 7; i++) {
		for(int j = 0; j < i; j++) {
		System.out.print(" * ");
		}
		System.out.println();
}
}
}


