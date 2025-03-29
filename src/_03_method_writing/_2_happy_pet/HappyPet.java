package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("what kind of pet would you want to buy");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		for(; true ;) {
		// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
		//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
		//    Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "what do you want to do to make your pet happy?", "", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "cuddle", "take a walk", "give them food" }, null);		
			System.out.println(task);
		// 6. Use user input to call the appropriate method created in step 5 below.
			if(task == 0) {
			 cuddle(pet);
			}
			if(task == 1) {
				 takeawalk(pet);
				}
			if(task == 2) {
				 giveitfood(pet);
				}

		// 7. If you determine the happiness level is large enough, tell the
		//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel >= 10) {
				JOptionPane.showMessageDialog(null, "you beat the game");
				System.exit(0);
			}
		
		
		}

		
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level. 
	static void cuddle(String notpet){ 
	happinessLevel +=2;
		JOptionPane.showMessageDialog(null, "your " + notpet + " gained 2 happiness levels because you cuddled with it ");
		

	}  
	static void takeawalk(String npet) {
		happinessLevel +=1; 
		JOptionPane.showMessageDialog(null, "your" + npet + " gained 1 happiness level because you took it on a walk");
	} 
	static void giveitfood(String nopet) {
		happinessLevel +=1; 
		JOptionPane.showMessageDialog(null, "your" + nopet + " gained 1 happiness level because you took it on a walk");
	}
	
}