import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact contact1 = new Contact(707403513, "Ernazar");
        Contact contact2 = new Contact(500596667, "Shabdan");
        Contact contact3 = new Contact(709869326, "Aizhan");
        Contact contact4 = new Contact(505325543, "Janar");
        Contact[] contacts = {contact1, contact2, contact3, contact4};
        Phone phone = new Phone("Apple", "IPHONE 14Pro", 4774, contacts);
        while (true) {
            switch (scanner.next()) {
                case "On":
                    phone.turnOn();
                break;
                case "CallNumber":
                    System.out.println("Введите номер контакта");
                    phone.call1(scanner.nextInt());
                    break;
                case "CallName":
                    System.out.println("Введите имя  контакта");
                    phone.findByName(scanner.next());
                    break;
                case "SearchName":
                    System.out.println("Поиск контакта");
                    phone.searchContact(scanner.next());
                    break;
                case "NewName":
                    System.out.println("Изменить имя контакта");
                    phone.updateName(scanner.next(), scanner.next());
                    break;
                case "MyContacts":
                    System.out.println("Контакты");
                    phone.getAllContacts();
                    break;
                default:
                    System.err.println("error");
            }
        }
    }
}