package encapsulation;

public class EncapStudentOne {
	
	private String name;//variables should be declared as private//
    private	int id;
    
    //setters method//
    protected void setName(String name) {
    	this.name=name;
    }
	
    //getters method// 
    protected String getname() {
    	return  name;
    }
    
    protected void setId(int id) {
    	this.id=id;
    }
	
    protected int getId() {
    	return id;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapStudentOne s1=new EncapStudentOne();
		
		
		s1.setName("anu");
		System.out.println(s1.getname());
		s1.setId(40076533);
		System.out.println(s1.getId());
	
		
		
	}

}
