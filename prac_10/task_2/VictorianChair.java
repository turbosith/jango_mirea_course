package laby.prac_10.task_2;

import laby.prac_10.task_2.Chair;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }
    public VictorianChair(){};
    public VictorianChair(int age){
        this.age = age;
    }
}
