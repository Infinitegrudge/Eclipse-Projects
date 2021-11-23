package AnimalTester;
import javax.swing.JOptionPane;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shelter myShelter = new Shelter();
		
		String myInput = "";
		while(!myInput.equals("5")) {
		  myInput = JOptionPane.showInputDialog(
		    "Please choose from the following menu:\n" +
		    "1 – Display list of dogs\n" +
		    "2 - Add a dog to the shelter\n" +
		    "3 - Remove a dog from the shelter\n" +
		    "4 - Display the operating cost of the shelter\n" +
		    "5 - Exit the program");
		  if(myInput.equals("1")) {
		    //Display the list of dogs
			  myShelter.showDogs();
		  }
		  else if(myInput.equals("2")) {
		    //Add a dog object
			  myShelter.addDog();
		  }
		  else if(myInput.equals("3")) {
		    //Remove a dog object
			  myShelter.removeDog();
		  }
		  else if(myInput.equals("4")) {
		    //Display the operating cost
			  myShelter.costs();
		  }
		  else {
		    //Display invalid input
			  JOptionPane.showInputDialog("Not a valid choice");
		  }
		}

	}

}
