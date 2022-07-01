package LoopTest;

public class MyLoop {

	public static void main(String[] args) {
		MyLoop obj = new MyLoop();
		obj.FirstTest();
		obj.SecondTest();
		obj.ThirdTest();
	}

	public void FirstTest() {
		for (int i = 1; i <= 10; i= 1+i) {
			System.out.println("My name is khan"+i);
		}
		System.out.println("I am out side to the loop");
	}

	  public void SecondTest() {
		for (int i = 2; i < 15; i = i + 1)
			System.out.println("I am a stusent");
	}
      public void ThirdTest() {
		for (int i = 1; i < 10; i++) {
			if (i%2 == 0) {
				System.out.println("Even Number"+1);
				
			}else 
				System.out.println("Odd Number" + 1);
			}
		}
	}

