import java.util.PriorityQueue;

public class Purcahse_max_item {
    public static void function(int arr[],int sum){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //o(n)
        for(int x:arr){
            pq.add(x);
        }

        int count=0;
        while(sum>=0 && pq.isEmpty()==false && pq.peek()<=sum){
            sum=sum-pq.poll();
            count++;
        }
        System.out.print(count);

    }
    public static void main(String args[]){
        int arr[]={5,1,7,3,4,6,2,8};
        int sum=10;
        function(arr,sum);
        
    }
}
