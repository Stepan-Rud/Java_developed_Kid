package Sem3.Task1;

import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) {
        Task1<String, DataInputStream, Number> task1 = new Task1<>("Hello", new DataInputStream(System.in), 1);
        task1.printNames();
    }
}
