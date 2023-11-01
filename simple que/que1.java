import java.util.Scanner;
//sum of n numbers
public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num = n * (n + 1) / 2;
        }
        System.out.print(num);
        sc.close();
    }
}