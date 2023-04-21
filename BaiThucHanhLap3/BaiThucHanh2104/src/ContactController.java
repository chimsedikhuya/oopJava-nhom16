import java.util.ArrayList;
import java.util.Scanner;

interface PhoneBook {
    public void addContact(String name, String phoneNumber);
    public void updateContact(String name, String phoneNumber);
    public void deleteContact(String name);
    public void findContact(String name);
}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class PhoneBookManager implements PhoneBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
    }

    public void updateContact(String name, String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.setPhoneNumber(phoneNumber);
                break;
            }
        }
    }

    public void deleteContact(String name) {
        Contact contactToRemove = null;
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contactToRemove = contact;
                break;
            }
        }
        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
        }
    }

    public void findContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Tim kiem " + name + " thong tin " + contact.getPhoneNumber());
                return;
            }
        }
        System.out.println(name + " Lien he khong ton tai.");
    }

    public void printContacts() {
        System.out.println("Thong tin lien he:");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " " + contact.getPhoneNumber());
        }
    }
}

public class ContactController {
    public static void main(String[] args) {
        PhoneBookManager phoneBookManager = new PhoneBookManager();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nQuan li danh ba");
            System.out.println("1. Them lien he");
            System.out.println("2. Chinh sua lien he");
            System.out.println("3. Xoa lien he");
            System.out.println("4. Tim kiem lien he");
            System.out.println("5. In thong tin lien he");
            System.out.println("6. Exit");
            System.out.print("Chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhap ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap so dien thoai: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBookManager.addContact(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Nhap ten: ");
                    name = scanner.nextLine();
                    System.out.print("Nhap so dien thoai: ");
                    phoneNumber = scanner.nextLine();
                    phoneBookManager.updateContact(name, phoneNumber);
                    break;
                case 3:
                    System.out.print("Nhap ten: ");
                    name = scanner.nextLine();
                    phoneBookManager.deleteContact(name);
                    break;
                case 4:
                    System.out.print("Nhap ten: ");
                    name = scanner.nextLine();
                    phoneBookManager.findContact(name);
                    break;
                case 5:
                    phoneBookManager.printContacts();
                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Khong kha dung, hay thu lai.");
                    break;
            }
        }
        scanner.close();
    }
}

