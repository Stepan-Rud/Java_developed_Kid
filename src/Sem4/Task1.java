package Sem4;

import java.util.*;

/**
 * В рамках выполнения задачи необходимо:
 * Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
 * Получите уникальный список Set на основании List
 * Определите наименьший элемент (алфавитный порядок)
 * Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
 * Удалите все элементы содержащие букву ‘A’
 */
public class Task1 {
    private List<String> list;
    private TreeSet threeSet;
    private String min;
    private String max;

    public Task1() {
        this.list = new ArrayList<>();
        this.threeSet = new TreeSet(list);
    }
    public void listAdd(String name){
        list.add(name);
    }
    public List<String> getList() {
        return list;
    }
    public void listSet(){
        threeSet = new TreeSet(Arrays.asList(list.toArray()));
    }
    public String minValuesSet(){
        return (String) threeSet.first();
    }
    public String maxValuesSet(){
        return (String) threeSet.last();
    }
    public String minLenghtValues(){
        min = list.get(0);
        for (String s : list) {
            if (s.length() < min.length()) {
                min = s;
            }
        }
//      min = threeSet.stream().min(Comparator.comparing(String::length));
        return min;
    }
    public void deleteAllA(){
        list.removeIf(s -> s.toLowerCase(Locale.ROOT).contains("a"));
    }
}
