public class ArrayTOString {
    public static void main(String args[]) {
        char arr[]={'1','2','3'};
        String s=new String(arr); 
        System.out.println(s);

        char bp[]=s.toCharArray();
        System.out.println(bp);//dont use Arrays.toString in character array
    }
}
