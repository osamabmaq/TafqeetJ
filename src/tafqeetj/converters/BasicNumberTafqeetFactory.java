package tafqeetj.converters;

import tafqeetj.numbers.negative.NegativeBasicNumberPlacesNames;
import tafqeetj.numbers.positive.PositiveBasicNumbersPLacesNames;

public class BasicNumberTafqeetFactory {
    private static final BasicNumberTafqeet positiveConverter =
            new BasicNumberTafqeet(PositiveBasicNumbersPLacesNames.getInstance());
    private static final BasicNumberTafqeet negativeConverter =
            new BasicNumberTafqeet(NegativeBasicNumberPlacesNames.getInstance());

    private BasicNumberTafqeetFactory() {
    }

    public static BasicNumberTafqeet getPositiveConverter() {
        return positiveConverter;
    }

    public static BasicNumberTafqeet getNegativeConverter() {
        return negativeConverter;
    }
}
