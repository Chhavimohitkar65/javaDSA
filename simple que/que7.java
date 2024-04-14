import java.util.Scanner;

//calculating the no of
public class que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans = ans * a;
        }
        System.out.println(ans);
        sc.close();
    }
}