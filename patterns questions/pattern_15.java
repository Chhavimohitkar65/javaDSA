import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n = sc.nextInt();

       
        int row = 1;
        while (row <= n) {

            int col = 1;
            char ch = (char)('A'+ n - row);
            while (col <= row) {
                System.out.print(ch);
                ch++;
                col++;
            }

            System.out.println();
            row++;
        }
        sc.close();
    }
}