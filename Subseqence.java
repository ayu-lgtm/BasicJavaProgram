public class Subseqence {
    public static void sub(String s,String res){
        if(0==s.length()){
            System.out.print(res+" ");
            return;
        }
        sub(s.substring(1),res+s.charAt(0));
        sub(s.substring(1), res);
    }
    public static void main(String args[]){
        String s="ABC";
        sub(s,"");
    }
}
