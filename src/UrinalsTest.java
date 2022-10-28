import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Harsha Vardhan Mupparaju
 */
public class UrinalsTest {
    @Test
    void checkIfFileExists(){
        Urinals urinals = new Urinals();
        assertTrue(urinals.checkIfFileExists());
    }

    @Test
    void goodString() {
        Urinals urinals = new Urinals();
        assertTrue(urinals.goodString("10001"));
        assertTrue(urinals.goodString("1001"));
        assertTrue(urinals.goodString("1001"));
        assertTrue(urinals.goodString("0000"));
        assertTrue(urinals.goodString("01000"));
        assertTrue(urinals.goodString("011"));
    }

    @Test()
    void main(){
        checkIfFileExists();
        goodString();

    }
}
