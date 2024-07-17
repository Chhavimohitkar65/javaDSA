package Strings;
import java.util.*;
public class concatination {
    
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        String last_name = sc.nextLine();
        String fullname = name + "" + last_name;
        System.out.println(fullname);
        // printing the length 
        System.out.println(fullname.length());

        //printing each character at of every  index
        //charAt
        for ( int i = 0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }

    }
}
