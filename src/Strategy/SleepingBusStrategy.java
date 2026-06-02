package Strategy;

public class SleepingBusStrategy implements ArrivalStrategy{
    @Override
    public void arrive() {
        System.out.println("Студентът пристига след спане в автобуса.");
    }
}
