package ru.mail.arseniy;

public class Main {
    public static void main(String[] args) {
        People people = new People(5, "qwerty");
        System.out.println(people);
        for (int i = 0; i <= 100; i++) {

            People people1 = new People(i, "ksdjbckj" + i);
            if (i % 2 == 1) {
                System.out.println(people1);

            }
        }
    }
}
