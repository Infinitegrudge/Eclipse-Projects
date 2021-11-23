package CarPackage;

import javax.swing.JOptionPane;

public class CarMain {

	public static void main(String[] args) {
		CarObject cars[] = new CarObject[3];
		
		for (int i = 0; i < cars.length; i++) {
			//String Make,String Model,int Year,double Price
			cars[i] = new CarObject(JOptionPane.showInputDialog(null,"Input the make"),
					JOptionPane.showInputDialog(null,"Input the model"),
					checkInput(JOptionPane.showInputDialog(null,"Input the year")),
					(double)checkInput(JOptionPane.showInputDialog(null,"Input the price")));
			cars[i].color = JOptionPane.showInputDialog("Enter the color");
			cars[i].numSeats = checkInput(JOptionPane.showInputDialog("Enter the number of seats"));
			
		}
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].make + " " + cars[i].model + " " + cars[i].year + " " + cars[i].price);
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
}
