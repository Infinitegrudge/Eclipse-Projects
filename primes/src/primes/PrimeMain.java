package primes;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> primeNums = new ArrayList<Integer>();
		
		for (int i = 4; i< 1000;i++) {
			
			if (primeNums.size() == 0) {
				primeNums.add(2);
				primeNums.add(3);
			}
			boolean add = true;
			for(int g = 0; g < primeNums.size();g++) {
				if (primeNums.size() != 0) {
					if (i % primeNums.get(g) == 0) {
						add = false;
					}
					else if (g == primeNums.size() - 1 && add == true) {
						primeNums.add(i);
						System.out.println(i);
					}
				}
				
			}
		}
		
		String output = "";
		for(int i = 0; i < primeNums.size(); i++) {
			output += Integer.toString(primeNums.get(i)) + "\n";
		}
		JOptionPane.showMessageDialog(null, "1 " + output);

	}

}
