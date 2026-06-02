package Decorator;


import Factory.Task;
import Factory.TaskFactory;
import Strategy.ArrivalStrategy;

public class BasicStudent implements Student{

    private String name;
    private String type;
    private ArrivalStrategy strategy;

    public BasicStudent(String name, String type, ArrivalStrategy strategy) {

        this.name = name;
        this.type = type;
        this.strategy = strategy;
    }

    @Override
    public void takeExam() {

        System.out.println("\nСтудент: " + name);
        System.out.println("Тип: " + type);

        strategy.arrive();

        Task task = TaskFactory.createTask(type);

        task.solve();
    }
}
