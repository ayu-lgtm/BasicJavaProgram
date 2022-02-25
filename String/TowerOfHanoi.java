public class TowerOfHanoi {

    //disk 2 and rod A,B,C
    public static void TowerHanoi(int n,char a,char b,char c){
        if(n==1){
            System.out.println("Move 1 from "+ a +" to "+ c);
            return;
        }
        TowerHanoi(n-1, a, c, b);
        System.out.println("Move "+n+" from "+ a +" to "+ c);
        TowerHanoi(n-1, b, a, c);
    }

    // if rod are 4 then 
    public static void TowerHanoi(int n,char a,char b,char c,char d){
        if(n==0){
            return;
        }
        if(n==1){
            System.out.println("Move 1 from "+ a +" to "+ b);
            return;
        }
        TowerHanoi(n-2, a, b,d,c);
        System.out.println("Move "+(n-1)+" from "+ a +" to "+c );
        System.out.println("Move "+n+" from "+ a +" to "+ b);
        System.out.println("Move "+(n-1)+" from "+ c +" to "+ b);
        TowerHanoi(n-2, c,a,b,d);
    }
    public static void main(String args[]){
        TowerHanoi(3,'a','b','c');
        System.out.print("\n\n");
        TowerHanoi(4,'a','b','c','d');
    }
}
