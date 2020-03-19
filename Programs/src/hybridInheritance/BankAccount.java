package hybridInheritance;

public class BankAccount extends Asset {
	
	String Bank;
	Float Balance;
	
	void bankAccount() {
		
	}
	
	BankAccount(String Bank,Float balance){
		super(2,"savings");
		this.Bank=Bank;
		this.Balance=balance;
		System.out.println("Bank:"+Bank);
		System.out.println("Balance:"+Balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 BankAccount B1=new BankAccount("HDFC",14.23f);
 B1.bankAccount();
	}

}
