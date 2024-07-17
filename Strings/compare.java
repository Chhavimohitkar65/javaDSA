package Strings;
import java.util.*;
public class compare {
    public static void main (String args[]){
         
        Scanner sc = new Scanner (System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        //.compareTo function is used to compare two strings
        // 3 case 
        //string 1 > string 2  wil return +ve value
        //string 1== string 2  wil return 0 value
        //string 1 < string 2   wil return -ve value

        if ( name1.compareTo(name2) == 0){
            System.out.println( "both strings are equal");

        } else{
            System.out.println( "both strings are not equal");
        }


    }
}
