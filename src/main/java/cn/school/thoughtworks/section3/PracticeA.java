package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        HashMap<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : collectionA.entrySet()) {
            if (object.get("value").contains(entry.getKey())) {
                result.put(entry.getKey(), entry.getValue() - 1);
            } else {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}
