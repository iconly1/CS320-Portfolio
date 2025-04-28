import java.util.HashMap;

public class ContactService {
    private final HashMap<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactID())) 
            throw new IllegalArgumentException("Contact ID already exists");
        contacts.put(contact.getContactID(), contact);
    }

    public void deleteContact(String contactID) {
        contacts.remove(contactID);
    }

    public void updateFirstName(String contactID, String firstName) {
        contacts.get(contactID).setFirstName(firstName);
    }

    public void updateLastName(String contactID, String lastName) {
        contacts.get(contactID).setLastName(lastName);
    }

    public void updatePhone(String contactID, String phone) {
        contacts.get(contactID).setPhone(phone);
    }

    public void updateAddress(String contactID, String address) {
        contacts.get(contactID).setAddress(address);
    }

    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }
}
