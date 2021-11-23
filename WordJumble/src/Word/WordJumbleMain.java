package Word;
import javax.swing.JOptionPane;

public class WordJumbleMain {
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter in your word here");
		String[] charecters = input.split("(?!^)");
		printWord(0,charecters,input);
	}
		
	
	static void printWord(int charNumber, String[] charecter, String word) {
		
		String[] original = charecter;
		
		for (int i = 0; i <= charecter.length;i++) {
			
			if (i != charNumber) {
				//change the positions of two charecters
				String temp = charecter[charNumber];
				charecter[charNumber] = charecter[i];
				charecter[i] = temp;
				
				//Print the new word
				
				String out = "";
				for (int g = 0; g<charecter.length;g++) {
					out += charecter[g];
				}
				System.out.println(out);
			}
			
			charNumber+=1;
			//Check if at the last letter
			if (charNumber == charecter.length) {
				return;
			}
			else {
				printWord(charNumber, original ,word);
			}
			
		}
	}
}


