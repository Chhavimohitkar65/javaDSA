package Strings;
import java.util.*;
public class sb_append {
    public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);

        sb.append('m');
System.out.println(sb);
    }
    
} 
