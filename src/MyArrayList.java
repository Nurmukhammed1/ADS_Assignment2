import java.util.Iterator;

public class MyArrayList <T extends Comparable<T>> implements MyList<T> {
    private Object[] array;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList() { array = new Object[capacity]; }

    @Override
    public void add(T newItem) {
        if (size == capacity) {
            increaseBuffer();
        }
        array[size++] = newItem; 
    }

    @Override
    public void set(int index, T item) { array[index] = item; }

    @Override
    public void add(int index, T newItem) {
        if (size == capacity) {
            increaseBuffer();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = newItem;
        size++;
    }

    private void increaseBuffer() {
        capacity = (int) (1.5 * capacity);
        Object[] array2 = new Object[capacity];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    @Override
    public void addFirst(T item) { add(0, item); }
    @Override
    public void addLast (T item) { add(item);}

    @Override
    public T get(int index) { return (T) array[index]; }

    @Override
    public T getFirst() { return (T) array[0]; }
    @Override
    public T getLast() { return (T) array[size - 1]; }

    @Override
    public void remove(int index) {
        Object temp;
        for (int i = index; i < size; i++) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        array[size-1] = null;
        size--;
    }

    @Override
    public void removeFirst() { remove(0); }
    @Override
    public void removeLast() { remove(size - 1); }

    @Override
    public void sort() {
        Object temp;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < j - i - 1; j++) {
                if (((Comparable)array[i]).compareTo(array[i+1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] array2 = new Object[size];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    @Override
    public void clear() {
        capacity = 5;
        array = new Object[capacity];
    }

    @Override
    public int size() { return size; }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public T next() {
            return (T) array[cursor++];
        }
    }

}
