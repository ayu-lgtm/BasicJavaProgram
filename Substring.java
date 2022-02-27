public class Substring {
    public static void sub(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
    public static void main(String args[]){
        String s="ABCD";
        sub(s);
    }
}
