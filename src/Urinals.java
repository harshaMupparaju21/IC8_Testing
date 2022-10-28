import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

/**
 * @author Harsha Vardhan Mupparaju
 */
public class Urinals {

    static List<String> urinalList = new ArrayList<>();

   public boolean checkIfFileExists(){
       try {
           String resource = "Urinals.dat";
           File file = new File(getClass().getClassLoader().getResource(resource).getFile());
           return file.getAbsolutePath().endsWith("/Urinals.dat");
       } catch (NullPointerException e){
           return false;
       }
   }

   public boolean goodString(String input){
       if(input.contains("11")){
           return false;
       }
       Pattern p = Pattern.compile("^[0-1]{1,20}$");
       Matcher m = p.matcher(input);
       return m.matches();
   }

   public int countUrinals(String urinal) {
       int count = 0;
       if (goodString(urinal) == false) {
           return -1;
       } else {
           int x, y = 0;

           StringBuffer urinalBuffer = new StringBuffer(urinal);

           for (int i = 0; i < urinalBuffer.length(); i++) {
               if (urinalBuffer.charAt(i) == '0') {
                   if (i == 0 || urinalBuffer.charAt(i - 1) == '0') {
                       x = 1;
                   } else {
                       x = 0;
                   }
                   if (i == urinalBuffer.length() - 1 || urinalBuffer.charAt(i + 1) == '0') {
                       y = 1;
                   } else {
                       y = 0;
                   }
                   if (x == 1 && y == 1) {
                       count++;
                       urinalBuffer.setCharAt(i, '1');
                   }
               }
           }
           return count;
       }
   }


    public static void main(String[] args) {
    }
}