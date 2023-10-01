import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vale of n ");
        int n = sc.nextInt();

        int row = 1;
        char alphabet = 'A';
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(alphabet);
                col++;
                alphabet++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}