package oivan.principal;

public class DivisionByCeroException extends Exception {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public DivisionByCeroException(String errorMessage){
        System.out.println(ANSI_RED + errorMessage + ANSI_RESET);
    }
}



