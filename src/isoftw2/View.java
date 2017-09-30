package isoftw2;

import java.util.ArrayList;

public interface View {

	public void show_contactList(ContactListModel list);
	public void show_contact(String contact);
	public void show_contactNotFound();
	
}
