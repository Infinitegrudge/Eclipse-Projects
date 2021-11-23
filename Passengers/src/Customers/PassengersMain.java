package Customers;
import javax.swing.JOptionPane;
import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PassengersMain {

	public static void main(String[] args)throws IOException { File file = new File("Customers.txt"); 
		// TODO Auto-generated method stub
		//Declare variables
		boolean exit = false;
		//Declare the file out writer
		
		while(exit == false) {
			
			int nextAction = checkInput(JOptionPane.showInputDialog("Input:\n1 to see stored customer info\n2 to input new customer info\n3 Exit\n4 Wipe File"));
			
			if (nextAction == 1) {
				printList();
			}
			else if (nextAction == 2) {
				addNew();
			}
			else if (nextAction == 3) {
				System.exit(0);
			}
			else if (nextAction == 4) {
				new FileWriter(file, false).close();
				JOptionPane.showMessageDialog(null, "File wiped");
			}
			else {
				JOptionPane.showMessageDialog(null, "That is not a valid option");
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
		
	static boolean checknum(String in) {
			try {
				int output = Integer.parseInt(in);
				return true;
			}
			catch(Exception e){
				return false;
			}
	}
	static void printList()throws IOException { File file = new File("Customers.txt"); 
		String data = "";
	//Check for previous input
		boolean real = file.exists();
		if (real == false) {
			JOptionPane.showMessageDialog(null, "There is nothing to be read");
			return;
		}
		try {
			//Print previous inputs
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				data+= reader.nextLine()
;			}
			
			reader.close();
			JOptionPane.showMessageDialog(null,"Previous entries: \n" + data);
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "SomethingBroke");
			e.printStackTrace();
		}
		
	}
	
	
	static void addNew()throws IOException { File file = new File("Customers.txt");
		 String data = "";
	//Check if the file exists
		boolean real = file.exists();
		
		if (real != true) {
			file.createNewFile();
		}
		//get customer's name, address, city, province and postal code
		int loop = 0;
		String[] whichInput = new String[5];
		whichInput[0] = "name";
		whichInput[1] = "adress";
		whichInput[2] = "city";
		whichInput[3] = "province";
		whichInput[4] = "postal code";
		
		while (loop < whichInput.length) {
			loop+= 1;
			
			String input = JOptionPane.showInputDialog("Enter in the " + whichInput[loop -1] + " Of the person");
			if (loop == 5) {
				System.out.println(checkPostal(input));
				if(checkPostal(input) == false) {
					loop = 4;
					JOptionPane.showMessageDialog(null, "Postal code is not valid");
				}
				
				else {
					data+= (input + ", ");
				}
				
			}
			else {
				data+= (input + ", ");
			}
			
			
		}
		
		 //create file writer object
		 FileWriter fileOut = new FileWriter(file);
		 fileOut.write(data +"\n");
		 
		 //Close file
		 fileOut.flush();
		 fileOut.close();
	}
	
	static boolean checkPostal(String input) {
		
		if (input == null) {
			return false;
		}
		//split the string into letters
		String[] letters = input.split("(?!^)");
		//Check for correct length
		if(letters.length != 6) {
			return false;
		}
		//Check that it follows letter number letter number
		for (int i = 0; i<
				letters.length;i++) {
			if (i% 2 == 0) {
				if (checknum(letters[i]) == true) {
					return false;
				}
			}
			else {
				if (checknum(letters[i]) == false) {
					return false;
				}
			}
		}
		return true;
	}
}
