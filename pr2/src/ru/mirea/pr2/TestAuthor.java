package ru.mirea.pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Stiven King", "king.s@mail.ru", 'm');
        Author a2 = new Author("Ain Rand", "rand.rand.123@gmail.com", 'w');
        System.out.println(a1);
        System.out.println(a2);
        a1.setEmail("king.gmail.com");
        System.out.println(a1.getEmail());
        System.out.println(a2.getName()+" "+ a2.getGender());


    }

}
