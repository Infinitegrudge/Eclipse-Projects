import javax.swing.*;
import java.lang.Math;

public class RoundingError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputText = JOptionPane.showInputDialog("input a number");
		
		try {
			double isNum = Double.parseDouble(inputText);
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "You didn't input a number");
			System.exit(0);
		}
			double isNumber = Double.parseDouble(inputText);
			
			double squareRoot = (double)Math.sqrt(isNumber);
			double square = squareRoot * squareRoot;
			String outputRoot = Double.toString(squareRoot);
			String outputsquare = Double.toString(square);
			double error = square - isNumber;
			String outputError = Double.toString(error);
			JOptionPane.showMessageDialog(null,"Square root = " + outputRoot + "\n Square = " + outputsquare +"\n Error = " + outputError);
		}
	}
	 

