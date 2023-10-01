import java.util.Scanner;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        int row = 1;
        while(row<=n){
            int col = 1;
            while(col<=n){
                char ch = (char)('A'+ col-1);
                System.out.print(ch);
                col++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}