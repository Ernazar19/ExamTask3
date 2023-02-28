public interface PhoneInterface {
    void  turnOn();
    void  call1(int num);
    void  findByName(String name1);
   Contact searchContact(String name2);
  Contact updateName(String oldName,String newName);

    void getAllContacts();
}