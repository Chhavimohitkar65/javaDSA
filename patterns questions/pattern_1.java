import java.util.Scanner;

public class pattern_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows= sc.nextInt();

        System.out.println("Enter the number of column");
        int cols= sc.nextInt();

        int i = 1;
        while (i <= rows) {

            int j = 1;
            while (j <= cols) {
                System.out.print("*");
                j= j + 1;
            }
            System.out.println();
            i = i+1;
        }
        sc.close();
    }
}
