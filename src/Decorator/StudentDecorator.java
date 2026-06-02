package Decorator;

abstract class StudentDecorator implements Student {

    protected Student decoratedStudent;

    public StudentDecorator(Student decoratedStudent) {

        this.decoratedStudent = decoratedStudent;
    }

    @Override
    public void takeExam() {
        decoratedStudent.takeExam();
    }
}