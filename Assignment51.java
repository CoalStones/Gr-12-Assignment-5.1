package assignment51;
import java.util.Scanner;

public class Assignment51 {
    
    public static int division(int dividend, int divisor,int quotient){
        if(dividend>0&&dividend-divisor>=0){
            quotient++;
            return division(dividend-divisor,divisor,quotient);
        }
        else {
            return(quotient);
        }
    }

    public static void main(String[] args) {
        Scanner noahSeer=new Scanner(System.in);
        int divisor, dividend,quotient=0,finalQuotient,remainder;
        System.out.println("Enter the dividend");
            dividend=noahSeer.nextInt();
        System.out.println("Enter a divisor");
            divisor=noahSeer.nextInt();
            
        finalQuotient=division(dividend,divisor,quotient);
        //System.out.println(divisor*finalQuotient);
        remainder=dividend-(divisor*finalQuotient);
        System.out.println("Quotient: "+finalQuotient);
        System.out.println("Remainder: "+remainder);
    }
}