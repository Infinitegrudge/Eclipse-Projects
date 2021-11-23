package Pyramid;
import javax.swing.JOptionPane;

public class Wordmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = JOptionPane.showInputDialog("Enter in your word");
		System.out.println(word);
		reduce(word);
	}
	
	static String reduce(String str) {

		if (str.length()<=0) {
			return null;
		}
		else {
			String strNew = str.substring(0, str.length()-1); 
			if (strNew.length()<=0) {
				return null;
			}
			strNew = strNew.substring(1, strNew.length());
			
			System.out.println(strNew);
			if (strNew.length()<=0) {
				return null;
			}
			return reduce(strNew);
		}
		
		
		
	}

}
