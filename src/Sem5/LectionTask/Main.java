package Sem5.LectionTask;

public class Main {
    public static void main(String[] args) {
        TicTak ticTak = new TicTak(5);
        TicTak ticTak1 = new TicTak(10);
        TicTak ticTak2 = new TicTak(15);
        ticTak.start();
        ticTak1.start();
        ticTak2.start();
    }
}
