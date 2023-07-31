package oopsmock;

//public class shad {
//
//}
class supp{
	
	public static void shadd() {
		System.out.println("shadowing sup");
	}
	public  void ride() {
		System.out.println("riding sup");
	}
}
class subb extends supp{
	
	public static void shadd() {
		System.out.println("shadowing sub");
	}
	public  void ride() {
		System.out.println("riding sub");
	}
}

public class shad {
	public static void main(String[] args) {
//		
		subb s1= new subb();
		s1.shadd();
		supp s2= new subb();
		s2.shadd();
		
		
		subb r1= new subb();
		r1.ride();
		supp r2= new supp();
		r2.ride();
//		supp r3= new subb();
//		r3.ride();
		
		
	}

}