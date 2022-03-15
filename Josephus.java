import java.util.*;

public class Josephus {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 8 ; i++) {
            al.add(i);
        }

        ListIterator<Integer> I = al.listIterator();

        while (al.size() > 1) {
            int count = 0;
            while (count < 2) {
                while (count < 2 && I.hasNext() == true) {
                    I.next();
                    count++;
                }
                if (count < 2) {
                    I = al.listIterator();
                    I.next();
                    count++;
                }
            }
            I.remove();
        }

        System.out.print(al.get(0));
    }
}
