package module10.homework;


public class task5 {

    public static void main ( String[] args ) {

        try {
            throwsTreeExceptions();
        } catch (MyNumberFormatException | MyNullPointerException | MyIOException e) {
            System.out.println ("Catching exceptions" );
        }
    }

    private static void throwsTreeExceptions () throws MyIOException {

        try{
            throw new MyNumberFormatException ( );
        } catch (MyNumberFormatException e){
            try{
                throw new MyNullPointerException();
            } catch (MyNullPointerException e1){
            }
        }
        throw new MyIOException("Throw MyIOException.");
    }
}
