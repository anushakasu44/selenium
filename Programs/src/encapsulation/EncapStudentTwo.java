package encapsulation;

public class EncapStudentTwo  extends EncapStudentOne{
	
	private int phno;
	private  int appno;
	
	
	public void setPhno(int phno) {
		this.phno=phno;
		
	}
	
	public int getPhno() {
	return phno;
	}
	
public void setAppno(int appno) {
	this.appno=appno;
	
}
	
public int getAppno() {
	return appno;
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapStudentOne E1=new EncapStudentOne();
		E1.setId(500754);
		System.out.println(E1.getId());
		E1.setName("aru");
		System.out.println(E1.getname());
		
		EncapStudentTwo E2=new EncapStudentTwo();
		E2.setPhno(489585);
		System.out.println(E2.getPhno());
		
		E2.setAppno(2673);
		System.out.println(E2.getAppno());
		
		
	
	
	}

}
