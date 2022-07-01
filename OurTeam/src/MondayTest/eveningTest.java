package MondayTest;

public class eveningTest {
	int a = 100;

	public static void main(String[] args) {
		eveningTest obj = new eveningTest();
		obj.TestOne();
	}
 public void TestOne () {
	 
	 if ( a<=20 && a>10)   {
		 System.out.println( "teen");
			 
		 
	 }
	 
 else if ( a<=30 && a>=21){
		 System.out.println( "Young");
	 }
	 else if ( a>=31 && a<=50) {
		 System.out.println( "older");
	 }
	 else if ( a == 100) {
		 System.out.println( "dead");
	 }
		 
	 
	 else {
		 System.out.println("wrong input");
	 }
	 
	 
 }
	
}
