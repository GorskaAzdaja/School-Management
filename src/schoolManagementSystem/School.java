package schoolManagementSystem;

import java.util.List;

/**
 * School class containing multiple teacher and student objects
 * @author Indigo
 *
 */
public class School {
	
	private List<Teachers> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * Constructor for a school object with an ArrayList of Teachers and Students
	 * @param teachers
	 * @param students
	 */
	public School(List<Teachers> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}


	/**
	 * Returns the list of teachers in the school
	 * @return
	 */
	public List<Teachers> getTeachers() {
		return teachers;
	}

	/**
	 * Adds a teacher to the school
	 * @param teachers
	 */
	public void addTeachers(Teachers teachers) {
		this.teachers.add(teachers);
	}

	/**
	 * Returns list of students in school
	 * @return
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Adds students to the school
	 * @param students
	 */
	public void addStudents(Student students) {
		this.students.add(students);
	}

	/**
	 * Returns total money earned by the school
	 * @return
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	
	/**
	 * Updates total money earned by the school
	 * @param moneyEarned
	 */
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}

	/**
	 * Returns total money spent by the school (salaries)
	 * @return
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	
	/**
	 * Updates total money spent by the school
	 * @param moneySpent
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
	
}
