


public class CheckWetherStringofRotationIsSame {
    public static void main(String args[]){
        String str1 = "ABACD";
        String str2 = "CDABA";

        int l=str2.length()-1;
        while(l>=0){
            str1+=str2.charAt(l);
            l--;
        }
        System.out.print(str1.contains(str2));
    } 
}
