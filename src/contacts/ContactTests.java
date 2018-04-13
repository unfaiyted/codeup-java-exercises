package contacts;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class ContactTests {


    public static void main(String[] args ) {
//
//        File contactFile  = new File("data", "contacts.txt");
//        ArrayList<Contact> contacts;

        ContactsManager contacts = new ContactsManager();
        File contactFile  = new File("data", "contacts.txt");

        contacts.add(contactFile.read());


        System.out.println("Contact Name: "+ contacts.get(3).getFullName());
        System.out.println("Contact.toString: " + contacts.get(3).toString());


        Contact person1 = new Contact("Dane","Miller","2083520195","unfaiyted@gmail.com");

        contacts.add(person1);
        contacts.add(person1);
        contacts.add(person1);
        contacts.add(person1);

        System.out.println("4: "+ contacts.getLastId());

        contacts.delete(contacts.getLastId());

        contacts.add(person1);
        contacts.add(person1);
        contacts.add(person1);

        System.out.println("6: "+ contacts.getTotal());
        System.out.println("7: "+ contacts.getLastId());


        contacts.list();


       // contactFile.overwrite(contacts.list());
    }

}
