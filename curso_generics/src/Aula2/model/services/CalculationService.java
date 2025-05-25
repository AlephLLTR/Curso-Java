package Aula2.model.services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if (!list.isEmpty()) {
            T max = list.get(0);
            for (T item : list) {
                if (item.compareTo(max) > 0) {
                    max = item;
                }
            }
            return max;
        }
        throw new IllegalStateException("List cannot be empty.");
    }
}
