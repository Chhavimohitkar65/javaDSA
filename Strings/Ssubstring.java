package Strings;
import java.util.*;

public class Ssubstring {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String sentence = sc.nextLine();

        //substring( beg index , ending index)
        // hear we have given the end index as the last length of the string
        String name = sentence.substring(4, sentence.length());
        System.out.println(name);
    }
    
}
