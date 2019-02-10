import java.util.Arrays;

public class IntDynamicArray {
    private int[] array;

    public int getSize() {
        return size;
    }

    private int size = 0;

    public void removeEmptySlots() {
        array = Arrays.copyOf(array, size);
    }

    public IntDynamicArray(int startingSize) {
        this.array = new int[startingSize];
    }

    public int get(int index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bound!");
        }

        return array[index];
    }

    public void remove(int index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bound!");
        }
        for (int i = index+1; i < array.length ; i++) {
            array[i-1] = array[i];
        }
        size--;
    }

    public void add(int number) {
        if(size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = number;
        size++;
    }
}
