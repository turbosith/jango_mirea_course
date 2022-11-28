package laby.prac_10.task_2;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicianChair createMagicianChair();
    public FunctionalChair createFunctionalChair();
}
