public class Palindrome {
    public static boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //recursive solution
    public static boolean recursiveCheck(String S,int s,int e){
        if(s>=e){
            return true;
        }
        return (S.charAt(s)==S.charAt(e) && recursiveCheck(S, s+1, e-1));
    }
    public static void main(String args[]){
        String arr="abba";

        System.out.println(ispalindrome(arr));
        System.out.println(recursiveCheck(arr,0,arr.length()-1));
    }
}



