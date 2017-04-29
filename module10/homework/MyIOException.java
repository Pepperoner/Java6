package module10.homework;

import java.io.IOException;

public class MyIOException extends IOException {

    private String exceptionDescribe;

    public MyIOException ( String message ) {
        super ( message );
        exceptionDescribe = message;
    }

    public void print(){
        System.out.println ( exceptionDescribe );
    }
}
