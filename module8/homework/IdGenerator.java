package module8.homework;


public class IdGenerator {

    private static long counter;

    private IdGenerator () {
    }

    public static long idGenerate () {
        return ++counter;
    }
}
