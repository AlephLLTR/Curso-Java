package Aula6.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        Set<Integer> setA = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> setB = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));


        // União
        Set<Integer> union = new TreeSet<>(setA);
        union.addAll(setB);
        System.out.println(union);
        
        // Intersecção
        Set<Integer> intersection = new TreeSet<>(setA);
        intersection.retainAll(setB);
        System.out.println(intersection);
        
        // Diferença
        Set<Integer> difference = new TreeSet<>(setA);
        difference.removeAll(setB);
        System.out.println(difference);
    }
}
