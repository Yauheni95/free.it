package by.freee.it.exceptions;

public class MyException extends Exception {
    private final String message;

    @Override
    public String getMessage() {
        return message;
    }

    public MyException(String message) {
        this.message = message;

    }
}
