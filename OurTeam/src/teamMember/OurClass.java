package teamMember;

public class OurClass {
	int aa = 12;
	int bb = 10;
	int cc = 20;
	String alim = " he is a student";

	public static void main(String[] args) {
		OurClass obj = new OurClass();
		obj.light();
		obj.paramiter(20, 30);
		obj.localVariable();

	}

	public void localVariable() {
		int gg = 15;
		int ll = 5;
		int v = bb + gg;
		int W = gg + ll;
		System.out.println(+v);
		System.out.println(+W);

	} 

	public void light() {
		int hhh = aa + bb;
		System.out.println("I want to see" + hhh);
	}

	public void paramiter(int j, int k) {
		int f = j + k;
		System.out.println(f);
	}
}
