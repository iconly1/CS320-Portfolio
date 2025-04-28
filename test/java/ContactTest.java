import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void validContactCreation() {
        Contact contact = new Contact("123", "Ian", "Coxon", "1234567890", "123 Main St");
        assertNotNull(contact);
        assertEquals("123", contact.getContactID());
    }

    @Test
    void invalidContactIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> 
            new Contact("12345678901", "Ian", "Coxon", "1234567890", "123 Main St")
        );
    }
}
