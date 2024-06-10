
public class StackUsingLinkedList<T> {

    Node<T> head;
    int size;

    public StackUsingLinkedList(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public T top() throws StackEmptyException{
        if (size()==0) {
            throw new StackEmptyException();
        }
        return head.data;
    }

    public void push(T elem){
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop() throws StackEmptyException{
        if (size()==0) {
            throw new StackEmptyException();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }



}