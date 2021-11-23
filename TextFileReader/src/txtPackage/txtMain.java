package txtPackage;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class txtMain {

	public static void main(String[] args) throws HeadlessException, IOException {
		// TODO Auto-generated method stub
		filereader(JOptionPane.showInputDialog("Input the filename"));

	}

	static void filereader(String fileName)throws IOException { 
		File file = new File(fileName +".txt");
		boolean isThere = file.exists();
		if (isThere == false) {
			JOptionPane.showMessageDialog(null, "File not found");
			return;
		}
		
		String data = "";
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				data+= reader.nextLine()
;			}
			System.out.println(data);
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "An error occured");
		}
		
	}
}

