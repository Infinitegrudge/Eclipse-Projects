import javax.swing.JOptionPane;

public class FactorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = checkInput(JOptionPane.showInputDialog("Enter how many objects you would like to choose from"));
		int num2 = checkInput(JOptionPane.showInputDialog("Enter how many objects there are to choose from"));
		int total = FactorialValue(1,1,num2)/(FactorialValue(1,1,num1)*(FactorialValue(1,1,num1)*FactorialValue(1,1,num2 - num1)));
		System.out.println(total);
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
	
	static int FactorialValue(int total, int next,int last) {
		int output = total * next;
		
		
		System.out.println("next value " + next + " output value " + output);
		next += 1;
		if (next == last) {
			return output;
			
		}
		else {
		return FactorialValue(output,next,last);

		}
	}

}
