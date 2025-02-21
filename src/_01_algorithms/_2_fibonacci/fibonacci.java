package _01_algorithms._2_fibonacci;

import javax.swing.JOptionPane;

public class fibonacci {
	
	public static void  main (String [] args) {
	
		int number1 = 0;
		int number2 = 1; 
		int sum = 1;
		
		for(int i = 0; i < 11; i++) {
		
		
	number1 = number2;
	number2 = sum; 
	sum = number1 + number2;
	System.out.println(sum);
		
		
		
		
}
	
}
	
}



