public class SecondLargest {
    public static int slargest(int arr[]){
        int max=0;
        int res=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                res = max;
                max = arr[i];
            }
            else if(arr[i]!=arr[max]){
                if(res==-1 || arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={7,9,1,2,5,34,12,3,3,4,5};
        System.out.print(slargest(arr));
    }
}
