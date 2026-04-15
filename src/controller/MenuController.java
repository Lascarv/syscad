package controller;

import java.util.List;

import entities.Employee;
import services.EmployeeService;

public class MenuController {
	
	private final EmployeeService service;
	
	public MenuController(EmployeeService service) {
		this.service = service;
	}
	
	public boolean addEmployee(Employee emp) {
        if (emp == null) {
            return false;
        }
        return service.addEmployee(emp);
		
	}
	
	public List<Employee> listEmployees() {
		return service.getAllEmployees();
	}
	
	public boolean updateSalary(int id, Double salary) {
		return service.updateEmployeeSalary(id, salary);
	}
	
	public boolean removeEmployee(int id) {
		return service.removeEmployee(id);
	}
	
	public Employee findById(int id) {
		return service.findById(id);
	}
	
	public boolean employeeExists(int id) {
		return service.employeeExists(id);
	}
}
