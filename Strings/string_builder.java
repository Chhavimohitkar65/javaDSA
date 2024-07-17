package Strings;
import java.util.*;

public class string_builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); 
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb);

        // char at 0 index
        System.out.println(sb.charAt(0));

        // set char
        sb.setCharAt(0, 'q');
        System.out.println(sb);

        //insert 
        sb.insert(2, "n");
        System.out.println(sb);

        //delete
        sb.delete(2, 3);
        System.out.println(sb);


        
    }
}
