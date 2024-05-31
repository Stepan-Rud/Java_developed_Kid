package dz_sem3;

public class Pair <T, V>{
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%s[first: %s, second: %s]", Pair.class.getName(), first.toString(), second.toString());
    }
}
