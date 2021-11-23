package Cellphone;
import javax.swing.JOptionPane;
public class CellPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    Cell p1 = new Cell();
			    p1.carrier = JOptionPane.showInputDialog("Input the carrier");
			    p1.type = JOptionPane.showInputDialog("Input the type");
			    p1.speed = JOptionPane.showInputDialog("Input the speed");
			    p1.memory = JOptionPane.showInputDialog("Input the memory");
			    p1.numApps = JOptionPane.showInputDialog("Input the number of apps");

			    System.out.println("Carrier = " + p1.carrier);
			    System.out.println("Type of phone = " + p1.type);
			    System.out.println("Speed of phone = " + p1.speed+"Ghz");
			    System.out.println("Memory = "+p1.memory+"Gb");
			    System.out.println("Number of Apps = "+p1.numApps);
			  }

	}
