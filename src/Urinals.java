import java.io.File;

/**
 * @author Harsha Vardhan Mupparaju
 */
public class Urinals {

   public boolean checkIfFileExists(){
       String resource = "Urinals.dat";
       File file = new File(getClass().getClassLoader().getResource(resource).getFile());
       return file.exists();
   }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}