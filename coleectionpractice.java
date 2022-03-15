import java.util.*;

class coleectionpractice  {
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>();
        List<Integer> bl = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(1);
        bl.add(2);
        bl.add(3);
        bl.add(4);
        //System.out.print(al.containsAll(bl));
        //Collections.sort(al,Collections.reverseOrder());
        //System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);

        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);

        l.addLast(3);
        l.offerFirst(4);
    

 
       
        /*System.out.println(al);

        System.out.println(al.stream().count());
        al.stream().distinct().forEach(x->System.out.println(x+" "));
        Collections.sort(al,(p,q)->p-q);
        System.out.println(al);


        ArrayList<String> brr=new ArrayList<>(Arrays.asList("abcs","dsc","dbsac","dbacsac","abc"));
       

        //brr.stream().filter(x->x.startsWith("d")).filter(x->x.endsWith("c")).sorted().limit(1).forEach(x->System.out.print(x+" "));

        ListIterator<String> I=brr.listIterator(brr.size());
        while(I.hasPrevious()){
            String n = I.previous();
            System.out.print(n+" ");
            I.set("abc");
            
        }
        I.add("pqr");
       
        System.out.print(I.previousIndex());
        System.out.print(I.nextIndex());
        System.out.print(brr);*/
    }
}
