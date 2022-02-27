import java.math.BigInteger;

class BigIntegerFactorial {
    public static void factorial(int a) {
        BigInteger b = new BigInteger("1");
        for (int i = 2; i <= a; i++) {
            BigInteger x = BigInteger.valueOf(i);
            b = b.multiply(x);
        }
        System.out.print(b);
    }

    public static void main(String args[]) {
        int a = 50;
        factorial(a);
    }
}