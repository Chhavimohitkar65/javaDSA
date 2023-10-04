import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n = sc.nextInt();

        int row = 1;
        while(row<=n){

            //printing the space
            int space = 1;
            while(space<=n-row){
                System.out.print(" ");
                space++;
            }

            //printing the stars
            int col = 1;
            while(col<=row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
        sc.close();

    }
}