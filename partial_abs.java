package oopsmock;

//public class partial_abs {
//
//}


abstract class sup{abstract void test();}

class sub extends sup{
	
	public void test() {
		System.out.println("this is for test");
	}
}

public class partial_abs {
	
	public static void main(String[] args) {
			
		sub a = new sub();
		a.test();
		sup b = new sub();
		b.test();
 }
}
