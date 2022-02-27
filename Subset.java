public class Subset {
    public static void sub(String s,int i,String res){
        if(i==s.length()){
            System.out.print(res+" ");
            return;
        }
        sub(s,i+1,res);
        sub(s, i+1, res+s.charAt(i));
    }
    public static void main(String args[]){
        String s="ABC";
        sub(s,0,"");
    }
}
