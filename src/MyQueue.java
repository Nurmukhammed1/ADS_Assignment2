public class MyQueue<T extends Comparable<T>> {

    MyArrayList<T> queue = new MyArrayList<>();

    public T dequeue() { // gets the first item and removes it
        T item = queue.get(0);
        queue.remove(0);
        return item;
    }

    public void enqueue(T item) { // adds item to the first
        queue.add(item);
    }

    public boolean isEmpty() { // checks if it is empty or not
        return queue.size() == 0;
    }
    public int size() { //gets size
        return queue.size();
    }
}
