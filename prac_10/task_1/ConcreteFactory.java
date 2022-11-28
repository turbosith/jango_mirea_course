package laby.prac_10.task_1;

import laby.prac_10.task_1.Complex;
import laby.prac_10.task_1.ComplexAbstractFactory;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real, image);
    }
}
