package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        HashMap<String, Integer> _collectionA = new HashMap<>();
        for (String item : collectionA) {
            if (item.contains("-")) {
                String key = item.substring(0, 1);
                Integer value = Integer.valueOf(item.substring(2));
                PracticeD.setValueForMap(_collectionA, key, value);
            } else {
                PracticeD.setValueForMap(_collectionA, item, 1);
            }
        }

        return PracticeD.createUpdatedMap(_collectionA, object);
    }

    static void setValueForMap(HashMap<String, Integer> map, String key, Integer value) {
        if (map.get(key) == null) {
            map.put(key, value);
        } else {
            map.put(key, map.get(key) + value);
        }
    }

    static Map<String, Integer> createUpdatedMap(Map<String, Integer> mapA, Map<String, List<String>> mapB) {
        HashMap<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mapA.entrySet()) {
            if (mapB.get("value").contains(entry.getKey())) {
                int num = entry.getValue() / 3;
                result.put(entry.getKey(), entry.getValue() >= 3 && num >= 0 ? entry.getValue() - num : entry.getValue());
            } else {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}
