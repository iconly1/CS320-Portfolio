import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    @Test
    void addAndGetContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "Ian", "Coxon", "1234567890", "123 Main St");
        service.addContact(contact);
        assertEquals(contact, service.getContact("123"));
    }

    @Test
    void deleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "Ian", "Coxon", "1234567890", "123 Main St");
        service.addContact(contact);
        service.deleteContact("123");
        assertNull(service.getContact("123"));
    }

    @Test
    void updateContactFirstName() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "Ian", "Coxon", "1234567890", "123 Main St");
        service.addContact(contact);
        service.updateFirstName("123", "Turtle");
        assertEquals("Turtle", service.getContact("123").getFirstName());
    }
}
