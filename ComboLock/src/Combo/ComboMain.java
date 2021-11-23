package Combo;
import javax.swing.JOptionPane;
import java.util.Random;

public class ComboMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare combo array
		 ComboObject Combo = new ComboObject(0,0,0);
		 boolean exit = false;
		 
		//Check which lock type the user wants
		while (exit == false) {
			int comboType = checkInput(JOptionPane.showInputDialog("Enter 1 for a random combination\nEnter 2 for a user set combination\nEnter 3 to try to unlock\nEnter 4 to exit"));
			if (comboType == 1) {
				Combo = randCombo();
				JOptionPane.showMessageDialog(null, "Combination generation complete\nThe combination will contain only 1,2, and 3");
			}
			else if (comboType == 2) {
				Combo = userSet(Combo);
			}
			else if (comboType == 3) {
				if (Combo.num1 == 0 && Combo.num2 == 0 && Combo.num3 == 0) {
					JOptionPane.showMessageDialog(null, "You haven't entered or generated a combination");
				}
				else {
					tryCombo(Combo);
				}
			}
			else if (comboType == 4) {
				System.exit(0);
			}
		}
		
	}
	static int checkInput(String in) {
		try {
			int output = Integer.parseInt(in);
			return output;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "You did not enter a valid input");
			return 0;
		}
	}
	
	static ComboObject userSet(ComboObject output) {
		//Get the user to set the code
		
		int digitEntered = 0;
		int[] digits = new int[3];
		while (digitEntered != 3){
			
		 digits[digitEntered] = checkInput(JOptionPane.showInputDialog("Enter the " + (digitEntered + 1) + " digit of the combination"));
		 digitEntered += 1;
		 
		}
		
		//Enter the combo
		output = new ComboObject(digits[0],digits[1],digits[2]);
		System.out.println(output);
		return output;
	}
	static void tryCombo(ComboObject combo) {
		//Loop through 3 times and see if the user gets it right
		for(int g = 0;g<3;g ++) {
			int digits[] = new int[3];
			
			JOptionPane.showMessageDialog(null, (g+1) + " Attempt out of 3"); ;
			
			for(int i = 0; i< digits.length; i++) {
				digits[i] = checkInput(JOptionPane.showInputDialog("Enter in the " + (i+1) + " number of the combonation"));
			}
			if (combo.num1 == digits[0] && combo.num2 == digits[1] && combo.num3 == digits[2]) {
				JOptionPane.showMessageDialog(null, "Your correct");
				return;
			}
			else {
				JOptionPane.showMessageDialog(null, "inncorect");
			}
		}
		String rightAwnser = "The correct awnser is\n " + combo.num1 + "\n " + combo.num2 + "\n " + combo.num3;
		JOptionPane.showMessageDialog(null, rightAwnser);
		
	}
	static ComboObject randCombo() {
		
		int[] digits = new int[3];
		Random rand = new Random();
		
		for (int i = 0;i< digits.length;i++) {
			
			digits[i] = rand.nextInt(2) + 1;
			
		}
		
		ComboObject output = new ComboObject(digits[0],digits[1],digits[2]); 
		return output;
	}
}
