import java.util.Scanner;

public class pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        int i = 1;
        while(i<=n){
           int j = 1;
           while (j<=i){
            System.out.print(i-j+1);
            j++;
           }
           System.out.println();
           i++;
        }
        sc.close();
    }
}