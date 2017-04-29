package module10.homework;

public class task1 {

    public static void main(String[] args) {
    try{
        throw new Exception ( "Throw Exception." );
    } catch (Exception e){
        System.out.println (e);
    } finally {
        System.out.println ("Exception is caught" );
    }
}
}
