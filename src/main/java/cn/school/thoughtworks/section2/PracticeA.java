package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        return collection1.stream().collect(Collectors.toMap(s->s, s->1, Integer::sum));
    }
}
