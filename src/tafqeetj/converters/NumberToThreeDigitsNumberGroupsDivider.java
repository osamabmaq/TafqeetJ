package tafqeetj.converters;

import tafqeetj.numbers.ThreeDigitsNumber;

import java.util.*;

public class NumberToThreeDigitsNumberGroupsDivider {
    private static List<String> groupsNames = List.of(
            "basicNumberGroup", "thousands", "millions", "billions", "trillions"
    );

    public Map<String, ThreeDigitsNumber> divide(int number) {
        List<ThreeDigitsNumber> numbersGroups = getThreeDigitsNumberGroupsList(Integer.toString(number));
        Map<String, ThreeDigitsNumber> numbersGroupsMap = new HashMap<>();
        for (int i = 0; i < numbersGroups.size(); i++)
            numbersGroupsMap.put(groupsNames.get(i), numbersGroups.get(i));
        return numbersGroupsMap;
    }

    private List<ThreeDigitsNumber> getThreeDigitsNumberGroupsList(String number) {
        List<ThreeDigitsNumber> numbersGroups = new ArrayList<>();
        for (int i = number.length(), k = i - 3; i > 0; k = i - 3) {
            if (k < 0)
                k = 0;
            String subNumber = number.substring(k, i);
            i -= 3;
            if (subNumber.length() == 1)
                subNumber = "00" + subNumber;
            else if (subNumber.length() == 2)
                subNumber = "0" + subNumber;
            numbersGroups.add(ThreeDigitsNumber.of(Integer.parseInt(subNumber)));
        }
        return numbersGroups;
    }
}