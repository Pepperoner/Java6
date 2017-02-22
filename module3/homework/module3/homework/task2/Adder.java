package module3.homework.module3.homework.task2;

public class Adder extends Arithmetic {
    public Adder(Integer a,Integer b) {
        this.a = a;
        this.b = b;
    }
    public static boolean check (Integer a, Integer b){
        if (a>=b)
            return true;
        else {
            return false;
        }
    }
}
