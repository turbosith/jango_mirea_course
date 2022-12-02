package laby.prac_10.task_2;

public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        FunctionalChair chair= chairFactory.createFunctionalChair();
        System.out.println(chair.sum(2,3));
        VictorianChair chair2= chairFactory.createVictorianChair();
        System.out.println(chair2.getAge());
        MagicianChair chair3= chairFactory.createMagicianChair();
        chair3.doMagic();

    }
}
