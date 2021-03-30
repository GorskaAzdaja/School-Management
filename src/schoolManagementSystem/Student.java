package schoolManagementSystem;

/**
 * Student Entity class
 * @author Indigo
 *
 */
public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * Student entity constructor with id, name and grade fields
	 * Fees total for every student is $50,000
	 * @param id
	 * @param name
	 * @param grade
	 */
	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 50000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	/**
	 * Update student's grade
	 * @param grade
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/**
	 * Updates fees paid for a student
	 * @param fees
	 */
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	/**
	 * Getter for student id field
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * Getter for student name field
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for student grade field
	 * @return
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * Getter for student fees paid field
	 * @return
	 */
	public int getFeesPaid() {
		return feesPaid;
	}

	/**
	 * Getter for student fees total field
	 * @return
	 */
	public int getFeesTotal() {
		return feesTotal;
	}
	
	/**
	 * Returns remaining fees
	 * @return
	 */
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}

	@Override
	public String toString() {
		return "Student's name: " + name +
				"Total fees paid so far: $" + feesPaid;
	}
	
	
}
