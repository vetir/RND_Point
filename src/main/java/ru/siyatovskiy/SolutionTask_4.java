package ru.siyatovskiy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 4.	Напишите приложение на Java\Groovy, которое решает следующую задачу:
 * Имеется массив строк.
 * Необходимо определить строку, которая встречается чаще всего и вывести количество слов в данной строке.
 */

public class SolutionTask_4 {
    /**
     * Решение в "лоб" через циклы
     */
//        int count = 0;
//        int maxCount = 0;
//        String SamayaChastoPovtStroka = "";
//        for (int i = 0; i < masRow.length; i++) {
//            if (count > maxCount) {
//                maxCount = count;
//                count = 0;
//                SamayaChastoPovtStroka = masRow[i-1];
//            }
//            for (int j = 0; j < masRow.length; j++) {
//                if (masRow[i] == masRow[j]) {
//                    count++;
//                }
//            }
//        }
//        int countWordInLine = SamayaChastoPovtStroka.split(" ").length;
//        System.out.println("Самая часто повторяющаяся строка - " + SamayaChastoPovtStroka);
//        System.out.println("Количество слов в этой строке = " + countWordInLine);
//    }

    /**
     * Решение через Map
     */
    public void stringArrayParsing(String[] arrString) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arrString.length; i++) {
            map.merge(arrString[i], 1, (v1, v2) -> v1 +v2);
        }

        int maxValueInMap = (Collections.max(map.values()));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println("Самая часто повторяющаяся строка - " + entry.getKey());
                System.out.println("Количество слов в этой сроке = " + entry.getKey().split(" ").length);
            }
        }
    }
}
