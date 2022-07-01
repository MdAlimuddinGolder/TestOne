package teamTest;

public class SchoolTest {
	int Student = 51;
	int age = 50;
	int grade = 16;

	public static void main(String[] args) {
		SchoolTest obj = new SchoolTest();
		obj.Babu();
		obj.Alim();
		obj.hhh();

	}

	public void Babu() {

		if (Student <= 10) {
			System.out.println("they are genious");
		}

		else if (Student >= 20 && Student < 50) {
			System.out.println("they are medium");
		} else if (Student > 60 && Student < 100) {
			System.out.println("they are weak");
		}

		else {
			System.out.println("wrong input");
		}
	}

	public void Alim() {
		if ((age > 2 && age < 13) || (age <= 60) || (age == 25)) {
			if (age == 50 && age >= 30) {
				System.out.println("you are not teenage but act almost like teenage");
			}

			else {
				System.out.println("you are older");

			}

		} else {
			System.out.println("wrong input");

		}

	}
public void hhh() {
	if ((grade<10 && grade>=2 ) || ( grade>20) ||(grade>=30 && grade<=50)) {
		if (grade==35 && grade<=5) {
			System.out.println("you are tanager");
		}
		System.out.println("You are young");
	}
	else {
		System.out.println("wrong inpot");
	}
}
}
