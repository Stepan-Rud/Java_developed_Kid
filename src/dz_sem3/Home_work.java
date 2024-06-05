package dz_sem3;

public class Home_work {
//    1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
//    sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
//    над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
//    2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
//    если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
//    но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
//    3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
//    Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из
//    составляющих пары, а также переопределение метода toString(), возвращающее строковое
//    представление пары. Работу сдать в виде ссылки на гит репозиторий.
public static void main(String[] args) {

    Pair<Integer, String> pair = new Pair<>(1, "Hello");
    System.out.println(pair.toString());
    Calculatorr calculator = new Calculatorr();
    Number a = calculator.divide(1, 2.05);
    System.out.println(a.doubleValue());

    Integer[] arr1 = {1, 2, 3, 4, 5};
    Double[] arr2 = {1.2, 2.2, 3.1, 4.3, 5.2};
    System.out.println(CompareArrays.compareArrays(arr1, arr2));
}
public static void table(double number) {
    for (int i = 1; i <= 10; i++) {
         number = number - 0.0075;
         number = Math.round(number * 10000) / 10000.0;
        System.out.println(number);
    }
}
}
