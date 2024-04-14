package arrayssss;
import java.util.*;

public class print {
    public static void main (String args[]){

        int marks[] = new int [100];
        Scanner sc = new Scanner(System.in);

        System.out.println("length of array = " +marks.length);

        marks[0] = sc.nextInt(); // this is for phy marks
        marks[1] = sc.nextInt(); // this is for maths marks
        marks[2] = sc.nextInt(); // this is for chem marks
        marks[3] = sc.nextInt(); // this is for bio marks

        System.out.println("phy " + marks[0]);
        System.out.println("Maths " + marks[1]);
        System.out.println("Chem " + marks[2]);
        System.out.println("Bio " + marks[3]);

        //for upfating marks 
        marks[0] = sc.nextInt(); // this is for phy mar
        System.out.println("phy updated marks is " + marks[0]);

        // percentage 
        int percentage = (marks[0] + marks[1] + marks[2] + marks[3])/4;
        System.out.println("percentage = " + percentage);


    

    }
}
