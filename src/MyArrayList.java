public class MyArrayList {
    private int[] array;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList() { array = new int[capacity]; }

    public int get(int index) { return array[index]; }

    public void add(int newItem) {
        if (size == capacity) {
            increaseBuffer();
        }
        array[size++] = newItem; 
    }

    private void increaseBuffer() {
        capacity = (int) (1.5 * capacity);
        int[] array2 = new int[capacity];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    public int getSize() { return size; }
}
