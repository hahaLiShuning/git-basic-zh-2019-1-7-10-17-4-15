package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<>();
        collection2.forEach(list -> result.addAll(collection1.stream().filter(item -> list.contains(item)).collect(Collectors.toList())));
        return result;
    }
}
