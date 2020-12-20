package tafqeetj.numbers.negative;

import tafqeetj.numbers.BasicNumberPlacesNames;

import java.util.HashMap;
import java.util.Map;

public class NegativeBasicNumberPlacesNames extends BasicNumberPlacesNames {
    private static NegativeBasicNumberPlacesNames instance;

    private NegativeBasicNumberPlacesNames() {}

    public synchronized static NegativeBasicNumberPlacesNames getInstance() {
        if (NegativeBasicNumberPlacesNames.instance == null) {
            NegativeBasicNumberPlacesNames.instance = new NegativeBasicNumberPlacesNames();
        }
        return NegativeBasicNumberPlacesNames.instance;
    }
}