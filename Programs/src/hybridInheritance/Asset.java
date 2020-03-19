package hybridInheritance;

public class Asset {

	
	int id;
	String type;
	
	void printDescription() {
		
	}
	
	Asset(int id,String type){
		this.id=id;
		this.type=type;
		System.out.println("id:"+id);
		System.out.println("type:"+type);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Asset A1=new Asset(2,"savings");
A1.printDescription();
	}

}
