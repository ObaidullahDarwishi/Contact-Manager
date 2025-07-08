import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContactManager cm = new ContactManager();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Contact Manager Menu =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Sort Contacts by Name");
            System.out.println("4. Find Contact by Name");
            System.out.println("5. Remove Contact");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");

            String choice = scan.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter name: ");
                    String name = scan.nextLine();

                    System.out.print("Enter phone number: ");
                    long phone = Long.parseLong(scan.nextLine());

                    System.out.print("Enter email address: ");
                    String email = scan.nextLine();

                    System.out.print("Enter home address: ");
                    String address = scan.nextLine();

                    System.out.print("Enter birthday: ");
                    String birthday = scan.nextLine();

                    System.out.print("Enter notes: ");
                    String notes = scan.nextLine();

                    cm.addContact(name, phone, email, address, birthday, notes);
                    System.out.println("Contact added successfully!");
                    break;

                case "2":
                    System.out.println("\n--- All Contacts ---");
                    cm.viewContacts();
                    break;

                case "3":
                    cm.sortContacts();
                    System.out.println("Contacts sorted by name!");
                    break;

                case "4":
                    System.out.print("Enter name to search for: ");
                    String searchName = scan.nextLine();
                    ContactManager.findContact(searchName);
                    break;

                case "5":
                    System.out.print("Enter name of contact to remove: ");
                    String nameToRemove = scan.nextLine();
                    cm.removeContact(nameToRemove);
                    break;

                case "6":
                    System.out.println("Goodbye!");
                    scan.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-6.");
            }
        }
    }
}
