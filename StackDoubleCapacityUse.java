
public class StackDoubleCapacityUse {

    public static void main(String[] args) {
        
        StackDoubleCapacity stack = new StackDoubleCapacity(10);
        for(int i=1;i <= 30;i++){
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (StackEmptyException e) {
                // Never Reach Here
            }
        }
    }
    
}