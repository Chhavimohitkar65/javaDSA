import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int i = 1;
        int counting = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(counting);
                counting++;
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
