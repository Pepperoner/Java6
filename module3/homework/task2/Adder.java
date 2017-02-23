package module3.homework.task2;

public class Adder extends Arithmetic {
    Integer a;
    Integer b;
    public Adder(Integer a,Integer b) {
        this.a = a;
        this.b = b;
    }
    public static boolean check (Integer a, Integer b){
        return a>=b;
    }
}
