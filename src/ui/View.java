package ui;

import java.util.List;
import java.util.Scanner;

import controller.MenuController;
import entities.Employee;

/**
 * Classe responsável pela interação com o usuário. Aqui ficam as operações com
 * o menu e entrada/saída de dados.
 */

public class View {

	// Controller responsável por intermediar a comunicação com o service.
	MenuController controller = new MenuController();

	// Scanner responsável por inserir os dados digitados pelo usuário.
	Scanner sc = new Scanner(System.in);

	/**
	 * Inicia o menu principal. O menu permanece em execução até o usuário escolher
	 * a opção 0.
	 */
	public void start() {

		int option;

		System.out.println("Bem vindo ao SysCad!");

		do {
			showMenu();

			option = sc.nextInt();

			// Direciona para o método correspondente à opção escolhida
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
	
	// Exibe as opções do menu.
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

	/**
	 * Método responsável por cadastrar um novo funcionário. Antes de cadastrar,
	 * verifica se já um funcionário com o ID informado.
	 */
	private void addEmployee() {

		System.out.println("Digite o ID para cadastrar: ");
		int id = sc.nextInt();
		sc.nextLine();

		/**
		 * Verifica se já existe um funcionário com esse ID antes de seguir com as
		 * próximas etapas do cadastro.
		 */
		if (controller.employeeExists(id)) {
			System.out.println("Já existe um funcionário com esse ID.");
			return;
		}

		System.out.println("Digite o Nome: ");
		String name = sc.nextLine();

		System.out.println("Digite o Salário: ");
		double salary = sc.nextDouble();
		sc.nextLine();

		// Cria o objeto funcionário e envia para o controller.
		controller.addEmployee(new Employee(id, name, salary));
		System.out.println("Funcionário cadastrado!");

	}

	/**
	 * Lista todos os funcionários cadastrados. Antes de listar, verifica se a lista
	 * está vazia.
	 */
	private void listEmployee() {

		List<Employee> list = controller.listEmployees();

		// Verifica se a lista está vazia.
		if (list.isEmpty()) {
			System.out.println("Nenhum funcionário encontrado.");
			return;
		}
		System.out.println("Exibindo funcionários: ");
		System.out.println();

		// Percorre a lista exibindo cada funcionário.
		for (Employee e : list) {
			System.out.println(e);
		}
	}

	/**
	 * Atualiza o salário de um funcionário a partir de um ID informado. Antes de
	 * atualizar, verifica se o ID informado existe.
	 */
	private void updateSalary() {

		System.out.println("Digite o ID para selecionar o funcionário: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		// Verifica se o funcionário existe antes de atualizar o salário.
		if (!controller.employeeExists(id)) {
			System.out.println("Funcionário não encontrado");
			return;
		}

		System.out.println("Digite o novo salário: ");
		double newSalary = sc.nextDouble();
		sc.nextLine();

		controller.updateSalary(id, newSalary);
		System.out.println("Salário alterado com sucesso.");
	}

	/**
	 * Remove um funcionário do sistema a partir do ID informado.
	 */
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
