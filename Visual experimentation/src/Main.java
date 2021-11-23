
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = JOptionPane.showInputDialog("input\n hi");
		System.out.println(text);
		JOptionPane.showMessageDialog(null, "This is program");
		String space = " ";
		if (text == "") {
			System.out.println(true);
		}
	}

}
