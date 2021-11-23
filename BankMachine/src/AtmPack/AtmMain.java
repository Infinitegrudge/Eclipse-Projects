package AtmPack;

import javax.swing.JOptionPane;

public class AtmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit = false;
		Atm userBank = null;
		
		while(exit == false) {
			int choice = (int)checkInput(JOptionPane.showInputDialog("Welcome to ATM\n1 enter in your banking info\n2 calculate intrest\n3 exit"));
			if (choice == 1) {
				userBank = new Atm(JOptionPane.showInputDialog("Enter in the bank name"), checkInput(JOptionPane.showInputDialog("Enter inital money")),checkInput(JOptionPane.showInputDialog("Enter intrest rate")));
			}
			else if (choice == 2) {
				if (userBank != null) {
					userBank.intrest((int)checkInput(JOptionPane.showInputDialog("Enter how many years to leave it")));
					JOptionPane.showMessageDialog(null,"Your new balance is $" +userBank.balance);
				}
				else {
					JOptionPane.showMessageDialog(null, "You don't have banking info");
				}
			}
			else if (choice == 3) {
				System.exit(0);
			}
		}
		
	}
	static double checkInput(String in) {
		try {
			double output = Double.parseDouble(in);
			return output;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "You did not enter a valid input");
			return 0;
		}
	}

}
