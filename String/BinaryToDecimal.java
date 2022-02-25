public class BinaryToDecimal {
    public static void main(String args[]){
        String s ="1010";

        int n=Integer.parseInt(s,2);

        System.out.println(n);

        //second method
        
        int res=0;
        int l=s.length()-1;
        int count=0;
        while(l>=0){

            res+=Integer.parseInt(Character.toString(s.charAt(l)))*Math.pow(2,count);
            count++;
            l--;
        }
        System.out.println(res);
    }
}
