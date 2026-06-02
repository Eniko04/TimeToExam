package Decorator;

public class Telepathy extends StudentDecorator {

    public Telepathy(Student decoratedStudent) {
        super(decoratedStudent);
    }

    @Override
    public void takeExam() {

        super.takeExam();

        System.out.println("Получена суперсила: Телепатия.");
    }
}
