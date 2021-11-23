import javax.swing.JOptionPane;
public class EncryptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = JOptionPane.showInputDialog("Input a message");
		int which = (int)checkInput(JOptionPane.showInputDialog("1 Encryption\n2 Decryption"));
		int shift = (int)checkInput(JOptionPane.showInputDialog("Enter the shift"));
		String str = "";
		int len = msg.length();
		for(int i = 0;i<len; i++) {
			
			if (which == 1) {
				char c = (char) ((char)msg.charAt(i) + shift);
				if(c > 'z') {
					
					str +=(char)(msg.charAt(i)-(26-shift));
				}
				else {
					str += (char)(msg.charAt(i) + shift);
				}
			}
			else if (which == 2) {
				char c = (char) ((char)msg.charAt(i) - shift);
				if(c > 'z') {
					str +=(char)(msg.charAt(i)-(26-shift));
				}
				else {
					str += (char)(msg.charAt(i) + shift);
				}
			}
			
		}
		JOptionPane.showMessageDialog(null, "You message is " + str);
	}
	static double checkInput(String in) {
		try {
			Double output = Double.parseDouble(in);
			return output;
		}
		catch(Exception e){
			System.out.println("You did not enter a valid number");
			return 0;
		}

}
}
