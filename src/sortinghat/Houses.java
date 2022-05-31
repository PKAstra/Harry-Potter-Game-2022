package sortinghat;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author ajayr
 */
public class Houses {
    
    static String studentName = "";
    static String isBrave = "";
    static String isLoyal = "";
    static String lastQuestion;
    
    static ImageIcon welcome = new ImageIcon("pics/welcome.gif");
    static ImageIcon sortingHat = new ImageIcon("pics/sortingHat.png");
    static ImageIcon houses = new ImageIcon("pics/houses.gif");
    static ImageIcon gryffindor = new ImageIcon("pics/gryffindor.jpg");
    static ImageIcon hufflepuff = new ImageIcon("pics/hufflepuff.jpg");
    static ImageIcon ravenclaw = new ImageIcon("pics/ravenclaw.jpg");
    static ImageIcon slytherin = new ImageIcon("pics/slytherin.jpg");
    static ImageIcon pepe = new ImageIcon("pics/pepe.png");
    
    public static void welcome() {
        JOptionPane.showMessageDialog(null,"", "Welcome!" ,JOptionPane.INFORMATION_MESSAGE ,welcome);
    }
    
    public static void askName() {
                
        studentName = (String)JOptionPane.showInputDialog(null,"What's your name young they/them?", "Name",JOptionPane.QUESTION_MESSAGE, sortingHat,null,"");
        
        if (studentName == null){
            
            System.out.println("User selected \'Cancel\'");
        }
        else if ( studentName.equals("") ) {
            
            JOptionPane.showMessageDialog(null,"I ASKED WHAT IS YOUR NAME!!!", "Cmon Move It Along" ,JOptionPane.ERROR_MESSAGE, sortingHat);
            askName();
        }
        else   Houses.gryffindor();
    }   
    
    public static void gryffindor(){
                
        JOptionPane.showMessageDialog(null,null,"Houses",JOptionPane.INFORMATION_MESSAGE, houses);
        
        isBrave = (String)JOptionPane.showInputDialog(null,"Are you brave?", "Selection Process",JOptionPane.INFORMATION_MESSAGE, sortingHat, null, "");        
        

        if (isBrave == null){
            
            System.out.println("User selected \'Cancel\'");
        }        
        else if (isBrave.equalsIgnoreCase("yes")){
            
            JOptionPane.showMessageDialog(null,"Well " + studentName + ", looks like you're a Gryffindor!", "Gryffindor!" ,JOptionPane.INFORMATION_MESSAGE, gryffindor);
        }
        else if (isBrave.equalsIgnoreCase("no")){
            
            Houses.hufflepuff();
        }
        else {
            
            JOptionPane.showMessageDialog(null,"Yo brotha, can we stick to yes or no?", "2 Options" ,JOptionPane.ERROR_MESSAGE, sortingHat);
            Houses.gryffindor();
        }
    }
    
    public static void hufflepuff(){
        
        isLoyal = (String)JOptionPane.showInputDialog(null,"Well, are you loyal?", "Selection Process",JOptionPane.INFORMATION_MESSAGE, sortingHat, null, "");

        if (isLoyal == null){
            
            System.out.println("User selected \'Cancel\'");
        }
        else if (isLoyal.equalsIgnoreCase("yes") || isLoyal.equalsIgnoreCase("si")){
            
            JOptionPane.showMessageDialog(null,"Well " + studentName + ", looks like you're a Hufflepuff!!", "Hufflepuff!" ,JOptionPane.INFORMATION_MESSAGE, hufflepuff);

        }
        else if (isLoyal.equalsIgnoreCase("no")){
            
            Houses.lastQuestion();
        }
        else {
            
            JOptionPane.showMessageDialog(null, """
                                                Okay...Only 2 options here junior
                                                Maybe you speak another language
                                                Hay dos opciones, Si o No
                                                Elige solo uno por favor""", "2 Options" ,JOptionPane.ERROR_MESSAGE, sortingHat);
            Houses.hufflepuff();
        }
    }
        
       public static void lastQuestion(){
           
        lastQuestion = (String)JOptionPane.showInputDialog(null,"Hmmmm, do you seek knowledge or power?", "Last Question",JOptionPane.INFORMATION_MESSAGE, sortingHat, null, "");
        
        if (lastQuestion == null){
            
            System.out.println("User selected \'Cancel\'");
        }
        if (lastQuestion.equalsIgnoreCase("knowledge")){

            JOptionPane.showMessageDialog(null,"Well " + studentName + ", looks like you're a Ravenclaw!", "Ravenclaw!" ,JOptionPane.INFORMATION_MESSAGE, ravenclaw);

        }
        else if (lastQuestion.equalsIgnoreCase("power")){
  
            JOptionPane.showMessageDialog(null,"Well " + studentName + ", looks like you're a Slytherin!", "Slytherin!" ,JOptionPane.INFORMATION_MESSAGE, slytherin);
        }
        else {
   
            JOptionPane.showMessageDialog(null,"", "okayyy...." ,JOptionPane.INFORMATION_MESSAGE ,pepe);
        }
    }
}
