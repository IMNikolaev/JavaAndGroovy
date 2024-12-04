import java.util.*;

public class ElementCounter {
    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> elementCount = new HashMap<>();
        for (int element : list) {
            elementCount.put(element, elementCount.getOrDefault(element, 0) + 1);
        }
        return elementCount;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> result = countElements(numbers);
        System.out.println(result);
    }
}