public class RemoveDuplicates {
    public static void removeDuplicates(int arr[]){
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            } 
            
        }
        for(int i=0;i<res;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String args[]){
        int arr[]={1,1,2,3,4,4,5,6,7,7,8};
        removeDuplicates(arr);
    }
}
