import java.util.Scanner;

public class DigitAfterDecimalPoint {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        String s= Double.toString(num);
        
        System.out.print(s.substring(s.indexOf('.')+1));//after decimal digits
        sc.close();
    }
}
