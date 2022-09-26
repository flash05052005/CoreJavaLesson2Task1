package CoreJavaLesson2Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Integer[] array = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

        Collections.addAll(intList, array);
        List<Integer> intListCopy = new ArrayList<>(intList);

        Iterator<Integer> iterator = intListCopy.iterator();
        while (iterator.hasNext()) {
            Integer result = iterator.next();
            if(result <= 1 || result % 2 != 0 ) iterator.remove();
        }

        Collections.sort(intListCopy);

        for (int resultList : intListCopy) {
            System.out.println(resultList);
        }
    }
}
