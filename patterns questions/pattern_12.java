import java.util.Scanner;

public class pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n "); 
        int n = sc.nextInt();

        int row = 1;
        while(row<=n){
            int col = 1;
            while(col<=n){
                char ch = (char)('A'+ row + col - 2);
                System.out.print(ch);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}