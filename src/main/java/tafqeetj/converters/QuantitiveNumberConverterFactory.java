package tafqeetj.converters;

public interface QuantitiveNumberConverterFactory {
    QuantitiveNumberConverter getConverter(String tafqeetClass);
}