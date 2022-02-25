public class ReverseString {
    public static void main(String args[]){
        //letter reverse
        String s= "Ayush rastogi";
        int n=s.length()-1;
        String temp="";

        while(n>=0){
            temp+=s.charAt(n);
            n--;
        }
        System.out.println(temp);

        //word reverse

        String tempk="";
        int k=s.length()-1;
        while(k>=0){
            tempk=s.charAt(k)+tempk;
            k--;
        }
        System.out.print(tempk);

    }
}
