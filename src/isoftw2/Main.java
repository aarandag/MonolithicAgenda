package isoftw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ConsoleView view = new ConsoleView();
		Controller controller = new Controller(new ContactListModel(), new ConsoleView());
		
		// Example data
		controller.addContact("Perico");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Please select an option (1-7): ");
		int selectedOption = sc.nextInt();
		switch(selectedOption) {
			case(1):
				System.out.println("Enter name: ");
				controller.addContact(sc.next());
				break;
			case(2):
				System.out.println("Enter name: ");
				String currentName = sc.next();
				System.out.println("Enter new name: ");
				String newName = sc.next();
				controller.editContact(currentName, newName);
				break;
			case(3):
				System.out.println("Enter name: ");
				controller.dropContact(sc.next());
				break;
			case(4):
				// TODO
			case(5):
				controller.show_contactList();
				break;
				
		}
		}

	}

}
