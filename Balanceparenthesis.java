import java.util.ArrayDeque;

public class Balanceparenthesis {
    public static boolean ismatch(char a,char b){
        return ((a=='{' && b=='}') || (a=='[' && b==']') || (a=='(' && b==')'));

    }
    public static boolean check(){
        ArrayDeque<Character> st = new ArrayDeque<>();
        String s = "((()))";
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp=='[' || temp=='(' || temp=='{'){
                st.push(temp);
            }
            else{
                if(st.isEmpty()==true){
                    return false;
                }
                else if(ismatch(st.peek(),temp)==false){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return (st.isEmpty()==true);
    }
    public static void main(String args[]){
        System.out.print(check());
    }
}


