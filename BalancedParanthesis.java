import java.util.Stack;

public class BalancedParanthesis {

    public static boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<>();

        for(char ch : expression.toCharArray()){
            if (ch=='(') {
                stack.push(ch);
            }else if (ch==')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }     
    public static void main(String[] args) {
        String str = "(((()))";
        System.out.println(isBalanced(str));
        
    }
}
