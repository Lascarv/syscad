package services;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;

public class EmployeeService {

	List<Employee> list = new ArrayList<>();

	public boolean addEmployee(Employee emp) {
		if (findById(emp.getId()) != null){
			return false;}
		
			list.add(emp);
			return true;
	}
	

	public Employee findById(int id) {
		for (Employee e : list) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	public List<Employee> getAllEmployees() {
		return list;
	}

	public boolean updateEmployeeSalary(int id, Double newSalary) {

		Employee emp = findById(id);

		if (emp == null) {
			return false;
		}

		emp.updateSalary(newSalary);
		return true;
	}
	
	public boolean removeEmployee(int id) {
		
		Employee emp = findById(id);
		
		if (emp == null) {
			return false;
		}
		
		list.remove(emp);
			return true;
		}

	public boolean employeeExists(int id) {
		Employee emp = findById(id);
		return emp != null;
	}
}
