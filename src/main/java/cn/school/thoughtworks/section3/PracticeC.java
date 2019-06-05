package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> _collectionA = collectionA.stream().collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        return PracticeC.createUpdatedMap(_collectionA, object);
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
