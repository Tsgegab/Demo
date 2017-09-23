import java.util.Scanner;
import java.lang.String;
public class StringDemo{
    public static void main(String[] args){
        int lastNamelength;
        Character letter;
        String firstName = "Tsegab";
        String lastName = "Gebregziabher";
        Character ch1 = lastName.charAt(0);
        String firstName = lastName.concat("Tsegab");
        boolean a = lastName.equals("Gebregziabher");
        boolean d = lastName.equals("gebregziabher");
        int indexof = lastName.indexOf("br");
        int lastIndexof = lastName.lastIndexOf("r");
        int length = lastName.length();
        String toLowerCase = lastName.toLowerCase();
        String toUpperCase = lastName.toUpperCase();
        String replace = lastName.replace('e', 'o');
        String substring = lastName.substring(3);
        String substring_1 = lastName.substring (1,10);
        String trim = lastName = " Gebregziabher " ;
        String firstName = lastName.trim();
        System.out.println("Character at 0 index is: " + ch1);
        System.out.println("firstName");
        System.out.println("a");
        System.out.println("b");
        System.out.println("indexof");
        System.out.println("lastIndexof");
        System.out.println("length");
        System.out.println("toLowerCase");
        System.out.println("toUpperCase");
        System.out.println("replace");
        System.out.println("substring");
        System.out.println("substring_1");
        System.out.println("trim");
    }
}