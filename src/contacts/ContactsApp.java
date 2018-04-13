package contacts;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class ContactsApp {
    public static ContactsManager contacts = new ContactsManager();
    public static File contactsFile;
    public static boolean exitApp = false;
    private static Input input = new Input();


    public static void main(String[] args) {

        contactsFile = new File("data", "contacts.txt");
        contacts.add(contactsFile.read());
        System.out.println("Loaded " + contacts.getTotal() + " contacts");

       do {
           selection(menu());
       } while (!exitApp);

    }

    private static int menu() {
        System.out.print(
                       "1. View contacts.\n" +
                        "2. Add a new contact.\n" +
                        "3. Search a contact by name.\n" +
                        "4. Delete an existing contact.\n" +
                        "5. Exit.\n");

        return input.getInt("Enter an option (1-5): ", 1, 5);

    }

    private static void selection(int selected) {

        switch (selected) {
            case 1:
                System.out.println("You choose view.");
                view();
                break;
            case 2:
                System.out.println("You choose add.");
                add();
                break;
            case 3:
                System.out.println("You choose search.");
                search();
                break;
            case 4:
                System.out.println("You choose delete.");
                delete();
                break;
            case 5:
                System.out.println("You choose to leave me.");
                exit();
                break;

        }

    }

    private static void view() {

        System.out.println(
                String.format("%1$20s","NAME")  + " | " +
                        String.format("%1$15s","PHONE")  + " | " +
                        String.format("%1$25s","EMAIL")  + " | "
        );

        for(Contact contact : contacts.list()) {

            System.out.println(
            String.format("%1$20s",contact.getFullName()) + " | " +
            String.format("%1$15s", contact.getPhoneNumber())  + " | " +
            String.format("%1$25s",contact.getEmail()) + " |");

        }

        input.pressEnter("Press Enter to continue.");

    }

    private static void delete() {

    }

    private static void add() {

        String firstName = input.getString("Enter first name: ");
        String lastName = input.getString("Enter last name: ");
        String phoneNumber = input.getString("Enter phone number: ");
        String email = input.getString("Enter email address: ");

        contacts.add(new Contact(firstName, lastName, phoneNumber, email));

        input.pressEnter("Added contact.\n Press Enter to continue.");

    }

    private static void exit() {
        exitApp = true;
        System.out.println("Goodbye. Saving.....");
        contactsFile.overwrite(contacts.listString());
        System.out.println("Done.");
    }

    private static void search() {

    }


}

