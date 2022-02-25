import java.util.*;

class PatternSearchingProblem{
    public static void checkpattern(String s1,String s2){
        int pos = s1.indexOf(s2);
        while(pos>=0){
            System.out.print(pos+" ");
            pos=s1.indexOf(s2,pos+1);
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s1=sc.nextLine();

        String s2=sc.nextLine();

        checkpattern(s1, s2);//function for pattern search

        sc.close();
    }
}