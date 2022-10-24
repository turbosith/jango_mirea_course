package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Roman", 150);
        Book b2 = new Book("Martin Iden", "Jack London");
        Book b3 = new Book();
        b3.setNumberOfPages(256);
        b1.setName("1984");
        b1.setAuthor("Djorj Oruel");
        System.out.println(b3.getNumberOfPages());
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b1.HowMuchIsRead();
        b2.HowMuchIsRead();
        b3.HowMuchIsRead();
    }
}