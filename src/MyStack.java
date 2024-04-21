import java.util.Iterator;

public class MyStack<T> {

    private MyLinkedList<T> list = new MyLinkedList<>();

    public T push(T item) { // push or add new data
        list.addFirst(item);
        return item;
    }

    public T peek(){ return list.get(0); }

    public T pop(){ // Removes the head of the linked list
        T removingItem = peek();
        list.removeFirst();
        return removingItem;
    }

    public boolean empty(){ // Returns whether the stack is empty
        return list.size() == 0;
    }
    public int size() { // Returns the size of the stack
        return list.size();
    }
}
