package Heap;

import java.util.ArrayList;

class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {// passing of index in argument
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {// it return parent index;
        return (index - 1) / 2;
    }

    private int left(int index) {// it return left index
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(T value) {
        list.add(value);
        upheal(list.size() - 1);
    }

    public void upheal(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upheal(p);
        }

    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("no element found");
        }
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return temp;

    }

    public void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);
        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;

        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
min = right;
        }
        if (min != index) {
            swap(min, index);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
        heap.insert(100);
        heap.insert(1);
        System.err.println(heap.remove());
        ArrayList list = heap.heapSort();
        System.out.println(list);

    }
}
