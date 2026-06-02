import Decorator.*;
import Singleton.*;
import Factory.*;
import Strategy.*;

public class Main {

    public static void main(String[] args) {

        University university = University.getInstance();

        university.startExam();

        Student student1 =
                new SuperConcentration(
                        new BasicStudent(
                                "Иван",
                                "вундеркинд",
                                new JumpingRunStrategy()
                        )
                );


        Student student2 =
                new FastWriting(
                        new BasicStudent(
                                "Петър",
                                "фитнес маниак",
                                new TeleportStrategy()
                        )
                );


        Student student3 =
                new Telepathy(
                        new BasicStudent(
                                "Гошо",
                                "калитко",
                                new SleepingBusStrategy()
                        )
                );


        student1.takeExam();
        student2.takeExam();
        student3.takeExam();
    }
}