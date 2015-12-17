import java.util.Calendar;
import java.util.Set;


public interface meeting {
	int getID();
	Calendar getDate();
	Set<Contact> getContacts();
}
