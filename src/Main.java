

public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(34);
        myArrayList.add(45);
        myArrayList.add(43);
        printArray(myArrayList);

        myArrayList.set(1, 14);
        printArray(myArrayList);

        myArrayList.add(1, 10);
        printArray(myArrayList);

        myArrayList.addFirst(55);
        printArray(myArrayList);

        myArrayList.addLast(45);
        printArray(myArrayList);


        System.out.println(myArrayList.get(2));


        System.out.println(myArrayList.getFirst());


        System.out.println(myArrayList.getLast());


        myArrayList.remove(2);
        printArray(myArrayList);


        myArrayList.removeFirst();
        printArray(myArrayList);


        myArrayList.removeLast();
        printArray(myArrayList);


        System.out.println("Check sort");
        myArrayList.sort();
        printArray(myArrayList);


        System.out.println(myArrayList.indexOf(14));


        System.out.println(myArrayList.lastIndexOf(14));


        System.out.println(myArrayList.exists(14));


        myArrayList.clear();
        printArray(myArrayList);

        System.out.println(myArrayList.size());


        System.out.println("------------------------------------------------------------------------------------------------------");




        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(34);
        myLinkedList.add(45);
        myLinkedList.add(43);
        printArray(myLinkedList);

        myLinkedList.set(1, 14);
        printArray(myLinkedList);

        myLinkedList.add(1, 10);
        printArray(myLinkedList);

        myLinkedList.addFirst(55);
        printArray(myLinkedList);

        myLinkedList.addLast(45);
        printArray(myLinkedList);


        System.out.println(myLinkedList.get(2));


        System.out.println(myLinkedList.getFirst());


        System.out.println(myLinkedList.getLast());


        myLinkedList.remove(2);
        printArray(myLinkedList);


        myLinkedList.removeFirst();
        printArray(myLinkedList);


        myLinkedList.removeLast();
        printArray(myLinkedList);


        System.out.println("Check sort");
        myLinkedList.sort();
        printArray(myLinkedList);


        System.out.println(myLinkedList.indexOf(14));


        System.out.println(myLinkedList.lastIndexOf(14));


        System.out.println(myLinkedList.exists(14));


        myLinkedList.clear();
        printArray(myLinkedList);


        System.out.println(myLinkedList.size());

    }

    public static void printArray(Iterable<Integer> arr) {
        for (Object object : arr) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}