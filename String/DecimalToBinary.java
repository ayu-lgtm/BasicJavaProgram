public class DecimalToBinary {
    public static void main(String args[]){
        String s="12";
        int n = Integer.parseInt(s);
        String b = Integer.toBinaryString(n);
        System.out.println(b);

        //second method
        String res="";
        while(n>0){
            res=Integer.toString(n%2)+res;
            n=n/2;
        }
        System.out.println(res);

    }
}
