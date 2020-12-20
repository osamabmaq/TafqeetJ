package tafqeetj.numbers.positive;

import tafqeetj.numbers.BasicNumberPlacesNames;

import java.util.Map;

public class PositiveBasicNumbersPLacesNames extends BasicNumberPlacesNames {

    private static PositiveBasicNumbersPLacesNames instance;
    private PositiveBasicNumbersPLacesNames() {}

    public synchronized static PositiveBasicNumbersPLacesNames getInstance() {
        if (instance == null)
            instance = new PositiveBasicNumbersPLacesNames();
        return instance;
    }
}