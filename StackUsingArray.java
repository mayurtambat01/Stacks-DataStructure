public class StackUsingArray {
    
    int data[];
    int top;

    public StackUsingArray(){
        data = new int[10];
        top = -1;
    }

    public StackUsingArray(int capacity){
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
        // return (top == -1);
    }

    public int size(){
        return top + 1;
    }

    public int top() throws StackEmptyException{
        if (size()==0) {
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[top];
    }

    public void push(int elem) throws StackEmptyException{
        if (size()==data.length) {
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        top++;
        data[top] = elem;
    }

    public int pop() throws StackEmptyException{
        if (size()==0) {
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        int temp = data[top];
        top--;

        return temp;
    }
}