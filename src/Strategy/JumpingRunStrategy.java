package Strategy;

public class JumpingRunStrategy implements ArrivalStrategy{

    @Override
    public void arrive() {
        System.out.println("Студентът пристига с тичане и подскачане.");
    }
}
