import javax.swing.JOptionPane;

public class FundsMain {

	static boolean usingProgram = true;
	
	public static void main(String[] args) {
		
		//Loop through and preset the donations = to zero
		String[][] schools = new String[10][5];
				for (int i = 1; i <= schools.length - 1; i++) {
					for (int g = 1; g < 5; g++) {
						schools[i][g] = "0.00";
					}
				}
		// TODO Auto-generated method stub

		schools[1][0] = "CathCen" ;
		schools[2][0] ="HolyC";
		schools[3][0] = "JPII";
		schools[4][0] = "MotherT";
		schools[5][0] = "ReginaM";
		schools[6][0] ="St.Joe";
		schools[7][0] = "St.Mary";
		schools[8][0] = "St.Thom";
		schools[9][0] = "Total";
		schools[0][1] = "$0.25";
		schools[0][2] = "$0.50";
		schools[0][3] = "$1.00";
		schools[0][4] = "$2.00";
		
		
		//Ask for user input of which school they want to enter
		while(usingProgram == true) {
			schools = selectSchool(schools);
		}
		
		
		//Loop through and display
		for (int i = 0; i < 5; i++) {
			String newLine = "";
			for (int g = 0; g <= schools.length - 1; g++) {
				newLine += (schools[g][i] + "   ");
			}
			System.out.println(newLine);
			
		}
		
		//Loop through and add grand total
		
				int grandTotal = 0;
				
				for (int i = 1; i <= schools.length - 2; i++) {
					for (int g = 1; g < 5; g++) {
						grandTotal += Double.parseDouble(schools[i][g]);
					}
				}
			System.out.println("Grand Total " + Double.toString(grandTotal));
	}
	static double checkInput(String in) {
		try {
			Double output = Double.parseDouble(in);
			return output;
		}
		catch(Exception e){
			System.out.println("You did not enter a valid number");
			return 0;
		}
	}
	static String[][] selectSchool(String[][] parentArray){
		
		int whichSchool;
		String input =JOptionPane.showInputDialog("Which school is doing the fundraising?\n1-Catholic Central\n2-Holy Cross\n3-John Paul II\n4-Mother Teressa\n5-Regina Mundi\n6-St.Joesph\n7-St.Mary\n8-St.Thomas Aquinas\n9-Exit\n10-Calculate");
		whichSchool = (int)checkInput(input);
		boolean validInput = false;
		
		if (whichSchool <= 8 && whichSchool >=0) {
			validInput = true;
		}
		if (whichSchool == 9) {
			System.exit(0);
		}
		else if(whichSchool == 10) {
			//calculate
			usingProgram = false;
		}
		
		if (validInput == false)
		{
			System.out.println("Thats not one of the choices");
			return parentArray;
		}
		
		//Get student population and donation amount
		double donation = checkInput(JOptionPane.showInputDialog("Enter the ammount donated\n0.25\n0.50\n1.00\n2.00"));
		int colum = 0;
		if (donation == 0.25) {
			colum = 1;
		}
		else if (donation == 0.50) {
			colum = 2;
		}
		else if (donation == 1.00) {
			colum = 3;
		}
		else if (donation == 2.00) {
			colum = 4;
		}
		else {
			JOptionPane.showMessageDialog(null, "Enter a valid input");
			return parentArray;
		}
		double population = checkInput(JOptionPane.showInputDialog("Enter the schools population"));
		parentArray[whichSchool][colum] = Double.toString( donation*population);
		
		//Get the total of all of the column
		for (int i = 1; i < 5; i++) {
			int Total = 0;
			for (int g = 1; g <= parentArray.length - 1; g++) {
				Total += Double.parseDouble((parentArray[g][i]));
			}
			parentArray[9][i] = Double.toString(Total);
		}
		return parentArray;
		
	}

}
