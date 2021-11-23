import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class QuotesMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> quotes = new ArrayList<String>();
		String fileName = JOptionPane.showInputDialog("Input quotes file");
		filereader(fileName,quotes);
		int len = quotes.size();
		Random rand = new Random();
		int randentry = rand.nextInt(len);
		
		System.out.println(quotes.get(randentry));
		

	}
	static ArrayList<String> filereader(String fileName,ArrayList<String> out)throws IOException { 
		File file = new File(fileName +".txt");
		boolean isThere = file.exists();
		if (isThere == false) {
			JOptionPane.showMessageDialog(null, "File not found");
			return null;
		}
		
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				out.add(reader.nextLine());
;			}
			return out;
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "An error occured");
			return null;
		}
		
	}

}
