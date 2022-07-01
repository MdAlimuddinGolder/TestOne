
public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		obj.JustTest();
		obj.Alim();
	}
public void JustTest() {
	int a = 20;
	int b = 10;
	int c = a+b;
	System.out.println("print = " +c);
}
}
