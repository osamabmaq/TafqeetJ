package tafqeetj.converters;

import tafqeetj.numbers.negative.NegativeBasicNumberPlacesNames;
import tafqeetj.numbers.positive.PositiveBasicNumbersPLacesNames;

public class BasicNumberConverterFactory {
    private static final BasicNumberConverter positiveConverter =
            new BasicNumberConverter(PositiveBasicNumbersPLacesNames.getInstance());
    private static final BasicNumberConverter negativeConverter =
            new BasicNumberConverter(NegativeBasicNumberPlacesNames.getInstance());

    private BasicNumberConverterFactory() {}

    public static BasicNumberConverter getPositiveConverter() {
        return BasicNumberConverterFactory.positiveConverter;
    }

    public static BasicNumberConverter getNegativeConverter() {
        return BasicNumberConverterFactory.negativeConverter;
    }
}