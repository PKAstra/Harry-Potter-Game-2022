/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortinghat;

/**
 *
 * @author William
 */
import java.util.Scanner;
import java.util.Random;
public class SortingHat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Screen screen = new Screen();
        String studentName;
        String isBrave;
        String isLoyal="";
        String lastQuestion="";
                
        System.out.println("What's your name young they/them?");
                studentName = scnr.nextLine();
                    System.out.println(studentName + ", is it?");
                    System.out.println("Are you brave?");
                    isBrave = scnr.nextLine();
                    if (isBrave.equals("yes")){
                        System.out.println("Well " + studentName + ", looks like you're a Gryffindor!");
                    }
                    else if (isBrave.equals("no")){
                            System.out.println("Well, are you loyal?");
                        isLoyal = scnr.nextLine();
                    }
                    if (isLoyal.equals("yes")){
                        System.out.println("Well " + studentName + ", looks like you're a Hufflepuff!");
                    }
                    else if (isLoyal.equals("no")){
                        System.out.println("Hmmm, do you seek knowledge or power?");
                    lastQuestion = scnr.nextLine();
                    }
                    if (lastQuestion.equals("knowledge")){
                        System.out.println("Well " + studentName + ", looks like you're a Ravenclaw!");
                    }
                    else if (lastQuestion.equals("power")){
                        System.out.println("Well " + studentName + ", looks like you're a Slytherin!");
                    }
                    screen.pause();
    }
    
}




























