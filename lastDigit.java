public class lastDigit {
    public static void main(String args[]){
        int number =7830;
        
        int a =(int)Math.log10(number);
        int b=(int)Math.pow(10, a);

        int res=number/b;
        System.out.println(res);
    }
}
