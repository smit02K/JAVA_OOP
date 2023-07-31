package onstage;

//class A {
//
//    String video= "xyz.mp4";
//    
//  
//}
//
//public class B {
// 
//	public static void main(String[] args) {
//		
//		A smit = new A();
//		System.out.println(smit.video);
//	
//		
//		smit.video="abc.mp4";
//		System.out.println(smit.video);
// 
//		
//	}
//	
//}


class A {

	String video= "xyz.mp4";
	
	
	public String getvideo() {
		return video;
	}

	public void setvideo(String video) {
		this.video=video;
	}


}

public class B {

	public static void main(String[] args) {

		A smit = new A();
		System.out.println(smit.getvideo());
		
		smit.setvideo("abc.mp4");
		System.out.println(smit.getvideo());
		

	}

}


















//smit.setvideo("abc.mp4");

//public String getvideo() {
//	   return video;
//}
// 
// public void setvideo(String video) {
// 	video=video;
// }
//
//  System.out.println(smit.getvideo());
