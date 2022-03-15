import java.util.ArrayDeque;
import java.util.Deque;

public class previousGreater {
    //greater span
    public static void fun(int arr[]){
        Deque<Integer> st = new ArrayDeque<>();
        st.push(arr[0]);
        int pg=-1;
        System.out.print(pg+" ");
        for(int i=1;i<arr.length;i++){
            while(st.isEmpty() == false && st.peek()<=arr[i]){
                st.pop();

            }
            pg= st.isEmpty()?-1:st.peek();
            System.out.print(pg+" ");
            st.push(arr[i]);
        }
    }
    //smaller span
    public static void func1(int arr[]){
        Deque<Integer> st = new ArrayDeque<>();
        st.push(arr[arr.length-1]);
        int pg=-1;
        for(int i=arr.length-2;i>=0;i--){
            while(st.isEmpty() == false && st.peek()<=arr[i]){
                st.pop();

            }
            pg= st.isEmpty()?-1:st.peek();
            System.out.print(pg+" ");
            st.push(arr[i]);
        }
        System.out.print(-1+" ");
    }
    public static void main(String args[]){
        int arr[]={15,10,18,12,4,6,2,8};
        fun(arr);
        System.out.println();
        func1(arr);
    }
}
