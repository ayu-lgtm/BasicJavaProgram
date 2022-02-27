public class CountDistinctElement {
    public static void main(String args[]){
        int arr[]={1,2,3,4,3,2,1,4,5};

        int count=0;
        boolean dt=true;
        for(int i=1;i<arr.length;i++){
            for(int j=(i-1);j>=0;j--){
                if(arr[i]==arr[j]){
                    dt=false;
                    break;
                }
            }
            if(dt==false){
                count++;
            }
        }
        System.out.print(count);
    }
}
