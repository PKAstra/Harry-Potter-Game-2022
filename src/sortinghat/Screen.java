
package sortinghat;

import java.io.IOException;
import java.util.Scanner;

public class Screen {
    
    public void clearScreen(){  
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
    
    public void pause(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-\n");
        String input = scanner.nextLine();
    }
    
}
