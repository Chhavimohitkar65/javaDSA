import java.util.Scanner;

public class pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n = sc.nextInt();
        int count = 1;
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print(count);
                count++;
                j++;
            }
            System.out.println();
            i++;
        }

    }
}