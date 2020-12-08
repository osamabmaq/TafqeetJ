package tafqeetj.converters;

import tafqeetj.numbers.NumberSign;
import tafqeetj.numbers.ThreeDigitsNumber;

import java.util.*;

public class NumberToThreeDigitsNumberGroupsDivider {
    private static final List<String> groupsNames = List.of(
            "basicNumberGroup", "thousands", "millions", "billions", "trillions"
    );

    public Map<String, ThreeDigitsNumber> divide(long number) {
        List<ThreeDigitsNumber> numbersGroups =
                getThreeDigitsNumberList(Long.toString(Math.abs(number)), NumberSign.signOf(number));
        return mapWithGroupsNames(numbersGroups);
    }

    private List<ThreeDigitsNumber> getThreeDigitsNumberList(String number, NumberSign sign) {
        List<ThreeDigitsNumber> numbersGroups = new ArrayList<>();
        for (int i = number.length(), k = i - 3; i > 0; k = i - 3) {
            if (k < 0)
                k = 0;
            numbersGroups.add(createThreeDigitsNumberOf(number.substring(k, i), sign));
            i -= 3;
        }
        return numbersGroups;
    }

    private ThreeDigitsNumber createThreeDigitsNumberOf(String number, NumberSign sign) {
        return ThreeDigitsNumber.of(Short.parseShort(number), sign);
    }

    private Map<String, ThreeDigitsNumber> mapWithGroupsNames(List<ThreeDigitsNumber> numbersGroups) {
        Map<String, ThreeDigitsNumber> numbersGroupsMap = new HashMap<>();
        for (int i = 0; i < numbersGroups.size(); i++)
            numbersGroupsMap.put(groupsNames.get(i), numbersGroups.get(i));
        return Collections.unmodifiableMap(numbersGroupsMap);
    }
}