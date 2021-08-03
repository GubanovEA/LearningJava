package Map_Task;

import java.util.HashMap;
import java.util.Map;

public class RepeatingNumbers {
    public void checkRepeatingNumbers(Integer[] numbArray) {
        Map<Integer, Integer> repeatingNumbers = new HashMap<>();

        for (Integer element: numbArray){
            int counter = repeatingNumbers.getOrDefault(element, 0) + 1;
            repeatingNumbers.put(element, counter);
        }
        System.out.println(repeatingNumbers);
    }

}
