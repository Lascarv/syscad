package ui;

import java.util.List;
import java.util.Scanner;

import controller.MenuController;
import entities.Employee;

public class View {

	private final MenuController controller;

	public View(MenuController controller) {
		this.controller = controller;
	}

	Scanner sc = new Scanner(System.in);

	public void start() {

		int option;

		System.out.println("Bem vindo ao SysCad!");

		do {
			showMenu();

			option = sc.nextInt();

			switch (option) {
			case 0:
				System.out.println("Encerrando o programa...");
				break;
			case 1:
				addEmployee();
				break;
			case 2:
				listEmployee();
				break;
			case 3:
				updateSalary();
				break;
			case 4:
				removeEmployee();
				break;
			default:
				System.out.println("Opção inválida, tente novamente!");
				break;
			}

		} while (option != 0);

		sc.close();
	}

	private void showMenu() {

		System.out.println("-----------------------------------------------------------");
		System.out.println("Digite os números a seguir para acessar as opções:\n");

		System.out.println("0 - Encerrar o programa");
		System.out.println("1 - Cadastrar funcionário");
		System.out.println("2 - Ver funcionários");
		System.out.println("3 - Ajustar salário");
		System.out.println("4 - Remover funcionário");
		System.out.println();
	}

	private void addEmployee() {

		System.out.println("Digite o ID para cadastrar: ");
		int id = sc.nextInt();
		sc.nextLine();

		if (controller.employeeExists(id)) {
			System.out.println("Já existe um funcionário com esse ID.");
			return;
		}

		System.out.println("Digite o Nome: ");
		String name = sc.nextLine();

		System.out.println("Digite o Salário: ");
		Double salary = sc.nextDouble();
		sc.nextLine();

		controller.addEmployee(new Employee(id, name, salary));
		System.out.println("Funcionário cadastrado!");

	}

	private void listEmployee() {

		List<Employee> list = controller.listEmployees();

		if (list.isEmpty()) {
			System.out.println("Nenhum funcionário encontrado.");
			return;
		}
		System.out.println("Exibindo funcionários: ");
		System.out.println();

		for (Employee e : list) {
			System.out.println(e);
		}
	}

	private void updateSalary() {

		System.out.println("Digite o ID para selecionar o funcionário: ");
		int id = sc.nextInt();
		sc.nextLine();

		if (!controller.employeeExists(id)) {
			System.out.println("Funcionário não encontrado");
			return;
		}

		System.out.println("Digite o novo salário: ");
		Double newSalary = sc.nextDouble();
		sc.nextLine();

		boolean success = controller.updateSalary(id, newSalary);

		if (success) {
			System.out.println("Salário alterado com sucesso.");
		} else {
			System.out.println("Erro ao alterar salário. Verifique se o valor é válido.");
		}

	}

	private void removeEmployee() {
		System.out.println("Digite o ID para remover: ");
		int id = sc.nextInt();
		sc.nextLine();

		boolean removed = controller.removeEmployee(id);

		if (removed) {
			System.out.println("Funcionário removido!");
		} else {
			System.out.println("Funcionário não encontrado");
		}

	}
}
