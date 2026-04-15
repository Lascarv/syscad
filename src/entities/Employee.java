package entities;

public class Employee {

	private final int id;
	private String name;
	private Double salary;

	
	public Employee (int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary ( Double salary ) {
		this.salary = salary;
	}
		
	@Override
	public String toString() {
		return "Id: " + id + " | Nome: " + name + " | Salário: " + salary;		
	}
}
