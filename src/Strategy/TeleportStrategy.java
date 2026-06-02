package Strategy;

public class TeleportStrategy implements ArrivalStrategy{
    @Override
    public void arrive() {
        System.out.println("Студентът се телепортира.");
    }
}
