package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        HashMap<String, Integer> result = new HashMap<>();
        for (String item : collection1) {
            if (item.contains("-")) {
                String key = item.substring(0, 1);
                Integer value = Integer.valueOf(item.substring(2));
                PracticeB.setValueForMap(result, key, value);
            } else {
                PracticeB.setValueForMap(result, item, 1);
            }
        }
        return result;
    }

    static void setValueForMap(HashMap<String, Integer> map, String key, Integer value) {
        if (map.get(key) == null) {
            map.put(key, value);
        } else {
            map.put(key, map.get(key) + value);
        }
    }
}
