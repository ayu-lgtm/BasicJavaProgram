import java.util.Stack;

public class BalanceParenthesis {
    public static boolean isMatching(char i,char j){
        if((i=='(' && j==')') || (i=='[' && j==']') || (i=='{' && j=='}')){
            return true;
        }
        return false;
    }
    public static void main(String args[]){

        String exp = "[()({[]})]";
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='(' ||exp.charAt(i)=='{' || exp.charAt(i)=='['){
                st.push(exp.charAt(i));
            }
            else{
                if(st.isEmpty()==true){
                    System.out.print("Unbalanced");
                    break;
                }
                else if(isMatching(st.peek(),exp.charAt(i))==true){
                    st.pop();
                }
                else{
                    System.out.print("Unbalanced");
                    break;
                }    
                
            }
        }
        if(st.isEmpty()==true){
            System.out.print("balanced");
        }else{
            System.out.print("Unbalanced");
        }
    }
}
