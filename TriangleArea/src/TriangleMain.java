import javax.swing.JOptionPane;

public class TriangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(a + b + c) / 2
		JOptionPane.showMessageDialog(null, "The area of a triagle is calculated is (a+b+c)/2");
		double a = checkInput(JOptionPane.showInputDialog("Enter in a"));
		double b = checkInput(JOptionPane.showInputDialog("Enter in b"));
		double c = checkInput(JOptionPane.showInputDialog("Enter in c"));
		
		double total = (a+b+c)/2;
		JOptionPane.showMessageDialog(null, "total is: "+ total);
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
}
