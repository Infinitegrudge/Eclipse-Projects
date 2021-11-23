package FibonacciPackage;
import javax.swing.JOptionPane;

public class FibonacciMain {
	public static void main(String[] args) {
			int howMany = checkInput(JOptionPane.showInputDialog("What Fibonacci number do you want to see"));
			int output = calculation(howMany, 0 , 0, true);
			JOptionPane.showMessageDialog(null,"The " + howMany + " number in the Fibonacci sequence is " + output);
			System.out.println(howMany);
		
	}
	static int calculation(int timesLeft,int num1, int num2, boolean first) {
		//@47 - 223 Weird stuff happens
		if (timesLeft == 1 && first == true ) {
			return 1;
		}
		else if(timesLeft == 2 && first == true) {
			return 1;
		}
		else if (timesLeft == 0 && first == true) {
			return 0;
		}
		
		if (timesLeft >= 3 && first == true) {
			num1 = 1;
			num2 = 2;
			timesLeft -= 3;
		}
		
		//F(n) = F(n-1) + F(n-2)
		//Store num2 in variable and convert num1+2 to the next in the sequence
		int temp = num2;
		num2 = num2 + num1;
		num1 = temp;
		timesLeft -= 1;
		
		
		if (timesLeft <=0) {
			return num2;
		}
		else {
			return calculation(timesLeft,num1,num2, false);
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
