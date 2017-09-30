package isoftw2;

public class Controller {

	private ContactListModel listModel;
	private View view;
	
	public Controller(ContactListModel model, View view) {
		this.listModel = model;
		this.view = view;
	}
	
	public void addContact(String contact) {
		listModel.addContact(contact);
	}
	
	public void dropContact(String contact) {
		listModel.dropContact(contact);
	}
	
	public void editContact(String contact, String newName) {
		listModel.editContact(contact, newName);
	}
	
	public void show_contactList() {
		view.show_contactList(listModel);
	}
}
