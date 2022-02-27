public class PatternSearching {
    public static void main(String args[]){
        StringBuffer s=new StringBuffer("geeks for geeks");

       String p="geeks";

       int index=s.indexOf(p);
       while(index>=0){
           System.out.print(index+" ");
           index=s.indexOf(p,index+1);
       }
    }
}
