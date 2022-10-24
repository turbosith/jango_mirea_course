import java.util.Scanner;

public class Human {
    int age;

    public Human(int age, Head head, Leg leg, Hand hand) {
        this.age = age;
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public void makeOld(){
    System.out.println("На сколько состарить человека?");
    int n;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    this.age+=n;


}
    public void makeYoung(){
        System.out.println("На сколько омолодить человека?");
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        this.age-=n;
        if (this.age<0){
            System.out.println("Ошибка: отрицательный возраст не возможен");
            this.age=0;
        }
    }
    private Head head;
    private Leg leg;
    private Hand hand;

    public void getAge() {
        System.out.println("Возраст "+this.age);
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeg() {
        return leg;
    }

    public Hand getHand() {
        return hand;
    }
}
