package hybridInheritance;

public class RealEstate extends Asset{
	
	float Area;
	
	void realestate() {
		
	}
	
	
	
	RealEstate(float Area){
		super(2,"savings");
		this.Area=Area;
		System.out.println("Area of the real estate is :"+Area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealEstate R1=new RealEstate (12.00f);
		R1.realestate();
	}

}
