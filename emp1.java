package oopsmock;


class esal{
  private double sal = 80000.0;
  
  public double getSal(){
      return sal;
  }
  public void setSal(double sal){
      this.sal = sal;
  }
}

class emp1 {
  int empId;
  String empName;
  private double sal;
  
  emp1(int empId,String empName,double sal){
      this.empId = empId;
      this.empName = empName;
      this.sal =sal;
  }
  
  {
      System.out.println("=======================");
  }
  
  public static void main(String[] args) {
      
  	esal sref1 = new esal();
      sref1.setSal(200000.0);
      
      emp1 ref1 = new emp1(1,"smit",sref1.getSal());
      System.out.println(ref1.empId);
      System.out.println(ref1.empName);
      System.out.println(sref1.getSal());
          
      esal sref2 = new esal();
      sref2.setSal(400000.0);
      
      emp1 ref3 = new emp1(2, "deven",sref1.getSal());
      System.out.println(ref3.empId);
      System.out.println(ref3.empName);
      System.out.println(sref2.getSal());
      
      
  }
 

}
