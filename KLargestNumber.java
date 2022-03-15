import java.util.PriorityQueue;

public class KLargestNumber {
    public static void funct(int arr[],int k){

        PriorityQueue<Integer> pq= new PriorityQueue<>();

        for(int x:arr){
            pq.add(x);
        }

        while(pq.size()>k){
            pq.poll();
        }

        while(pq.size()>0){
            System.out.print(pq.poll()+" ");
        }
        
    }
    public static void main(String args[]){
        int arr[]={8,6,4,10,9};
        int k=3;
        funct(arr,k);
        
    }
}
