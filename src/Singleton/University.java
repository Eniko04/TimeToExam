package Singleton;

public class University {

    private static University instance;

    private University() {
        System.out.println("Университетът е създаден.");
    }


    public static University getInstance() {

        if (instance == null) {

            instance = new University();
        }
        return instance;
    }

    public void startExam() {
        System.out.println("\nКонтролното започва!");
    }
}