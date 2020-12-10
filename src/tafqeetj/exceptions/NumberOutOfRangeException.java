package tafqeetj.exceptions;

public class NumberOutOfRangeException extends RuntimeException {
    public NumberOutOfRangeException() {
        super("Out of range value");
    }
}