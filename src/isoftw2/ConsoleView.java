package isoftw2;

import java.util.ArrayList;

public class ConsoleView implements View {

	@Override
	public void show_contactList(ContactListModel list) {
		System.out.println("Contact list:");
		for (String contact : list.getContactList()) {
			show_contact(contact);
		}
		System.out.println("-------------");
	}

	@Override
	public void show_contact(String contact) {
		System.out.println(contact);

	}

	@Override
	public void show_contactNotFound() {
		// TODO Auto-generated method stub

	}

}
