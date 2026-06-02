package Decorator;

public class FastWriting extends StudentDecorator {

    public FastWriting(Student decoratedStudent) {
        super(decoratedStudent);
    }

    @Override
    public void takeExam() {

        super.takeExam();

        System.out.println("Получена суперсила: Бързопис.");
    }
}