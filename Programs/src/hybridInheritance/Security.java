package hybridInheritance;

public class Security extends Asset {
	
	String tradeExchangename;
	
	void security() {
		
	}
	
	Security(String tradeExchangename){
		super(2,"savings");
		this.tradeExchangename=tradeExchangename;
		System.out.println("tradeExchangename:"+tradeExchangename);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Security S1=new Security("HDFCitrade");
		S1.security();
	}

}
