package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class primeornot {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("put in a number");
		int num = Integer.parseInt(input);
		for(int i = 2; i < (num); i++) {
			if(num % i == 0 ) {
				JOptionPane.showMessageDialog(null, "your number is not prime");

				System.exit(0);








			}


		}
		JOptionPane.showMessageDialog(null, "Your number is prime");
	}






}
