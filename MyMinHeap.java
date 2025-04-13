public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public void add(T element) {
        heap.add(element);
        siftUp(heap.size() - 1);
    }

    public T poll() {
        if (isEmpty()) throw new IllegalStateException("Heap is empty");
        T root = heap.get(0);
        T last = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.add(0, last);
            siftDown(0);
        }
        return root;
    }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("Heap is empty");
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public void clear() {
        heap.clear();
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T current = heap.get(index);
            T parent = heap.get(parentIndex);
            if (current.compareTo(parent) >= 0) break;

            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void siftDown(int index) {
        int size = heap.size();
        while (index < size) {
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int smallest = index;

            if (left < size && heap.get(left).compareTo(heap.get(smallest)) < 0) {
                smallest = left;
            }

            if (right < size && heap.get(right).compareTo(heap.get(smallest)) < 0) {
                smallest = right;
            }

            if (smallest == index) break;

            swap(index, smallest);
            index = smallest;
        }
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.add(i, heap.get(j));
        heap.remove(i + 1);
        heap.add(j, temp);
        heap.remove(j + 1);
    }
}

