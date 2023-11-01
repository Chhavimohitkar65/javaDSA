import java.util.Scanner;
// printing fibonacci series
public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n = sc.nextInt();
        int a =0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int nextnum = a+b;
            System.out.print(nextnum+ " ");
            a = b;
            b = nextnum;
        }
        
        sc.close();
    }
}





































 