import java.util.Scanner;

public class pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        char alphabet = 'A';
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(alphabet);
                col++;
            }
            System.out.println();
            row++;
            alphabet++;
        }
        sc.close();

    }
}