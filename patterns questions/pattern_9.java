import java.util.Scanner;

public class pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
         
        int row = 1;
        while(row<=n){
            int col = 1;
            char ch = (char)('A'+ row - 1); //calculate the character based on the row number
            while(col<=n){
                System.out.print(ch);
                col++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}