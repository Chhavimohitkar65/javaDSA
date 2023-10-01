import java.util.Scanner;

public class pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of n ");
        int n = sc.nextInt();
        char aplhabet = 'A';
        int row = 1;
        while(row<=n){
            int col = 1;
            while(col<=n){
                char ch = (char)(aplhabet);
                System.out.print(ch);
                aplhabet++;
                col++;
            }
            System.out.println();
            row++;
        }
        sc.close();

    }
}