public class SubSequence {
    public static void Subseq(String s,String seq){
        if(s.length()==0){
            System.out.print(seq+" ");
            return;
        }
        Subseq(s.substring(1), seq+s.charAt(0));
        Subseq(s.substring(1), seq);
    }
    public static void main(String args[]){
        String s ="ABC";
        Subseq(s,"");
    }
}
