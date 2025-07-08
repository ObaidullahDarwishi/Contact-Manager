import java.util.ArrayList;
import java.util.Iterator;

public class ContactManager {

    public static ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(String name, long phoneNumber, String emailAddress, String homeAddress, String birthDay, String notes) {
        Contact contact = new Contact(name, phoneNumber, emailAddress, homeAddress, birthDay, notes);
        contacts.add(contact);
    }

    public void removeContact(String nameToRemove) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(nameToRemove)) {
                contacts.remove(i);
                System.out.println("Contact \"" + nameToRemove + "\" removed successfully.");
                return;
            }
        }
        System.out.println("Contact \"" + nameToRemove + "\" not found.");
    }

    public void sortContacts() {
        if (contacts.size() < 2) return;
        mergeSort(contacts);
    }

    private static void mergeSort(ArrayList<Contact> list) {
        int inputLength = list.size();

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;

        ArrayList<Contact> leftHalf = new ArrayList<>();
        ArrayList<Contact> rightHalf = new ArrayList<>();

        for (int i = 0; i < midIndex; i++) {
            leftHalf.add(list.get(i));
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf.add(list.get(i));
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(list, leftHalf, rightHalf);
    }

    private static void merge(ArrayList<Contact> listToSort, ArrayList<Contact> leftHalf, ArrayList<Contact> rightHalf) {
        int leftSize = leftHalf.size();
        int rightSize = rightHalf.size();

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf.get(i).getName().compareToIgnoreCase(rightHalf.get(j).getName()) <= 0) {
                listToSort.set(k, leftHalf.get(i));
                i++;
            } else {
                listToSort.set(k, rightHalf.get(j));
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            listToSort.set(k, leftHalf.get(i));
            i++;
            k++;
        }

        while (j < rightSize) {
            listToSort.set(k, rightHalf.get(j));
            j++;
            k++;
        }
    }

    public static void findContact(String searchFor) {
        int index = binarySearch(contacts, searchFor);
        if (index != -1) {
            System.out.println("Found contact at index " + index + ": " + contacts.get(index));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void viewContacts() {
        Iterator<Contact> contactIterator = contacts.iterator();
        while (contactIterator.hasNext()) {
            Contact aContact = contactIterator.next();
            System.out.println(aContact.toString());
        }
    }

    public static int binarySearch(ArrayList<Contact> contactBook, String searchFor) {
        int left = 0;
        int right = contactBook.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Contact midContact = contactBook.get(mid);
            int cmp = midContact.getName().compareToIgnoreCase(searchFor);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
