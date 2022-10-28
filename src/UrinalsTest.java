import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Harsha Vardhan Mupparaju
 */
public class UrinalsTest {
    @Test()
    void checkIfFileExists(){
        try {
            Urinals urinals = new Urinals();
            assertTrue(urinals.checkIfFileExists("Urinals.dat"));
            assertTrue(urinals.checkIfFileExists("rule.txt"));
            assertFalse(urinals.checkIfFileExists("urinal.dat"));
            assertFalse(urinals.checkIfFileExists("urinals.txt"));
            assertFalse(urinals.checkIfFileExists("rule.dat"));
            assertFalse(urinals.checkIfFileExists("harsha.dat"));
        } catch (NullPointerException e){
            System.out.println("File does not exist");
        }
    }

    @Test
    void goodString() {
        assertTrue(Urinals.goodString("10001"));
        assertTrue(Urinals.goodString("1001"));
        assertTrue(Urinals.goodString("00000"));
        assertTrue(Urinals.goodString("0000"));
        assertTrue(Urinals.goodString("01000"));
    }

    @Test
    void badString() {
        assertFalse(Urinals.goodString("011"));
        assertFalse(Urinals.goodString("10001100010"));
        assertFalse(Urinals.goodString("100201"));
        assertFalse(Urinals.goodString("00000000000000000000000000000000"));
        assertFalse(Urinals.goodString(""));
        assertFalse(Urinals.goodString("11111111111111111111111111111111"));
        assertFalse(Urinals.goodString("92393921419204"));
        assertFalse(Urinals.goodString("     "));
        assertFalse(Urinals.goodString("12417sd"));
    }

    @Test
    void countUrinals() {
        assertEquals(1, Urinals.countUrinals("10001"));
        assertEquals(0, Urinals.countUrinals("1001"));
        assertEquals(3, Urinals.countUrinals("00000"));
        assertEquals(2, Urinals.countUrinals("0000"));
        assertEquals(1, Urinals.countUrinals("01000"));
        assertEquals(-1,Urinals.countUrinals("011"));
        assertEquals(-1, Urinals.countUrinals("100201"));
        assertEquals(-1, Urinals.countUrinals("00000000000000000000000000000000"));
        assertEquals(-1, Urinals.countUrinals(""));
        assertEquals(-1, Urinals.countUrinals("11111111111111111111111111111111"));
        assertEquals(-1, Urinals.countUrinals("10001100010"));
        assertEquals(-1, Urinals.countUrinals("     "));
    }

    @Test()
     void main() {
        checkIfFileExists();
        goodString();
        badString();
        countUrinals();

    }
}
