
import java.util.*;


class DuplicatesInString{
    public static void main(String args[]){
        String s="ABBABA";
        Set<Character> hs = new HashSet<>();
        int l=s.length()-1;
        int count=1;
        while(l>=0){
            if(hs.contains(s.charAt(l))){
                System.out.println("Duplicates "+count+" "+s.charAt(l)+" ");
                count++;
            }
            else{
                hs.add(s.charAt(l));
            }
            l--;
        }

        //using hashmap

       /* Map<Character,Integer> hm = new HashMap<Character,Integer>();

        int l1=s.length()-1;
        while(l1>=0){
            hm.put(s.charAt(l1),getOrDefault(s.charAt(l1),0)+1);
            l1--;
        }

        System.out.print(hm);*/
    }

    
}