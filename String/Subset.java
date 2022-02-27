public class Subset {
    public static void recursiveSubset(String s,String gen,int i){
        if(i==s.length())
        {
            System.out.print(gen+" ");return;
        }
        recursiveSubset(s, gen, i+1);
        recursiveSubset(s, gen+s.charAt(i), i+1);
    }
    public static void main(String args[]){
        String s="ABC";
        recursiveSubset(s,"",0);
    }
}
