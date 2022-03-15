import java.util.*;

class Mycmp implements Comparator<Map.Entry<Integer, Integer>> {
    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
        if (m1.getValue() == m2.getValue()) {
            return m1.getKey() - m2.getKey();
        } else {
            return m2.getValue() - m1.getValue();
        }
    }

}

public class KmostFrequent {

    public static void function2(int arr[], int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());

        Collections.sort(list, new Mycmp());

        System.out.print(list);
    }

    public static void main(String args[]) {
        int arr[] = { 6, 7, 6, 7, 6, 7, 4, 4, 2, 2, 3, 2, 5 };
        int k = 3;
        function2(arr, k);

    }
}
