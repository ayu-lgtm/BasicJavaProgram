public class Pangram {
    public static void main(String args[]){
        String s ="the quick brown fox jumps over the lazy dog";

        boolean arr[]=new boolean[26];

        for(int i=0;i<26;i++){
            arr[s.charAt(i)-'a']=true;
        }
        for(boolean x:arr){
            if(x==false){
                System.out.print("False");
                break;
            }
        }
        

    }
}
