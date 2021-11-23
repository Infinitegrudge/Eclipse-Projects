package AnimalTester;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Shelter {
		private ArrayList<Dog> Dogs = new ArrayList<Dog>();
		
		public void addDog() {
			//ask user for input for the dogs
			String name = JOptionPane.showInputDialog("Enter in the dogs name");
			String age = JOptionPane.showInputDialog("Enter in the dogs age");
			String breed = JOptionPane.showInputDialog("Enter in the dogs breed");
			Dogs.add(new Dog(name,age,breed));
		}
		public void removeDog() {
			String name = JOptionPane.showInputDialog("Enter in the dogs name");
			String age = JOptionPane.showInputDialog("Enter in the dogs age");
			String breed = JOptionPane.showInputDialog("Enter in the dogs breed");
			
			Dog toRemove = new Dog(name,age,breed);
			
			boolean isThere = false;
			int indexOf = 0;
			for(int i = 0; i< Dogs.size(); i++) {
				if (Dogs.get(i) == toRemove) {
					isThere = true;
					indexOf = i;
					break;
				}
			}
			if (isThere == true) {
				Dogs.remove(indexOf);
				JOptionPane.showMessageDialog(null, "Dog Removed");
			}
			else {
				JOptionPane.showMessageDialog(null, "Dog not found");
			}
			
		}
		public void showDogs() {
			String output = "";
			for(int i = 0;i < Dogs.size();i++) {
				String current =i + " Name: " + Dogs.get(i).Name + " Age:" + Dogs.get(i).Age + "  Breed:" +Dogs.get(i).Breed + "\n";
				output += current;
			}
			JOptionPane.showMessageDialog(null, output);
		}
		public void costs() {
			int output = 0;
			for(int i = 0;i < Dogs.size();i++) {
				output += 15;
			}
			String display = "Costs: $" +Integer.toString(output);
		}
		
}
