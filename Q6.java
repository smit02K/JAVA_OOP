package oopsmock;

public class Q6 {
	public static void main(String[] args) {

		//method over loading
		add_calling add_obj =new add_calling();
		add_obj.add();
		add_obj.add(10);
		add_obj.add(20,30);
	}
}


//method over loading
class add_calling{


	public void add() {
		System.out.println("no arg");
	}
	public void add(int a) {
		System.out.println("one arg");
	}
	public void add(int a,int b) {
		System.out.println("two arg");
	}
}