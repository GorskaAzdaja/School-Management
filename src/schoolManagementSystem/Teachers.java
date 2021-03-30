package schoolManagementSystem;

/**
 * Class for keeping track of teachers
 * @author Indigo
 *
 */
public class Teachers {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Constructor for the teachers class
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Teachers(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	/**
	 * Getter for teacher id
	 * @return
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * Getter for teacher name
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/*
	 * Getter for teacher salary
	 * @return
	 */
	public int getSalary() {
		return this.salary;
	}
	
	/**
	 * Setter for teacher salary
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * Salaries for teachers from total money earned
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}

	@Override
	public String toString() {
		return "Teacher's name: " + name +
				"Teacher's salary: $" + salary +
				"Total salary earned so far: $" + salaryEarned;
	}
	
	
}
