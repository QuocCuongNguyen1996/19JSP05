package jsp05_day7;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Student student = new Student("cuong", "Boy", 16);
		Student student1 = new Student("quan", "Boy", 17);
		Student student2 = new Student("bao", "Boy", 18);
		List<Student> student3 = new ArrayList<Student>();
		student3.add(student);
		student3.add(student1);
		student3.add(student2);

//		for(Student i: student3) {
//			System.out.println("List of value is: "+i.name+" and "+i.age);
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input name you want search: ");
		String searchName = sc.nextLine();

		nameSearch(student3, searchName);
		printSearch(nameSearch(student3, searchName));

	}

	static void printSearch(Student student3) {
		System.out.println(
				"Name of Student by search: " + student3.name + " , age is " + student3.age + " and gender is " + student3.gender);
	}

	static Student nameSearch(List<Student> student3, String searchName) {
		for (Student students : student3) {

			if (students.getName().equals(searchName))
				return students;
		}
		return null;
	}

}
