import java.io.File;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * @author Harsha Vardhan Mupparaju
 */
public class Urinals {

   public boolean checkIfFileExists(){
       String resource = "Urinals.dat";
       File file = new File(getClass().getClassLoader().getResource(resource).getFile());
       return file.getAbsolutePath().endsWith("/Urinals.dat");
   }

   public boolean goodString(String input){
       Pattern p = Pattern.compile("^[0-1]{1,20}$");
       Matcher m = p.matcher(input);
       return m.matches();
   }

    public static void main(String[] args) {

    }
}