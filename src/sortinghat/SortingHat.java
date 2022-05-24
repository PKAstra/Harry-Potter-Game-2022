package sortinghat;

/**
 *
 * @author William
 */
import java.util.Scanner;
public class SortingHat {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Screen screen = new Screen();
        String studentName;       
        
        System.out.println("What's your name young they/them?");
        studentName = scnr.nextLine();
        System.out.println(studentName + ", is it?");
        Houses.gryffindor(studentName);
        
        screen.pause();           
    }
          
}
  




























