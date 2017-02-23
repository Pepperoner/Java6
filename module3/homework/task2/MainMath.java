package module3.homework.task2;

public class MainMath {
    public static void main(String[] args) {
        Adder adder = new Adder(10,20);
        System.out.println(adder.check(adder.a, adder.b));
        System.out.println(adder.add(adder.a,adder.b));
    }
}
