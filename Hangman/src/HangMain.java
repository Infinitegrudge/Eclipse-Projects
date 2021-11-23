import java.util.Random;
import javax.swing.JOptionPane;

public class HangMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String words[] = new String[2];
		 words[0] = "intresting";
		 words[1] = "rowan";
		 
		 Random rand = new Random();
		 
		 int choice = rand.nextInt(2) - 1;
		 
		 String chosen = words[choice];
		 String letters[] = chosen.split("(?!^)");
		 String revealed[] = new String[letters.length];
		 
		 int incorrect = 7;
		 while (incorrect > 0) {
			 String output = "";
			 boolean allRevealed = true;
			 for (int i = 0; i < letters.length;i++) {
				 boolean isRevealed = false;
				 
				 for(int g = 0; g< revealed.length;g++) {
					 if (letters[i].equals(revealed[g])) {
						 isRevealed = true;
					 }
				 }
				 if (isRevealed == true) {
					 output += letters[i];
				 }
				 else if (letters[i] == " ") {
					 output += " ";
					 allRevealed = false;
				 }
				 else {
					 output += "_" + " ";
					 allRevealed = false;
				 }
			 }
			 
			 if(allRevealed == true) {
				 JOptionPane.showMessageDialog(null, "You win");
				 System.exit(0);
			 }
			 
			 JOptionPane.showMessageDialog(null, "The word looks like " + output);

			String guess = JOptionPane.showInputDialog("You have " + incorrect +" guesses left" +  "\nInput a letter");
			 if (guess.length() == 1) {
				 boolean correct = false;
				 for(int i = 0; i<letters.length;i++) {
					 if (letters[i].equals(guess)) {
						 correct = true;
						 revealed[i] = guess;
						
					 }
				 }
				 if (correct == false) {
					 incorrect -= 1;
					 JOptionPane.showMessageDialog(null, "Your guess is incorrect");
				 }
				 else {
					 JOptionPane.showMessageDialog(null, "Correct guess");
				 }
				 
			 }
			 else {
				 JOptionPane.showMessageDialog(null, "Enter in only one letter");
			 }
		 }

	}
}

