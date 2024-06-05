package dz_sem4;

public class Main {
    public static void main(String[] args) {
        Job job = new Job("Nikita", 152323, 123123, 5);
        Job job1 = new Job("Sergey", 21111, 13234, 3);
        Job job2 = new Job("Sergeyy", 123123, 1323, 3);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone(1, job);
        phoneBook.addPhone(2, job1);
        phoneBook.addPhone(3, job2);
//        phoneBook.print();
        System.out.println(phoneBook.searchPhone("Nikita"));
        System.out.println(phoneBook.searchId(1));
        System.out.println(phoneBook.searchExperince(3));
    }
}
