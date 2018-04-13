package contacts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactsManager {
    private HashMap<Integer, Contact> contacts;
    private static Integer lastId = 0;
    private static Integer total = 0;

    public ContactsManager() {
        this.contacts = new HashMap<>();
    }

    public Integer getLastId() {
        return lastId;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer add(Contact newContact) {
        lastId += 1;
        total += 1;
        this.contacts.put(lastId, newContact);
        return lastId;
    }

    /**
     * TODO: need to check if file format is bad....
     * @param contacts
     * @return
     */
    public boolean add(List<String> contacts) {

        for(String contactString: contacts) {
            String[] contact = contactString.split(",");
            Contact newContact = new Contact(contact[0], contact[1], contact[2], contact[3]);
            add(newContact);
        }
        return true;
    }

    public Integer delete(Integer id) {
        total -= 1;
        this.contacts.remove(id);
        return id;
    }

    public Contact get(Integer id) {
        Contact contact = this.contacts.get(id);
        return contact;
    }

    /**
    * Saved the current list of contacts to the file. Replaces
    * */
    public ArrayList<String> list() {

        ArrayList<String> contactList = new ArrayList<>();

        for(Map.Entry<Integer, Contact> contact: contacts.entrySet()) {
            Contact c = contact.getValue();

//         System.out.println(c.toString());

            contactList.add(c.toString());


        }

        return contactList;

    }


}
