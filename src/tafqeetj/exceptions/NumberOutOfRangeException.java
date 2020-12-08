package tafqeetj.exceptions;

import static tafqeetj.converters.NumberConversionRange.MAX_ACCEPTED_VALUE;
import static tafqeetj.converters.NumberConversionRange.MIN_ACCEPTED_VALUE;

public class NumberOutOfRangeException extends RuntimeException{
    public NumberOutOfRangeException(){
        super("Out of range value, must be between " + MIN_ACCEPTED_VALUE + " and " + MAX_ACCEPTED_VALUE);
    }
}