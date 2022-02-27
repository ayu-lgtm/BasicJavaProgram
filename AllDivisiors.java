class AllDivisiors{
    public static void main(String args[]){
        int number =30;
        int i;
        for(i=1;i*i<=number;i++){
            if(number%i==0){
                System.out.print(i+" ");
            }
        }
        i--;
        for(;i>=1;i--){
            if(number%i==0){
                System.out.print(number/i+" ");
            }
        }
    }
}