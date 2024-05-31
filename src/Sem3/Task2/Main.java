package Sem3.Task2;

public class Main {
    public static void main(String[] args) {

        Array<String> array = new Array<>();
        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");
        array.add("5");
        array.add("6");
        array.add("7");
        array.add("8");
        array.add("9");
        array.add("10");
        array.remove(3);
        array.remove(4);
        array.remove(5);
        array.remove(6);

        System.out.println(array);
    }
}
