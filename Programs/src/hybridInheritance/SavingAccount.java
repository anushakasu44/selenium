package hybridInheritance;

public class SavingAccount extends BankAccount {
	
	int rate;
	
	void rate() {
		}
	
	SavingAccount(int rate){
		super("hdfc",14.23f);
		this.rate=rate;
		System.out.println("savings account rate is:"+rate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount S1=new SavingAccount(12500);
		S1.rate();
	}

}
