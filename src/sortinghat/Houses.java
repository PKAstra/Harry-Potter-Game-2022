package sortinghat;

import java.util.Scanner;
/**
 *
 * @author ajayr
 */
public class Houses {
    
    public static void gryffindor(String studentName){
        String isBrave;
        Scanner scnr = new Scanner(System.in);
    
        System.out.println("Are you brave?");
        isBrave = scnr.nextLine();                    
        if (isBrave.equalsIgnoreCase("yes")){
            System.out.println("Well " + studentName + ", looks like you're a Gryffindor!");
        }
        else if (isBrave.equalsIgnoreCase("no")){
            Houses.hufflepuff(studentName);
        }
        else {
            System.out.println("Yo brotha, can we stick to yes or no?");
            Houses.gryffindor(studentName);
        }
    }
    
    public static void hufflepuff(String studentName){
        
        Scanner scnr = new Scanner(System.in);
        String isLoyal;

        System.out.println("Well, are you loyal?");
        isLoyal = scnr.nextLine();

        if (isLoyal.equalsIgnoreCase("yes") || isLoyal.equalsIgnoreCase("si")){
            System.out.println("Well " + studentName + ", looks like you're a Hufflepuff!");
        }
        else if (isLoyal.equalsIgnoreCase("no")){
            Houses.lastQuestion(studentName);
        }
        else {
            System.out.println("Okay...." + "Only 2 options here junior");
            System.out.println("Maybe you speak another language");
            System.out.println("Hay dos opciones, Si o No");
            System.out.println("Elige solo uno por favor");
            Houses.hufflepuff(studentName);
        }
    }
        
       public static void lastQuestion(String studentName){
           
        Scanner scnr = new Scanner(System.in);
        String lastQuestion;
        
        System.out.println("Hmmm, do you seek knowledge or power?");
        lastQuestion = scnr.nextLine();  
        
        if (lastQuestion.equalsIgnoreCase("knowledge")){
            System.out.println("Well " + studentName + ", looks like you're a Ravenclaw!");
        }
        else if (lastQuestion.equalsIgnoreCase("power")){
            System.out.println("Well " + studentName + ", looks like you're a Slytherin!");
        }
        else {
        System.out.println("""
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ....@@&((((((((@@@@ ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   .. @@#(((((((((((((((((((@@ ..    ...   ....   ...    ...   ....   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   .. @@((((((((((((((((((((((((((@&....   ...    ...   ....   ...    ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ..@@@(((((((((((((((((((((((((((((((@@  ...   ....   ...    ...   ....   ...    ...   ....   ...
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   .. ,@@@@&((((((((((((((((((((((((((((((((((((@@ ..   ....   ...    ...   ....   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   .   .   .@@@((((((((((((((((((((((((((((((((((((((((((((@@@@#(((((((((@@# ...   ...    ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ,@@@@@@@@@@@@&(((((((((((((((((((((((((((((((((((((((&@@@@((((((((((((((((((((@@ ..   ....   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....  @@@@@@@((((((%@@((((((((((((((((((((((((((((((((@@#((((((((((((((((((((((((((((@@ ..    ...   ....   ...    ...   
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ... @%(((((((((&@@@@((((@@%(((((((((((((((((((((((@@@((((((((((((((((((((((((((((((((((@@/    ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...  @@@&%(((((((((((((@@@@((((((((((((((((((((((@@@((((((((((((((((((((((((((((((((((((((((@@ ..   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   .@@           @@@%((((#@(&@(((((((((((((((#@@&(((((((((((((((((((((((((((((((((((((((((((((@  ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ... @@         @@@@@@@@@@@(@(((@((((((((((%@@((((((((((((((((((((((((((((((((((((((((((((((((((@    ...    ...   ....   ...
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...@@(@      @@@#%@@@@@@@@@%@((((((((@@@%((((((&@@@%((((((((((((((((((((((((((((((((((((((((((((@   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ...    @(((@   @@@   @@@@@*&@@ ##((((@@#((((((((((((((((((@@&(((((((((((((((((((((((((((((((((((((((@ .   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...,@@((((@/#@@@@@@@#(@@@@  /@((((((((&@@%#(((((((((((#%@@@@@@&#((((((((((((((((((((((((((((((((((@ ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ...    ..@@@(@%(@(((((((@@@@@@@@@@@   @((((((((((((((@@@@@@@@((((((((((((((@@@((((((((((((((((((((((((((((((@@   ....   ...    ...   
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ... @@@((((((@%((((((((((((((@@@@    %@((((((((@@%     ,@#(((((((((((@@@((((((((@@(((((((((((((((((((((((((((@@  ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...  @@(@&((((((((((((((((((((((((((((&(((((((%@/            #@@@%(((((((((((#@((((((#@((((((((((((((((((((((((((@#.    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   .@(((@%(((((((((((((((((((&@@&((((((((((@(@@           &@@@@@@@@@@@&((((((((((@(((((&@(((((((((((((((((((((((((@ ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...@#(((@((((((((((((((((((((((@@@#&@(((((@(((((@@(      @@@@@   %@@@@@@@@#((((((((@(((((@((((((((((((((((((((((((@@    ...   ....   ...
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    .. @((((@((((((((((((((((#@&(((((((((((((((#@(((((((&@* @@@@@@@%(@@@@@@(@@@  @(((((((@((((@((((((((((((((((((((((((@    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   @((((@@((((((((((((((((((((((((((((((((((((@@%((((((((%@@@@@@@@@@ #@@@@@      @%((((%((@%(((((((((((((((((((((((@@...   ...    ...   
                               ...   ....   ...    ...   .... %@@@@&   ...   ....   ...    .. @@(((((@#(((((((((((((((((((((((((((((((((((@(((@@(((((((((((%@@@@@@@@(((((((((((@#(%@(@((((((((((((((((((((((((@@   ...   ....   ...
                           ....   ...    ...   ....   ... &@((((((((((@@  ...    ...   .... @@((@((((((@((((((((((((((((((((((((((((((((((&@(((((((@((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@@...   ...    ...   
                           ....   ...    ...   ....   %@%(((((((((((((((@ ...    ...   .... @(((((@((((((@@((((((((((((((((((((((((((((((((@%((((((((((#@%((((((((((((@@((((((((((((((((((((((((((((((((((((((@#...   ...    ...   
                               ...   .... &@@@@&&%((((((((((%@@@%((((((((@   ....   ...    .@(((((((@((((((((&@%((((((((((((((((((((((((((((@&((((((((((((((((&@@&((((((((((((((((((((((((((((((((((((((((((((@.   ...   ....   ...
                           ....   ...   @((((((((((((%@%((((#@@((((((((((@ ..    ...   .... @@((((((((@@((((((((((&@@(((((((((((((((((((((((((@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@ ...   ...    ...   
                               ...   .. @((((((((((((((((((((@@((((((((((@@# ....   ...    @((@((((((((((@@(((((((((((((&@@@((((((((((((((((((((@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@    ...   ....   ...
                               ...   .. @((((((((((((((((((((@@(((@@@@@(@@###(#(&@@@@@@@@@@((((#@(((((((((((@@#((((((((((((((((@@@&(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@    ...   ....   ...
                           ....   ...   @(((((((((((((((((((@@@((((((((@@##(#############@@(((((((@%((((((((((((@@(((((((((((((((((((((@@@%((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((#@....   ...    ...   
                               ...   . @@#@@@@@@@@@@@@@@@@#((((@@(((((@@#######(#########@@((((((((((@@(((((((((((((@@@(((((((((((((((((((((((#@@@@#((((((((((((((((((((((((@((((((((((((((((((((((((((((((((@#    ...   ....   ...
                           ....   ...@&((((((((((((((((((((((((((@@@@@@##(######(####(#(##@@(((((((((((((@%((((((((((((((#@@@(((((((((((((((((((((((((((((((@@@@@#((((@@@((((((((((((((((((((((((((((((((((((@ ....   ...    ...   
                           ....   ...@(((((((((((((((((((((((((((((@@@#####(#########(####@@((((((((((((((((&@@((((((((((((((((((@@@@#(((((((((((((((((((((((((((((((&@@(@@(((((((((((((((((((((((((((((((((&@ ....   ...    ...   
                               ...   .&&(((((((((((((((((((((((((&@@@@###(#(###############@@(((((((((((((((((((((@@%((((((((((((((((((((#@@@@@%#((((((((((((((((((((((((%@@((((((((((((((((((((((((((((((((@ .    ...   ....   ...
                           ....   ...   @(((((((%@@@@@&##((((((((((@@############(#####(###@@((((((((((((((((((((((((((((@@@@&(((((((((((((((((((((((((((((((((((((((((((&@((((((((((((((((((((((((((((((((@@  ....   ...    ...   
                               ...   ....@@@((((((((((((((((((((((&@(###(######(##(##(####((@(((((((((((((((((((((((((((((((((((((((@@@@@@&#((((((((((((((((((((((((((@@&((((((((((((((((((((((((((((((((((@/..    ...   ....   ...
                               ...   ....@(((((((((((((((((((((((@@################(#(###(##@@(((((((((((((((((((((((((((((((((((((((((((((((((((((#%&&@@@@@&&&&((((((((((((((((((((((((((((((((((((((((((%@...    ...   ....   ...
                           ....   ...   .@((((((((((((((((((((((@@@@###################(#####@%(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@    ....   ...    ...   
                               ...   ...*#(((((((((((((((((@@%(((((@(########################@@((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@( ...    ...   ....   ...
                           ....   ...    .@((((((((@@@@(((((((((((@@@@@#####(#(((#########(#(#@#((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((%@..   ....   ...    ...   
                           ....   ...    .. (@@@(((((((((((((((((%@ ...              /%&@@@@@@@@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((%@ ..   ....   ...    ...   
                               ...   ....    @(((((((((((((((((%@ .    ...   ....   ...    ...  @((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@    ...    ...   ....   ...
                           ....   ...    ... @&((((((((((((((@*.   ....   ...    ...   ....   ..@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@  ...   ....   ...    ...   
                               ...   ....   .. @@#((((#@@@@..   ...    ...   ....   ...    ...  #@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@(..   ...    ...   ....   ...
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   @(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@...   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   .../@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@    ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   .@((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@ ....   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ... @(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@..    ...   ....   ...    ...   
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ... ##(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@ ..    ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   .(&((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@    ....   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ... (%(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@( ...    ...   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   .&#(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@..   ....   ...    ...   ....   ...
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...   .@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@ ..   ....   ...    ...   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   ... @(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((%&&&%%@@.          .   ....   ...    ...   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...  /@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((#@@@@@@%#((((((((((((((((((((((((((((((%@@% .   ....   ...
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   .@%((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@@#   ...   
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....   (@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((@@%   
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ...@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((%
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....  @&((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ..@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    . @(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....  @(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                               ...   ....   ...    ...   ....   ...    ...   ....   ...    ..@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   .... *@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   .... (@(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                               ...   ....   ...    ...   ....   ...    ...   ....   ...     @((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                           ....   ...    ...   ....   ...    ...   ....   ...    ...   ....@@((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                           ___________________________________________________________________________________________________WELL THEN WTF ARE YOU!!______________________________________________________________________________""");
        }
    }
}