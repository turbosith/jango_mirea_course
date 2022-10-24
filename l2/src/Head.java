import java.util.Scanner;

public class Head {
    int numberOfTeeth;

    public void milkTeeth (boolean haveMilkTeeth) {
        if (haveMilkTeeth == true) {
            numberOfTeeth = 32;

        } else {

            numberOfTeeth = 28;
        }
    }

    public void snatchTeeth() {
        System.out.println("Сколько зубов вырвать?");
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        this.numberOfTeeth -= n;
        if (this.numberOfTeeth < 0) {
            System.out.println("Ошибка: отрицательный возраст не возможен");
            this.numberOfTeeth = 0;
        }
    }
    public void getTeeth(){
        System.out.println("Колличество зубов "+this.numberOfTeeth);
    }
}
