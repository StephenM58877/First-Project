
public class ContactImpl implements Contact{
	private int id;
	private String name;
	private String notes;

public ContactImpl(int id, String myName, String myNotes){
	this.id=id;
	this.name=myName;
	this.notes=myNotes;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getNotes() {
	return notes;
}

public void setNotes(String notes) {
	this.notes = notes;
}
}