package Factory;

public class TaskFactory {

    public static Task createTask(String studentType) {

        switch (studentType.toLowerCase()) {

            case "вундеркинд":
                return new FunTask();

            case "фитнес маниак":
                return new ImpossibleTask();

            case "калитко":
                return new EasyTask();

            default:
                throw new IllegalArgumentException("Непознат тип студент.");
        }
    }
}