import java.util.Scanner;

//dinary to decimal no conversion 
public class que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

            int exponent = 0;
            int base = 10;
            int ans = 0;
        

        while (n!= 0) {
            int bit= n & 1  ; // to get single single digit we are taking modulas
            // using the reverse formula
            //ans = (digit * Math.pow(base, exponent)) + ans;
            ans += (bit * Math.pow(base, exponent)) ;
            n = n>>1;
            exponent++;
        }
        System.out.println("Answer ="+ ans);
        sc.close();
    }

}