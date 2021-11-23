package twoDogsMeet;
import javax.swing.JOptionPane;
public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dog dog1 = new Dog(JOptionPane.showInputDialog("Enter the dogs name"),JOptionPane.showInputDialog("Enter the dogs Breed"));
			dog1.agression();
			dog1.hunger();
			dog1.agro = Integer.parseInt(JOptionPane.showInputDialog("Current agression " +dog1.agro + " input an agression value"));
			dog1.hunger = Integer.parseInt(JOptionPane.showInputDialog("Current hunger " +dog1.agro + " input an hunger value"));
			Dog dog2 = new Dog(JOptionPane.showInputDialog("Enter the dogs name"),JOptionPane.showInputDialog("Enter the dogs Breed"));
			dog2.agro = Integer.parseInt(JOptionPane.showInputDialog("Current agression " +dog2.agro + " input an agression value"));
			dog2.hunger = Integer.parseInt(JOptionPane.showInputDialog("Current hunger " +dog2.agro + " input an hunger value"));
			dog2.agression();
			dog2.hunger();
			if (dog1.agro > 7 || dog2.agro > 7) {
				JOptionPane.showMessageDialog(null,"They fight");
			}
			else {
				JOptionPane.showMessageDialog(null, "They don't fight");
			}
		
		

	}

}
