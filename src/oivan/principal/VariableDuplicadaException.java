package oivan.principal;

public class VariableDuplicadaException extends Exception {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public VariableDuplicadaException(String errorMessage){
        System.out.println(ANSI_RED + errorMessage + ANSI_RESET);
    }
}
