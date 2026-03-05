package controller;

import java.util.List;

import entities.Employee;
import services.EmployeeService;

public class MenuController {
	
	private EmployeeService service = new EmployeeService();
	
	public boolean addEmployee(Employee emp) {
		return service.addEmployee(emp);
		
	}
	
	public List<Employee> listEmployees() {
		return service.getAllEmployees();
	}
	
	public boolean updateSalary(int id, double newSalary) {
		return service.updateEmployeeSalary(id, newSalary);
	}
	
	public boolean removeEmployee (int id) {
		return service.removeEmployee(id);
	}
	
	public Employee findById (int id) {
		return service.findById(id);
	}
	
	public boolean employeeExists(int id) {
		return service.employeeExists(id);
	}
}
