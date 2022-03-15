import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanProblem {
    public static void func(int arr[]){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(0);
        int span=1;
        System.out.print(span+" ");
        for(int i=1;i<arr.length;i++){

            while(dq.isEmpty()==false && arr[dq.peek()]<=arr[i]){
                dq.pop();
            }
            span = (dq.isEmpty())?(i+1):i-dq.peek();
            dq.push(i);
            System.out.print(span+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={13,15,12,14,16,8,6,4,10,30};
        func(arr);
    }
}
