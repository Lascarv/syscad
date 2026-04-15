package services;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;

public class EmployeeService {

	private List<Employee> list = new ArrayList<>();

	public List<Employee> getAllEmployees() {

		return new ArrayList<>(list);
	}

	public boolean addEmployee(Employee emp) {
		if (findById(emp.getId()) != null) {
			return false;
		}

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

	public boolean updateEmployeeSalary(int id, Double salary) {

		Employee emp = findById(id);

		if (emp == null) {
			return false;
		}

		emp.setSalary(salary);
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
