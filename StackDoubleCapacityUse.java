
public class StackDoubleCapacityUse {

    public static void main(String[] args) throws StackEmptyException {
        
        StackDoubleCapacity stack = new StackDoubleCapacity(10);
        for(int i=1;i <= 30;i++){
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }
    
}