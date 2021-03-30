package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class SchoolSystem {

	public static void main(String[] args) {
		
		Teachers jessica = new Teachers(1, "Jessica", 500);
		Teachers jeremiah = new Teachers(2, "Jeremiah", 700);

		List<Teachers> teacherList = new ArrayList<>();
		teacherList.add(jessica);
		teacherList.add(jeremiah);
		
		
		Student john = new Student(1, "John", 4);
		Student jack = new Student(2, "Jack", 1);
		Student jimmy = new Student(3, "Jimmy", 3);
		Student james = new Student(4, "James", 2);
		Student jax = new Student(5, "Jax", 4);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(john);
		studentList.add(jack);
		studentList.add(jimmy);
		studentList.add(james);
		studentList.add(jax);
		
		
		School gymnazium = new School(teacherList, studentList);
		
		jax.payFees(200);
		jimmy.payFees(4000);
		System.out.println("School has earned $" + gymnazium.getTotalMoneyEarned());
		
		System.out.println("----------SCHOOL PAYS SALARIES----------");
		jessica.receiveSalary(jessica.getSalary());
		System.out.println("School has spent for salary to " + jessica.getName() + " and now has " + gymnazium.getTotalMoneyEarned());
		
		jeremiah.receiveSalary(jeremiah.getSalary());
		System.out.println("School has spent for salary to " + jeremiah.getName() + " and now has " + gymnazium.getTotalMoneyEarned());
	}

}
