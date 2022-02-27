public class DigitAfterPoint {
    public static void main(String args[]){
        float num = 12.345f;

        String s=Float.toString(num);

        int index=s.indexOf('.');

        System.out.print(s.substring(index));
    }
}
