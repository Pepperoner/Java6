package module10.homework;

import java.io.IOException;

public class task4 {
    public static void main(String[] args) throws IOException {
        f();
    }

    private static void g() {
        throw new MyArithmeticException("Throw MyArithmeticException in g().");
    }

    private static void f() throws IOException {
        try {
            g();
        } catch (MyArithmeticException e) {
            e.print();
            MyIOException my = new MyIOException("Will throw MyIOException but will not catch it");
            my.print();
            throw my;
        }
    }
}

