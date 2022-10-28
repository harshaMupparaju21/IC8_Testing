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

    @Test()
    void main(){
        checkIfFileExists();

    }
}
