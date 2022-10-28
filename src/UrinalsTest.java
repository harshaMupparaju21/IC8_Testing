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

    @Test
    void badString() {
        Urinals urinals = new Urinals();
        assertFalse(urinals.goodString("100201"));
        assertFalse(urinals.goodString("00000000000000000000000000000000"));
        assertFalse(urinals.goodString(""));
        assertFalse(urinals.goodString("11111111111111111111111111111111"));
        assertFalse(urinals.goodString("92393921419204"));
        assertFalse(urinals.goodString("     "));
        assertFalse(urinals.goodString("12417sd"));
    }

    @Test()
    void main(){
        checkIfFileExists();
        goodString();
        badString();

    }
}
