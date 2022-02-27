public class Fabinacci {
    public static void fib(int n){
        if(n==0){
            System.out.print(0+" ");
        }
        else if(n==1){
            System.out.print(0+" ");
            System.out.print(1+" ");
        }
        else{
            System.out.print(0+" ");
            System.out.print(1+" ");
            int a=0;
            int b=1;
            for(int i=2;i<=n;i++){
                System.out.print((a+b)+" ");
                int c=a+b;
                a=b;
                b=c;
            }
        }
    }

    //second method
    /*public static int fib2(int n){
        if(n==0||n==1){
            return 1;
        }
        fib2(n-1)+fib2(n-2);
    }*/
    public static void main(String args[]){
        int lim=10;

        fib(lim);

    }
}
