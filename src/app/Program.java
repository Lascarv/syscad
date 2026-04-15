package app;

import controller.MenuController;
import services.EmployeeService;
import ui.View;

public class Program {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		MenuController controller = new MenuController(service);
		View view = new View(controller);
		
		view.start();

	}
}