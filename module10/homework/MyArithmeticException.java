package module10.homework;


public class MyArithmeticException extends ArithmeticException {

    private String exceptionDescribe;
    public MyArithmeticException ( String s ) {
        super ( s );
        exceptionDescribe = s;
    }

    public void print(){
        System.out.println ( exceptionDescribe );
    }
}
