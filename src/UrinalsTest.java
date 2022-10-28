import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Harsha Vardhan Mupparaju
 */
public class UrinalsTest {
    @Test()
    void checkIfFileExists(){
        Urinals urinals = new Urinals();
        assertTrue(urinals.checkIfFileExists());
    }

    @Test
    void goodString() {
        Urinals urinals = new Urinals();
        assertTrue(urinals.goodString("10001"));
        assertTrue(urinals.goodString("1001"));
        assertTrue(urinals.goodString("00000"));
        assertTrue(urinals.goodString("0000"));
        assertTrue(urinals.goodString("01000"));
    }

    @Test
    void badString() {
        Urinals urinals = new Urinals();
        assertFalse(urinals.goodString("011"));
        assertFalse(urinals.goodString("10001100010"));
        assertFalse(urinals.goodString("100201"));
        assertFalse(urinals.goodString("00000000000000000000000000000000"));
        assertFalse(urinals.goodString(""));
        assertFalse(urinals.goodString("11111111111111111111111111111111"));
        assertFalse(urinals.goodString("92393921419204"));
        assertFalse(urinals.goodString("     "));
        assertFalse(urinals.goodString("12417sd"));
    }

    @Test
    void countUrinals() {
        Urinals urinals = new Urinals();
        assertEquals(1, urinals.countUrinals("10001"));
        assertEquals(0, urinals.countUrinals("1001"));
        assertEquals(3, urinals.countUrinals("00000"));
        assertEquals(2, urinals.countUrinals("0000"));
        assertEquals(1, urinals.countUrinals("01000"));
        assertEquals(-1,urinals.countUrinals("011"));
        assertEquals(-1, urinals.countUrinals("100201"));
        assertEquals(-1, urinals.countUrinals("00000000000000000000000000000000"));
        assertEquals(-1, urinals.countUrinals(""));
        assertEquals(-1, urinals.countUrinals("11111111111111111111111111111111"));
        assertEquals(-1, urinals.countUrinals("10001100010"));
        assertEquals(-1, urinals.countUrinals("     "));


    }

    @Test()
     void main() {
        checkIfFileExists();
        goodString();
        badString();
        countUrinals();

    }
}
