import java.util.Stack;

public class StackCollection {  
    
    public static void main(String[] args) {
        Stack<Integer> result = new Stack<>();
        int a[]={10,20,30,40,50,60,70,80,90};
        for(int i=0;i < a.length;i++){
            result.push(a[i]);
        }
        while (!result.isEmpty()) {
            System.out.println(result.peek());
            result.pop();
        }
        
    }
}