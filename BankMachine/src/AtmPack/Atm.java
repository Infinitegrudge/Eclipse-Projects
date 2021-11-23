package AtmPack;

public class Atm {
	String bankName;
	double balance;
	double intrest;
	
	public Atm(String bank, double bal,double intrestRate) {
		balance = bal;
		bankName = bank;
		intrest =  intrestRate;
	}
	
	public void intrest(int time) {
		balance = balance*Math.pow((1+intrest),time);
	}
}
