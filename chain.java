package oopsmock;

public class chain {
	
	 chain()
	    {
	        System.out.println("no argument");
	    }
	 
	    chain(int x)
	    {
	        
	        this();
	        System.out.println("one argument");
	    }
	 

	    chain(int x, int y)
	    {

	        this(5);
	        System.out.println("two argument");
	    }
	 
	    public static void main(String args[])
	    {
	   
	       new chain(8, 10);
	    }

}
