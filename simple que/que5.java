import java.util.Scanner;
 //Decimal to Binary
public class que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
       
        int exponent = 0, base =2 , ans =0 ;
     // here we are multiplying

        while( n!=0){
            
            //int bit = n & 1; we need to take digit and moudulas
            int digit = n % 10;
            if(digit == 1){
                 ans +=  Math.pow(base, exponent) ;
            }
           
            // n = n<<1; here we will divide 
            n = n/10;
            exponent++;
        }
        System.out.println("answer "+ ans);
        sc.close();
    }
}