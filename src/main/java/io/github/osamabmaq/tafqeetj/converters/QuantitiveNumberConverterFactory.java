package io.github.osamabmaq.tafqeetj.converters;

public interface QuantitiveNumberConverterFactory {
    QuantitiveNumberConverter getConverter(String tafqeetClass);
}