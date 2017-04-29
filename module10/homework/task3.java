package module10.homework;

public class task3 {
    public static void main ( String[] args ) {
        Object o = null;
        try{
            assert false;
            System.out.println (o.hashCode ());
        } catch (NullPointerException e){
            System.out.println("Null Pointer Exception is caught");
        }
    }
}
