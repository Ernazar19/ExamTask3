import java.util.Arrays;
import java.util.Scanner;

public class Phone implements PhoneInterface {
    private String brand;
    private String name;
    private int password;
    private Contact[] contacts;

    public Phone(String brand, String name, int password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public void turnOn() {
        System.out.println("Введите пароль ");
        int password1 = new Scanner(System.in).nextInt();
        if (password1 == password) {
            System.out.println("Телефон включился ");
        } else
            System.out.println("Парль невернный ");
    }

    @Override
    public void call1(int number) {
        for (Contact contact : contacts) {
            if (number == contact.getPhoneNumber()) {
                System.out.println("Звонок: " + contact.getPhoneNumber() + " " + contact.getFullName());
            }
        }
    }

    @Override
    public void findByName(String n) {
        for (Contact c : contacts) {
            if (n.equals(c.getFullName())) {
                System.out.println("Звонок: " + c.getFullName() + " " + c.getPhoneNumber());
            }
        }
    }

    @Override
    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getFullName().equals(name)) {
                System.out.println("Имя контакта :" + contact.getFullName());
            }
        }
        return null;
    }

    @Override
    public Contact updateName(String oldName, String newName) {
        for (Contact name:contacts) {
            if (name.getFullName().equals(oldName)) {
                name.setFullName(newName);
                return name;
            }
        }

        return null;
    }

    @Override
    public void getAllContacts() {
        for (Contact s:contacts) {
                System.out.println(s.getFullName()+" "+s.getPhoneNumber());
        }

    }
}
