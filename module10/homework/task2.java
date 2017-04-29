package module10.homework;

public class task2 {
    public static void main(String[] args) {

        try {
           throw new MyArithmeticException("Throw new MyArithmeticException.");
        } catch (MyArithmeticException e) {
           e.print();
           System.out.println("Catch new " + e.getClass().getSimpleName() + ".");
        } catch (RuntimeException e) {
           System.out.println("This will never happen.");
        }

        System.out.println();

        try {
            throw new MyArithmeticException ( "Throw MyArithmeticException." );
        } catch (Error e) {
            System.out.println ( "This will never happen." );
        } catch (ArithmeticException e) {
            System.out.println ( "Catch again " + e.getClass ( ).getSimpleName ( ) + "." );
        }
   }
}

