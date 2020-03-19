package staticandnonstatic;

public class AreaOfTriangle {

	     static float half= 0.5f;
		 int base=5;
		 int height=7;
		 
		 void area() {
			 System.out.println("Area of Rectangle is :"+(half * base * height));
			 	
			 
		 }

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			AreaOfTriangle obj3 = new AreaOfTriangle();
			obj3.base=6;
			obj3.height=9;
			obj3.area();
			
			AreaOfTriangle  obj4 = new AreaOfTriangle();
			obj4.area();
			
	

	}
}


