package isoftw2;

import java.util.ArrayList;
import java.util.Iterator;

public class ContactListModel implements Model {

	private ArrayList<String> contactList;
	
	public ContactListModel() {
		contactList = new ArrayList<String>();
	}

	public void addContact(String contact) {
		contactList.add(contact);
	}	
	public void dropContact(String contact) {
		contactList.remove(contact);
	}
	public void editContact(String contact, String newName) {
		contactList.remove(contact);
		contactList.add(newName);
	}
	public Integer searchContact(String contact) {
		return contactList.indexOf(contact);
	}
	
	@Override
	public Integer getUUID() {
		return contactList.hashCode();
	}
	
	public ArrayList<String> getContactList() {
		return contactList;
	}
}
