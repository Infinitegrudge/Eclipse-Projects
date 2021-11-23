import javax.swing.JOptionPane;
import java.util.*; 
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputText = JOptionPane.showInputDialog("Input a sentance");
		String reverseInput = "";
		List<String> cutUpInputString = new ArrayList<String>();
		List<String> cutUpOutPutString = new ArrayList<String>();
		List<String> palindromes = new ArrayList<String>();
		
		//Loop through and reverse the input
		for (int i = inputText.length(); i > 0 ; i--) {
			int index = i - 1;
			String reversedLetter = Character.toString(inputText.charAt(index));
			 reverseInput += reversedLetter;
		}
		
		//Cut up the strings
		cutUpOutPutString = cutUp(reverseInput,cutUpOutPutString);
		cutUpInputString = cutUp(inputText,cutUpInputString);
		
		//Compare the index's
		int reverseIndex = cutUpInputString.size() - 1;
		for (int i = 0; i < cutUpInputString.size();i++) 
		{
			if (cutUpInputString.get(i).equals(cutUpOutPutString.get(reverseIndex)) == true) {
				palindromes.add(cutUpInputString.get(i));
			}
			reverseIndex -= 1;
		}
	
	for (int i = 0; i < palindromes.size();i++) 
	{
		JOptionPane.showMessageDialog(null, palindromes.get(i) + " is a palindrome");
	}
	
	}

	
	 static List<String> cutUp(String toBeCut, List<String> cutList) {
		 
			int lastIndex = 0;
			
		 for (int i = 0; i < toBeCut.length();i ++) {
				
				int index = i;
				if (i == toBeCut.length() - 1) {
					index += 1;
				}
				if (toBeCut.charAt(i) == ' ' || i == toBeCut.length() - 1) {
					cutList.add(toBeCut.substring(lastIndex, index).trim());
					lastIndex = i;
				}
				
			}
		 return(cutList);
		 
	 }
}
