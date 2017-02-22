package module3.homework.module3.homework.task2;

public class Adder extends Arithmetic {
    public Adder(Integer a1,Integer b1) {
        a = a1;
        b = b1;
    }
    public static boolean check (Integer a, Integer b){
        if (a>=b)
            return true;
        else {
            return false;
        }
    }
}
