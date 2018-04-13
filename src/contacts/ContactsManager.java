package contacts;

import java.util.HashMap;

public class ContactsManager {
    private HashMap<Integer, Contact> contacts = new HashMap<>();
    private static Integer lastId = 0;

    public ContactsManager() {
        this.contacts = new HashMap<>();
    }

    public Integer add(Contact newContact) {
        lastId += 1;
        this.contacts.put(lastId, newContact);
        return lastId;
    }

    public Integer delete(Integer id) {
        this.contacts.remove(id);
        return id;
    }

    public Contact getContact(Integer id) {
        Contact contact = this.contacts.get(id);
        return contact;
    }

}
