import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Resistors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare the colors array
		String colors[] = new String[10];
		colors[0] = "black";
		colors[1] = "brown";
		colors[2] = "red";
		colors[3] = "orange";
		colors[4] = "yellow";
		colors[5] = "green";
		colors[6] = "blue";
		colors[7] = "violet";
		colors[8] = "grey";
		colors[9] = "white";
		
		//Cut up the string
		String input =JOptionPane.showInputDialog("What is your resistors color code? \n seperate your colors by hyphens \n ex. red-blue-yellow");
		String cutColor[] = input.split("-");
		
		//Display an error message if there are too many colors
		if (cutColor.length != 3) {
			JOptionPane.showMessageDialog(null, "You inputed more than 3 colors");
			System.exit(0);
		}
		
		//Loop through and translate the colors to numbers
				String values = "";
				for (int i = 0; i < cutColor.length- 1 ;i++) {
					
					for (int g = 0; g < colors.length - 1; g++) {
					if (cutColor[i].equals(colors[g]) == true) {
						values += g;
					}
					}
				}
				//Do the math
		int output = Integer.parseInt(values.substring(0, 1)) * 10 ^ Integer.parseInt(values.substring(1,2));
		JOptionPane.showMessageDialog(null, "your value is " + output + " ohms");
	}
}