package by.ushenkoDmitry.codewars.countingDuplicates.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingDuplicatesService {

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        List<Character> characters = toList(text);
        Map<Character, Integer> map = new HashMap<>();
        Integer duplicates = 0;
        characters.forEach(ch -> {
            if (!map.containsKey(ch)) {
                map.put(ch, 0);
            }
            map.replace(ch, map.get(ch) + 1);
        });
        for (Map.Entry<Character, Integer> entry : map.entrySet())
            if (entry.getValue() > 1) duplicates++;
        return duplicates;
    }

    private static List<Character> toList(String string) {
        List<Character> list = new ArrayList<>();
        for (char ch : string.toCharArray()) {
            list.add(ch);
        }
        return list;
    }
}
