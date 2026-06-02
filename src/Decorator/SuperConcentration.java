package Decorator;

public class SuperConcentration extends StudentDecorator {

    public SuperConcentration(Student decoratedStudent) {
        super(decoratedStudent);
    }

    @Override
    public void takeExam() {

        super.takeExam();
        System.out.println("Получена суперсила: Свръхконцентрация.");
    }
}
