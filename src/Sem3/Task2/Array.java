package Sem3.Task2;

import java.util.Arrays;
import java.util.Iterator;

public class Array <T> implements Iterable<T> {
    private T[] array;
    private static final int DEFAULT_SIZE = 10;
    int size = 0;
    T elem;

    public Array() {
        array = (T[]) new Object[DEFAULT_SIZE];
    }
    public void add(T value){
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = value;
    }
    public T get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }
    public void remove(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
    }

    public String printArrayElem() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T t : this) {
            stringBuilder.append(t + " ");
        }
        return stringBuilder.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {

                return index < size;
            }

            @Override
            public T next() {
                return array[index] == null ? null : array[index++];
            }
        };
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + this.printArrayElem() +
                ", size=" + size +
                '}';
    }
}

