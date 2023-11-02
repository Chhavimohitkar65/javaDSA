import java.util.Scanner;

public class que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of num 1");
        int n1 = sc.nextInt();
        System.out.println("enter the value of num2");
        int n2 = sc.nextInt();
        System.out.println("enter the operation +,-,*,/");
        char character = sc.next().charAt(0);
        switch (character) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;

            default:
                System.out.println("plz enter the valid operation");
                break;
        }
        sc.close();
    }

}