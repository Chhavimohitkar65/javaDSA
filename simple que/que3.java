import java.util.Scanner;
// prime no 
public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            n = n%i;
            if (n == 0) {
                System.out.println("it is not a prime no");
            } else {
                System.out.println("it is a prime no ");
            }
        }

        sc.close();
    }
}
