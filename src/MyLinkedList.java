import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {

    private class Node<E> {
        E data;
        Node next;
        Node prev;

        public Node() {
            data = null;
            next = null;
            prev = null;
        }

        public Node (E data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public Node(E data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, T data) {
        validateIndex(index);
        Node newNode = new Node(data);
        if (index == size) {
            add(data);
        } else if (index == 0) {
            Node oldHead = head;
            head = newNode;
            head.next = oldHead;
            oldHead.prev = head;
            size++;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    @Override
    public void addFirst(T data) {
        add(0, data);
    }

    @Override
    public void addLast(T data) {
        add(data);
    }

    @Override
    public void set(int index, T data) {
        validateIndex(index);
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = data;
    }

    @Override
    public T get(int index) {
        validateIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (T) current.data;
    }

    @Override
    public T getFirst() {
        return (T) head.data;
    }

    @Override
    public T getLast() {
        return (T) tail.data;
    }

    @Override
    public void remove(int index) {
        validateIndex(index);
        if (index == 0) {
            head = head.next;
            head.prev = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.next.prev = current.prev;
            current.prev.next = current.next;
        }
        size--;
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(size - 1);
    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    private void validateIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}