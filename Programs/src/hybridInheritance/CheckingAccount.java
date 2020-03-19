package hybridInheritance;

public class CheckingAccount extends BankAccount{
	
	float draftlimit;
	
	void OverDraftLimit() {
		}
	
	
	CheckingAccount(float draftlimit){
		super("hdfc",14.23f);
		this.draftlimit=draftlimit;
		System.out.println("draft limit is:"+draftlimit);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount C1=new CheckingAccount(152.032f);
		C1.OverDraftLimit();
	}

}
