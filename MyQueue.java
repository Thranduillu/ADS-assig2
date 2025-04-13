public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void offer(T element) {
        list.add(element); // добавить в конец
    }

    public T poll() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return list.remove(0); // удалить из начала
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return list.get(0); // посмотреть на начало
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }
}
