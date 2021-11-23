import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LCDMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the numerator"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the dennominator"));
		ArrayList<Integer> nums1 = factors(num1);
		ArrayList<Integer> nums2 = factors(num2);
		int highest = 0;
		for(int i = 0; i<nums1.size();i++) {
			for(int g = 0; g<nums2.size();g++) {
				if (nums1.get(i) == nums2.get(g)) {
					if (nums1.get(i)> highest) {
						highest = nums1.get(i);
					}
				}
			}
		}
		System.out.println("Reduced to " + num1/highest + " / " + num2/highest);

	}
	
	static ArrayList<Integer> factors(int num) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i = 1; i <= num; ++i) {

		      // if number is divided by i
		      // i is the factor
		      if (num % i == 0) {
		        nums.add(i);
		      }
		}
		return nums;
	}

}
