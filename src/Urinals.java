import java.io.File;

/**
 * @author Harsha Vardhan Mupparaju
 */
public class Urinals {

   public boolean checkIfFileExists(){
       String resource = "Urinals.dat";
       File file = new File(getClass().getClassLoader().getResource(resource).getFile());
       return file.getAbsolutePath().endsWith("/Urinals.dat");
   }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}