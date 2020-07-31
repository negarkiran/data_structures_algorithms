package datastructures.array.dynamicarray;

public class DynamicArray<T> {
    private T[] array;
    private int size = 0;
    private int capacity;

    public DynamicArray() {
        this(5);
    }

    public DynamicArray(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return array[index];
    }

    public void set(int index, T element) {
        array[index] = element;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public T[] getArray() {
        return array;
    }

    public void add(T element) {
        if (size < capacity) {
            this.array[size++] = element;
        } else {
            resize();
            this.array[size++] = element;
        }
    }

    public void removeAt(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();

        T[] newArray = (T[]) new Object[size - 1];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                continue;
            }
            newArray[counter++] = array[i];
        }
        array = newArray;
        size = counter;
    }

    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)){
                return  i;
            }
        }
        return -1;
    }

    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    private void resize() {
        T[] newArray = (T[]) new Object[capacity * 2];
        int newSize = 0;
        for (T item : array) {
            newArray[newSize++] = item;
        }
        array = newArray;
        size = newSize;
        capacity = capacity * 2;
    }
}
