public class Main {
    public static void main(String[] args) {
        System.out.println("=== MyArrayList Test ===");
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1, 10);
        arrayList.remove((Integer)2);
        printList(arrayList);

        System.out.println("=== MyLinkedList Test ===");
        MyList<String> linkedList = new MyLinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add(1, "X");
        linkedList.remove("A");
        printList(linkedList);

        System.out.println("=== MyStack Test ===");
        MyStack<String> stack = new MyStack<>();
        stack.push("First");
        stack.push("Second");
        System.out.println("Top of stack: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is empty? " + stack.isEmpty());

        System.out.println("=== MyQueue Test ===");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.offer(100);
        queue.offer(200);
        System.out.println("Front of queue: " + queue.peek());
        System.out.println("Polled: " + queue.poll());
        System.out.println("Is empty? " + queue.isEmpty());

        System.out.println("=== MyMinHeap Test ===");
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.add(50);
        heap.add(20);
        heap.add(30);
        heap.add(10);
        System.out.println("Min: " + heap.peek());
        System.out.println("Polled Min: " + heap.poll());
        System.out.println("New Min: " + heap.peek());
    }

    private static <T> void printList(MyList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}

